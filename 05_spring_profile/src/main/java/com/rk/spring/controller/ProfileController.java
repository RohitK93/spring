package com.rk.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rk.spring.bean.User;

@RestController
public class ProfileController {
	
	@Value("${spring.profiles.active}")
	public String profileName;
	
	@Value("${test.profile.value}")
	public String profilevalue;
	
	@GetMapping(value = "/getProfileName")
	public String getProfileName() {
		
		return profileName;
	}
	
	@GetMapping(value = "/getProfileValue")
	public String getProfileValue() {
		
		return profilevalue;
	}

}
