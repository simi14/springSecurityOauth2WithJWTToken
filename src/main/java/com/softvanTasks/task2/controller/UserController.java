package com.softvanTasks.task2.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

	@RequestMapping(value = "", method = RequestMethod.GET) 
	public Map<String, String> getUserData() { 
	Map<String, String> map = new HashMap<>(); 
	map.put("Welcome", "user"); 
	map.put("Access", "You have limited access"); 
	return map; } 
}
