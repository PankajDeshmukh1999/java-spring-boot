package com.example.Movie201.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Movie201.entity.Seat;

public interface SeatRepo extends JpaRepository<Seat, Integer>{


}
