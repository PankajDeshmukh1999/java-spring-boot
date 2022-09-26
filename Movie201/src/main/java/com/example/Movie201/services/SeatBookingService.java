package com.example.Movie201.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Movie201.entity.SeatBooking;
import com.example.Movie201.repo.SeatBookingRepo;

@Service
public class SeatBookingService {
	
	@Autowired
	private SeatBookingRepo seatBookingRepo;
	
	public List<SeatBooking> getAllSeatBooked() {
        return seatBookingRepo.findAll();
    }


}
