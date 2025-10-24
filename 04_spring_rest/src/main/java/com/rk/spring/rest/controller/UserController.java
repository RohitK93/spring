package com.rk.spring.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rk.spring.rest.bean.User;

@RestController
public class UserController {
	
	@GetMapping(value = "/getUsers")
	public List<User> getUsers() {
		List<User> userList = new ArrayList<User>();
		userList.add(new User(1, "Rohit", "Kadam"));
		userList.add(new User(2, "Pradnya", "Kadam"));
		userList.add(new User(3, "Snehal", "Kadam"));
		return userList;
	}

}
