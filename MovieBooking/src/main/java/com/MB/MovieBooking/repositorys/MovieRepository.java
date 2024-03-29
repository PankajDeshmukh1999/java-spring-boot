package com.MB.MovieBooking.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MB.MovieBooking.entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {

	Movie findByTitle(String title);

	Movie findBymovieId(Integer movieId);

}
