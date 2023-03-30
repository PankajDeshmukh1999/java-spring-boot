package com.MB.MovieBooking.dto;

public class CinemaScreenDto {

	private Integer cinemaId;
	private String name;
	private String location;

	private UserDto userDto;

	public Integer getCinemaId() {
		return cinemaId;
	}

	public void setCinemaId(Integer cinemaId) {
		this.cinemaId = cinemaId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public UserDto getUserDto() {
		return userDto;
	}

	public void setUserDto(UserDto userDto) {
		this.userDto = userDto;
	}

	public CinemaScreenDto(Integer cinemaId, String name, String location, UserDto userDto) {
		super();
		this.cinemaId = cinemaId;
		this.name = name;
		this.location = location;
		this.userDto = userDto;
	}

	public CinemaScreenDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
