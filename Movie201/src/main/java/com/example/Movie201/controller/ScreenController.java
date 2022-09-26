package com.example.Movie201.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Movie201.entity.Screen;
import com.example.Movie201.services.ScreenService;

@RestController
@RequestMapping("/screen")
public class ScreenController {
	
	@Autowired
	private ScreenService service;
	
	@PostMapping("/saveScreen")
	public Screen saveScreen(@RequestBody Screen screen) {
		return service.saveScreen(screen);
	}

}
