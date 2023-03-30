package com.MB.MovieBooking.services;

import java.util.List;
import java.util.stream.Collectors;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.MB.MovieBooking.dto.CinemaDto;
import com.MB.MovieBooking.dto.UserDto;
import com.MB.MovieBooking.entity.Cinema;
import com.MB.MovieBooking.entity.INNOX;
import com.MB.MovieBooking.entity.PVR;
import com.MB.MovieBooking.entity.User;
import com.MB.MovieBooking.exception.UserNotFound;
import com.MB.MovieBooking.repositorys.CinemaRepository;
import com.MB.MovieBooking.repositorys.UserRepository;
import org.modelmapper.ModelMapper;

@Service
public class CinemaService {
	
	@Autowired
	private CinemaRepository  repository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private CinemaRepository cinemaRepository;
	
    @Autowired
    private ModelMapper modelMapper;

	
    @Transactional()
    public CinemaDto createPVR(PVR pvr, Integer userId) throws UserNotFound {
        User user = userRepository.findByUserId(userId);

        if(user == null) {
            throw new UserNotFound("User not found.");
        }
        pvr.setUserDto(user);
        PVR createdPVR = cinemaRepository.save(pvr);
        return modelMapper.map(createdPVR, CinemaDto.class);
 
    }

    @Transactional()
    public CinemaDto createInox(INNOX inox, Integer userId) throws UserNotFound {
        User user = userRepository.findByUserId(userId);
        if(user == null) {
            
            throw new UserNotFound("User not found");
        }
        inox.setUserDto(user);
        INNOX createdInox = cinemaRepository.save(inox);
        return modelMapper.map(createdInox, CinemaDto.class);
    }
    
    @Transactional(propagation = Propagation.REQUIRED)
    public List<CinemaDto> getAllCinemas() {
        List<Cinema> cinemas = cinemaRepository.findAll();
        List<CinemaDto> cinemaDtos = cinemas.stream().map(cinema -> modelMapper.map(cinema, CinemaDto.class)).collect(Collectors.toList());
        return cinemaDtos;
    }
    
    public List<Cinema> getCinemasByNameAndLocation(String name, String location) throws Exception {
        return cinemaRepository.findByNameAndLocation(name, location);
    } 
    
    public Cinema deleteCinemaById(Integer cinemaId) throws Exception {
    	Cinema c = cinemaRepository.deleteCinemaBycinemaId(cinemaId);
    	if(c==null) {
    		throw new Exception("Cinema id not valid...");
    	}
    	else {
    		return c;
    	}
    }

}
