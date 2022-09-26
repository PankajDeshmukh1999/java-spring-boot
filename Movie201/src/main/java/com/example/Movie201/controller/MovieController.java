package com.example.Movie201.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Movie201.entity.Movie;
import com.example.Movie201.services.MovieService;

@RestController
@RequestMapping("/movie")
public class MovieController {
	
	@Autowired
	private MovieService service;
	
	
	@PostMapping("/saveMovie")
	public Movie saveMovie(Movie movie) {
		return service.saveMovies(movie);
	}
	
	
	@GetMapping("/getAllmovieDetails")
	public ResponseEntity<List<Movie>> getAllMovieList(){
		return ResponseEntity.ok(service.getAllMovieDetails());
	}

}
