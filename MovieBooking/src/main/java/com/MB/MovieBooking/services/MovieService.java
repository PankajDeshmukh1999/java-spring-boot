package com.MB.MovieBooking.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MB.MovieBooking.dto.MovieDto;
import com.MB.MovieBooking.entity.Movie;
import com.MB.MovieBooking.entity.Screen;
import com.MB.MovieBooking.exception.MovieNotFound;
import com.MB.MovieBooking.exception.MovieTitleNotFound;
import com.MB.MovieBooking.exception.ScreenNotFound;
import com.MB.MovieBooking.repositorys.MovieRepository;
import com.MB.MovieBooking.repositorys.ScreenRepository;

@Service
public class MovieService {

	@Autowired
	private MovieRepository movieRepository;

	@Autowired
	private ScreenRepository screenRepository;

	@Autowired
	private ModelMapper modelMapper;
	
	 public MovieDto registerMovie(Movie movie, Integer screenId) throws ScreenNotFound {
	        Screen screen = screenRepository.findByScreenId(screenId);
	        if(screen == null) {
	            throw new ScreenNotFound("Screen id not valid ");
	        }
	        movie.setScreenDto(screen);
	        Movie createMovie = movieRepository.save(movie);
	        return modelMapper.map(movie, MovieDto.class);
	    }


	    public MovieDto getMovieByTitle(String title) throws MovieTitleNotFound {
	        Movie movie = movieRepository.findByTitle(title);
	        if(movie == null) {
	            throw new MovieTitleNotFound("Title is not valid");
	        }
	        return modelMapper.map(movie, MovieDto.class);
	    }


	    public MovieDto getMovieById(Integer movieId) throws MovieNotFound  {
	        Movie movie = movieRepository.findBymovieId(movieId);
	        if(movie == null) {
	            throw new MovieNotFound("Movie is not valid");
	        }
	        return modelMapper.map(movie, MovieDto.class);
	    }

}
