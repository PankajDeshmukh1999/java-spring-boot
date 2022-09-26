package com.example.Movie201.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Movie201.entity.Seat;
import com.example.Movie201.entity.SeatBooking;
import com.example.Movie201.services.SeatBookingService;

@RestController
@RequestMapping("/seatBooking")
public class SeatBookingController {

	@Autowired
	private SeatBookingService service;

	
	// getting seat booked
	@GetMapping("/seatbooked")
	public List<SeatBooking> getAllSeatBooked() {
		return service.getAllSeatBooked();
	}
	


}
