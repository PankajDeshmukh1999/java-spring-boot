package com.example.Movie201.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Movie201.entity.User;


public interface UserRepo extends JpaRepository<User, Integer> {

	 User findByUserNameAndUserPassword(String userName , String userPassword);
	 
	 User deleteById(int id);
}
