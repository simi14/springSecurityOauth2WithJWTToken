package com.softvanTasks.task2.config.security;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Bean;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

public class UserDetailsServiceImpl implements UserDetailsService{

	Map<String,User> userMap;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=userMap.get(username);
		if(user==null) {return null;}
		return new User(user.getUsername(), user.getPassword(), user.getAuthorities());
	}
	
	@PostConstruct
	public void initializeUsers() {
		User adminUser = new User("admin@gmail.com", "{noop}admin", Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"))); 
		User normalUser = new User("normal@gmail.com", "{noop}normal", Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"))); 
		userMap = new HashMap<>(); 
		userMap.put(adminUser.getUsername(), adminUser); 
		userMap.put(normalUser.getUsername(), normalUser); 
	}
	
	

}
