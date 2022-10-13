package com.example.Movie201.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Movie201.entity.User;
import com.example.Movie201.repository.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	@Transactional
	public User saveUser(User user) {
		return userRepo.save(user);
	}
	
	@Transactional
	public User fetchUserBynameAndUserPassword(String userName, String userPassword) {
		return userRepo.findByUserNameAndUserPassword(userName,userPassword);
	}
	
	@Transactional
	public User deleteById(int id) {
		return userRepo.deleteById(id);
	}

}
