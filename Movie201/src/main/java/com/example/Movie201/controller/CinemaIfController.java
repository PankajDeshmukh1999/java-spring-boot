package com.example.Movie201.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Movie201.entity.CinemaIF;
import com.example.Movie201.entity.INNOX;
import com.example.Movie201.entity.PVR;
import com.example.Movie201.services.CinemaIfService;

@RestController
public class CinemaIfController {

	@Autowired
	private CinemaIfService service;

	@PostMapping("cinema/create/pvr")
	public CinemaIF createPVR(PVR pvr) {
		return service.createPVR(pvr);
	}

	@GetMapping("cinema/findByCinemaId/{cinemaId}")
	public CinemaIF findByCinemaId(@PathVariable("cinemaId") Long cinemaId) {
		return service.findByCinemaId(cinemaId);
	}

	@PostMapping("cinema/create/innox")
	public CinemaIF createInnox(INNOX innox) {
		return service.createInnox(innox);
	}

}
