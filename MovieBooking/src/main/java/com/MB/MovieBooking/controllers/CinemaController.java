package com.MB.MovieBooking.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.MB.MovieBooking.dto.CinemaDto;
import com.MB.MovieBooking.entity.Cinema;
import com.MB.MovieBooking.entity.INNOX;
import com.MB.MovieBooking.entity.PVR;
import com.MB.MovieBooking.exception.UserNotFound;
import com.MB.MovieBooking.services.CinemaService;

@RestController
public class CinemaController {

	@Autowired
	private CinemaService cinemaService;

	@PostMapping("create/pvr/{userId}")
	public ResponseEntity<CinemaDto> createPVR(@RequestBody PVR pvr, @PathVariable("userId") Integer userId)
			throws UserNotFound {
		CinemaDto createdPVR = cinemaService.createPVR(pvr, userId);
		return new ResponseEntity<>(createdPVR, HttpStatus.CREATED);
	}

	@PostMapping("create/inox/{userId}")
	public ResponseEntity<CinemaDto> createInox(@RequestBody INNOX inox, @PathVariable("userId") Integer userId)
			throws UserNotFound {
		CinemaDto createdInox = cinemaService.createInox(inox, userId);
		return new ResponseEntity<>(createdInox, HttpStatus.CREATED);
	}

	 @GetMapping("/get/all")
	    public ResponseEntity<List<CinemaDto>> getAllCinemas() {
	        List<CinemaDto> cinemaDto = cinemaService.getAllCinemas();
	        return new ResponseEntity<List<CinemaDto>>(cinemaDto, HttpStatus.FOUND);
	    }

	@DeleteMapping("delete/{cinemaId}")
	public Cinema deleteCinemaById(@PathVariable("cinemaId") Integer cinemaId) throws Exception {
		return cinemaService.deleteCinemaById(cinemaId);
	}

}
