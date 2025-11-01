package com.rk.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {
	
	@Autowired
	public DataService dataService;
	
	
	@GetMapping(value = "/getMultipleProperty")
	public MultipleProperty getMultipleProperty() {
		
		return dataService.getProperties();
	}
	
	@GetMapping(value = "/getUrlName")
	public String getUrlName() {
		
		return dataService.getUrlName();
	}

}
