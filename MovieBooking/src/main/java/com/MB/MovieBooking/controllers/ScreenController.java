package com.MB.MovieBooking.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.MB.MovieBooking.dto.ScreenDto;
import com.MB.MovieBooking.entity.Screen;
import com.MB.MovieBooking.services.ScreenService;

@RestController
public class ScreenController {

	@Autowired
	private ScreenService screenService;

	@PostMapping("/create/cinema/{cinemaId}")
	public ResponseEntity<ScreenDto> createScreen(@RequestBody Screen screen,
			@PathVariable("cinemaId") Integer cinemaId) throws Exception {
		ScreenDto screenDto = screenService.createScreen(screen, cinemaId);
		return new ResponseEntity<>(screenDto, HttpStatus.CREATED);
	}

	@GetMapping("/get/type/{type}")
	public ResponseEntity<List<ScreenDto>> getScreenByType(@PathVariable("type") String type)
			throws Exception {
		List<ScreenDto> screenDtos = screenService.getByType(type);
		return new ResponseEntity<List<ScreenDto>>(screenDtos, HttpStatus.FOUND);
	}

	@PutMapping("/update/{screenId}")
	public ResponseEntity<ScreenDto> updateScreen(@RequestBody Screen screen,
			@PathVariable("screenId") Integer screenId) throws Exception {
		ScreenDto updatedScreen = screenService.updateScreen(screen, screenId);
		return new ResponseEntity<>(updatedScreen, HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/delete/{screenId}")
	public Screen deleteById(@PathVariable("screenId") Integer screenId) throws Exception {
		return screenService.deleteScreen(screenId);
		
	}

}
