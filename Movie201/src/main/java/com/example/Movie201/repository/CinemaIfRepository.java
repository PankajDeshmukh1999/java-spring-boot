package com.example.Movie201.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Movie201.entity.CinemaIF;

public interface CinemaIfRepository extends JpaRepository<CinemaIF, Long> {

	CinemaIF findByCinemaId(Long cinemaId);

}
