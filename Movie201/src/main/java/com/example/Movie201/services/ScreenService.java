package com.example.Movie201.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Movie201.entity.Screen;
import com.example.Movie201.repository.ScreenRepo;

@Service
public class ScreenService {
	
	@Autowired
	private ScreenRepo screenRepo;
	
	@Transactional
	public Screen saveScreen(Screen screen) {
		return screenRepo.save(screen);
	}

}
