package com.example.Movie201.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Movie201.entity.TicketBooking;
import com.example.Movie201.repository.TicketBookingRepo;

@Service
public class TicketBookingService {
	
	@Autowired
	private TicketBookingRepo ticketBookingRepo;
	
	@Transactional
	  public List<TicketBooking> getAllBookings() {
	        return ticketBookingRepo.findAll();
	    }

}
