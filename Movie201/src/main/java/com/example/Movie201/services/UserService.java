package com.example.Movie201.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Movie201.entity.User;
import com.example.Movie201.repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	public User saveUser(User user) {
		return userRepo.save(user);
	}
	
	public User fetchUserBynameAndUserPassword(String userName, String userPassword) {
		return userRepo.findByUserNameAndUserPassword(userName,userPassword);
	}
	

}
