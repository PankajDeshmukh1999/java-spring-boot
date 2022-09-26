package com.example.Movie201.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Movie201.entity.User;


public interface UserRepo extends JpaRepository<User, Integer> {

	 User findByUserNameAndUserPassword(String userName , String userPassword);
}
