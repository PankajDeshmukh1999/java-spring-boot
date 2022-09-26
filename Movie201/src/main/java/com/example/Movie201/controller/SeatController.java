package com.example.Movie201.controller;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Movie201.entity.Seat;
import com.example.Movie201.services.SeatService;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@RestController
@RequestMapping("/seat")
public class SeatController {

	@Autowired
	private SeatService service;

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

	@Transactional
	@GetMapping("/searchById/{seatId}")
	public ResponseEntity<Optional<Seat>> searchById(@PathVariable int seatId){
		return ResponseEntity.ok(service.getSeatBySeatId(seatId));
	}
	

}
