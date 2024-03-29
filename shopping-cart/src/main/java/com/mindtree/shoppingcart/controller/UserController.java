package com.mindtree.shoppingcart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.shoppingcart.entity.User;
import com.mindtree.shoppingcart.service.UserService;

@RestController
@RequestMapping("api/v1/")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/user")
	public List<User> retriveAllUsers(){
		return userService.getAllActiveUsers();
	}
	
}
