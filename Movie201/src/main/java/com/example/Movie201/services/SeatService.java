package com.example.Movie201.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Movie201.entity.Seat;
import com.example.Movie201.repository.SeatRepo;

@Service
@Transactional
public class SeatService {

	@Autowired
	private SeatRepo seatRepo;

	@Transactional
	public List<Seat> getAllSeats() {
		return seatRepo.findAll();
	}

	@Transactional
	public Seat saveSeat(Seat seat) {
		return seatRepo.save(seat);
	}

	@Transactional
	public Optional<Seat> getSeatBySeatId(int seatId) {
		return seatRepo.findById(seatId);
	}

}
