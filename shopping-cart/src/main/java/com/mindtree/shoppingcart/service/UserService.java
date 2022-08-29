package com.mindtree.shoppingcart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.shoppingcart.entity.User;
import com.mindtree.shoppingcart.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAllActiveUsers(){
		return userRepository.findAll();
	}
	

}
