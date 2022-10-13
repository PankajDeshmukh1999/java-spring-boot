package com.example.Movie201.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Movie201.entity.Movie;
import com.example.Movie201.exceptions.MovieNotFound;
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
	public ResponseEntity<List<Movie>> getAllMovieList() {
		return ResponseEntity.ok(service.getAllMovieDetails());
	}

	@GetMapping("/movieId/{id}")
	public ResponseEntity<Movie> findById(@PathVariable int id) throws MovieNotFound {
		try {
			if (id <= 0) {
				throw new MovieNotFound("Please enter valid Movie id");
			} else {

				return ResponseEntity.ok().location((new URI("/movie/" + id))).body(service.findById(id));
			}
		} catch (URISyntaxException e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

}
