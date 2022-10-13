package com.example.Movie201.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Movie201.entity.User;
import com.example.Movie201.exceptions.UserNotFound;
import com.example.Movie201.repository.UserRepo;
import com.example.Movie201.services.UserService;

@RestController
@RequestMapping("/user")
public class Usercontroller {
	
	@Autowired
	private UserService service;
	
	
	@Autowired
	private UserRepo repo;
	
	
	//save users
	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User user) {
		return service.saveUser(user);
	}

	
	
	//login if userName and password is null or wrong then throw exception 
	@PostMapping("/login")
	public User loginUser(@RequestBody User user) throws UserNotFound {
		String tempUser = user.getUserName();
		String tempPassword = user.getUserPassword();
		User userObj = null;

		if (tempUser != null && tempPassword != null) {
			userObj = service.fetchUserBynameAndUserPassword(tempUser, tempPassword);
		}
		if (userObj == null) {
			throw new UserNotFound("Bad credentials");
		}
		return userObj;

	}
	
	@DeleteMapping("/deleteUser/{id}")
	public String deleteById(@PathVariable int id) {
		service.deleteById(id);
		return "Delete Successfully";
	}
	
	@GetMapping("userInAsc/{feild}")
	public List<User> ascSort(@PathVariable String feild){
		return service.sortAsc(feild);
	}

}
