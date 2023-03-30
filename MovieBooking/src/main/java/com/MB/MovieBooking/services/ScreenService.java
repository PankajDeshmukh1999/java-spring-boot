package com.MB.MovieBooking.services;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.MB.MovieBooking.dto.ScreenDto;
import com.MB.MovieBooking.entity.Cinema;
import com.MB.MovieBooking.entity.Screen;
import com.MB.MovieBooking.repositorys.CinemaRepository;
import com.MB.MovieBooking.repositorys.ScreenRepository;

@Service
public class ScreenService {

	@Autowired
	private ScreenRepository screenRepository;

	@Autowired
	private CinemaRepository cinemaRepository;

	@Autowired
	private ModelMapper modelMapper;

	@Transactional(propagation = Propagation.REQUIRED)
	public ScreenDto createScreen(Screen screen, Integer cinemaId) throws Exception {
		Cinema cinema = cinemaRepository.findByCinemaId(cinemaId);
		if (cinema == null) {
			throw new Exception("Invalid");
		}
		screen.setCinemaDto(cinema);
		Screen createScreen = screenRepository.save(screen);
		return modelMapper.map(createScreen, ScreenDto.class);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public List<ScreenDto> getByType(String type) throws Exception {
		List<Screen> screens = screenRepository.findByType(type);
		if (screens == null) {
			throw new Exception("Invalid");
		}
		List<ScreenDto> screenDtos = screens.stream().map(screen -> modelMapper.map(screen, ScreenDto.class))
				.collect(Collectors.toList());
		return screenDtos;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public ScreenDto updateScreen(Screen screen, Integer screenId) throws Exception {
		Screen updateScreen = screenRepository.findById(screenId).get();
		if (updateScreen == null) {
			throw new Exception("Invalid");
		}
		updateScreen.setType(screen.getType());
		Screen updatedScreen = screenRepository.save(updateScreen);
		return modelMapper.map(updatedScreen, ScreenDto.class);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public Screen deleteScreen(Integer screenId) throws Exception {
		Screen screen = screenRepository.findById(screenId).get();
		if (screen == null) {
			throw new Exception("Invalid");
		}
		return screenRepository.deleteScreenByscreenId(screenId);
	}

}
