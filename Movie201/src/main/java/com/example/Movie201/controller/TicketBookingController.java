package com.example.Movie201.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Movie201.entity.TicketBooking;
import com.example.Movie201.services.TicketBookingService;

@RestController
@RequestMapping("/ticketBooking")
public class TicketBookingController {

	@Autowired
	private TicketBookingService service;

	
	//get All ticket booking
	@GetMapping("/bookings")
	public List<TicketBooking> getAllBookings() {
		return service.getAllBookings();
	}

}
