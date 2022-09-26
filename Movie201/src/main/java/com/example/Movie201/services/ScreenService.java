package com.example.Movie201.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Movie201.entity.Screen;
import com.example.Movie201.repo.ScreenRepo;

@Service
public class ScreenService {
	
	@Autowired
	private ScreenRepo screenRepo;
	
	public Screen saveScreen(Screen screen) {
		return screenRepo.save(screen);
	}

}
