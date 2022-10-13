package com.example.Movie201.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Movie201.entity.Seat;
import com.example.Movie201.exceptions.SeatNotFound;
import com.example.Movie201.repository.SeatRepo;
import com.example.Movie201.services.SeatService;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@RestController
@RequestMapping("/seat")
public class SeatController {

	@Autowired
	private SeatService service;
	
	@Autowired
	private SeatRepo repo;

	//how much seats avilable in pvr/innox
	@GetMapping("/seats")
	public List<Seat> getAllSeats() {
		return this.service.getAllSeats();
	}
	
	@JsonManagedReference
	@PostMapping("/saveSeat")
	public Seat saveSeat(@RequestBody Seat seat) {
		return service.saveSeat(seat);
	}
	
	@GetMapping("/searchById/{seatId}")
	public ResponseEntity<Optional<Seat>> findById(@PathVariable int seatId){
		try {
			return ResponseEntity.ok().location((new URI("/seat/" + seatId))).body(service.getSeatBySeatId(seatId));
		} catch (URISyntaxException e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@PutMapping("/updateSeat/{seatId}")
	public ResponseEntity<Seat>updateSeat(@PathVariable int seatid, @RequestBody Seat seatDetails){
		Seat seat = service.getSeatBySeatId(seatid)
				.orElseThrow(()->
				new SeatNotFound("Seat not exist with id"+seatid));
		
		seat.setSeatId(seatDetails.getSeatId());
		seat.setSeatNumber(seatDetails.getSeatNumber());
		seat.setDate(seatDetails.getDate());
		seat.setIsBooked(seatDetails.getIsBooked());
		
		Seat updatedeSeat = repo.save(seat);
		return ResponseEntity.ok(updatedeSeat);
	}

}
