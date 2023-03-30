package com.MB.MovieBooking.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.MB.MovieBooking.entity.User;
import com.MB.MovieBooking.exception.UserNotFound;
import com.MB.MovieBooking.exception.UserNotRegisterd;
import com.MB.MovieBooking.services.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	@PostMapping("user/register")
	public User registerUser(@RequestBody User user) throws UserNotRegisterd {
		return service.addUser(user);
	}
	
	@GetMapping("user/userId/{id}")
	public User getUserById(@PathVariable("id") Integer id) throws UserNotFound {
		return service.getUserById(id);
	}
	
	@DeleteMapping("user/deleteUser/{id}")
	public User deleteUserById(@PathVariable("id") Integer id) throws UserNotFound {
		return service.deleteUserById(id);
	}

}
