package com.MB.MovieBooking.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MB.MovieBooking.entity.User;
import com.MB.MovieBooking.exception.UserNotFound;
import com.MB.MovieBooking.exception.UserNotRegisterd;
import com.MB.MovieBooking.repositorys.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	@Transactional()
	public User addUser(User u) throws UserNotRegisterd {
		User user = repository.save(u);
		if (user == null) {
			throw new UserNotRegisterd("User not registerd please try again");
		} else {
			return user;
		}
	}
	
	@Transactional()
	public User getUserById(Integer id) throws UserNotFound {
		User u = repository.findByUserId(id);
		if(u==null) {
			throw new UserNotFound("User not found please enter valid user id.");
		}else {
			return u;
		}
	}
	
	@Transactional
	public User deleteUserById(Integer id) throws UserNotFound {
		User u = repository.deleteByUserId(id);
		if(u.getUserId()==null) {
			throw new UserNotFound("User not found please enter valid user id.");
		}else {
			return u;
		}
	}

}
