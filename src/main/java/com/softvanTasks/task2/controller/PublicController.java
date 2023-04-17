package com.softvanTasks.task2.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("public")
public class PublicController {

	@RequestMapping(value = "", method = RequestMethod.GET) 
	public Map <String, String> getPublicData() { 
	Map<String, String> map = new HashMap<>(); 
	map.put("Welcome", "everyone"); 
	map.put("Access", "Only to public sites"); 
	return map; }
}
