package com.example.Movie201.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Movie201.entity.User;
import com.example.Movie201.services.UserService;

@RestController
@RequestMapping("/user")
public class Usercontroller {
	
	@Autowired
	private UserService service;
	
	
	//save users
	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User user) {
		return service.saveUser(user);
	}

	
	
	//login if userName and password is null or wrong then throw exception 
	@PostMapping("/login")
	public User loginUser(@RequestBody User user) throws Exception {
		String tempUser = user.getUserName();
		String tempPassword = user.getUserPassword();
		User userObj = null;

		if (tempUser != null && tempPassword != null) {
			userObj = service.fetchUserBynameAndUserPassword(tempUser, tempPassword);
		}
		if (userObj == null) {
			throw new Exception("Bad credentials");
		}
		return userObj;

	}

}
