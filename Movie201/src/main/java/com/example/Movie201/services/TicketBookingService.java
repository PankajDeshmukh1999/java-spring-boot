package com.example.Movie201.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Movie201.entity.TicketBooking;
import com.example.Movie201.repo.TicketBookingRepo;

@Service
public class TicketBookingService {
	
	@Autowired
	private TicketBookingRepo ticketBookingRepo;
	
	  public List<TicketBooking> getAllBookings() {
	        return ticketBookingRepo.findAll();
	    }

	    
//	    public TicketBooking getBookingById(Long TBid) {
//	        return null;
//	    }

}
