package com.example.Movie201.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Movie201.entity.CinemaIF;
import com.example.Movie201.entity.INNOX;
import com.example.Movie201.entity.PVR;
import com.example.Movie201.repository.CinemaIfRepository;

@Service
public class CinemaIfService {

	@Autowired
	private CinemaIfRepository cinemaIfRepository;

	@Transactional()
	public CinemaIF createPVR(PVR pvr) {
		return cinemaIfRepository.save(pvr);
	}

	@Transactional()
	public CinemaIF createInnox(INNOX innox) {
		return cinemaIfRepository.save(innox);
	}

	@Transactional()
	public CinemaIF findByCinemaId(Long cinemaId) {
		return cinemaIfRepository.findByCinemaId(cinemaId);
	}
}
