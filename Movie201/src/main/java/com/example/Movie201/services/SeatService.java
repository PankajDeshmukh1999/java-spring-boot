package com.example.Movie201.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Movie201.entity.Seat;
import com.example.Movie201.repo.SeatRepo;

@Service
@Transactional
public class SeatService {

	@Autowired
	private SeatRepo seatRepo;

	public List<Seat> getAllSeats() {
		return seatRepo.findAll();
	}
	
	public Seat saveSeat(Seat seat) {
		return seatRepo.save(seat);
	}

	public Optional<Seat> getSeatBySeatId(int seatId) {
		return seatRepo.findById(seatId);
	}
	

}
