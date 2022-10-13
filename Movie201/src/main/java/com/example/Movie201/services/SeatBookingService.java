package com.example.Movie201.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Movie201.entity.SeatBooking;
import com.example.Movie201.repository.SeatBookingRepo;

@Service
public class SeatBookingService {
	
	@Autowired
	private SeatBookingRepo seatBookingRepo;
	
	@Transactional
	public List<SeatBooking> getAllSeatBooked() {
        return seatBookingRepo.findAll();
    }


}
