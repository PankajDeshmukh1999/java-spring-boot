package com.example.Movie201.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Movie201.entity.Movie;
import com.example.Movie201.repository.MovieRepo;

@Service
public class MovieService {

	@Autowired
	private MovieRepo movieRepo;

	@Transactional
	public Movie saveMovies(Movie movie) {
		return movieRepo.save(movie);
	}

	@Transactional
	public List<Movie> getAllMovieDetails() {
		return movieRepo.findAll();
	}

	@Transactional
	public Movie findById(int id) {
		return movieRepo.findById(id);
	}
}
