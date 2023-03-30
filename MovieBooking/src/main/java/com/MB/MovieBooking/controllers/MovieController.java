package com.MB.MovieBooking.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.MB.MovieBooking.dto.MovieDto;
import com.MB.MovieBooking.entity.Movie;
import com.MB.MovieBooking.exception.MovieNotFound;
import com.MB.MovieBooking.exception.MovieTitleNotFound;
import com.MB.MovieBooking.exception.ScreenNotFound;
import com.MB.MovieBooking.services.MovieService;

@RestController
public class MovieController {

	@Autowired
	private MovieService movieService;

	@PostMapping("/create/screen/{screenId}")
	public ResponseEntity<MovieDto> createMovie(@RequestBody Movie movie, @PathVariable("screenId") Integer screenId)
			throws ScreenNotFound {
		MovieDto movieDto = movieService.registerMovie(movie, screenId);
		return new ResponseEntity<>(movieDto, HttpStatus.CREATED);
	}

	@GetMapping("/get/title/{title}")
	public ResponseEntity<MovieDto> getMovieByTitle(@PathVariable("title") String title) throws MovieTitleNotFound {
		MovieDto movieDto = movieService.getMovieByTitle(title);
		return new ResponseEntity<>(movieDto, HttpStatus.FOUND);
	}

	@GetMapping("/get/{movieId}")
	public ResponseEntity<MovieDto> getMovieById(@PathVariable("movieId") Integer movieId) throws MovieNotFound {
		MovieDto movieDto = movieService.getMovieById(movieId);
		return new ResponseEntity<>(movieDto, HttpStatus.FOUND);
	}

}
