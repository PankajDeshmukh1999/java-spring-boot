package com.example.Movie201.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Movie201.entity.Movie;

public interface MovieRepo extends JpaRepository<Movie, Integer>{
	
	Movie findById(int id);

}
