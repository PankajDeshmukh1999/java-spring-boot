package com.example.Movie201.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Movie201.entity.SeatBooking;

public interface SeatBookingRepo extends JpaRepository<SeatBooking, Long> {

//	 SeatBooking getSeatBookingById(Long id);
}
