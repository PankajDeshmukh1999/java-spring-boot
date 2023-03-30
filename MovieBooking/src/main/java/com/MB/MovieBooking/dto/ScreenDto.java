package com.MB.MovieBooking.dto;

public class ScreenDto {

	private Integer screenId;
	private String type;

	private CinemaScreenDto cinemaScreenDto;

	public Integer getScreenId() {
		return screenId;
	}

	public void setScreenId(Integer screenId) {
		this.screenId = screenId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public CinemaScreenDto getCinemaScreenDto() {
		return cinemaScreenDto;
	}

	public void setCinemaScreenDto(CinemaScreenDto cinemaScreenDto) {
		this.cinemaScreenDto = cinemaScreenDto;
	}

	public ScreenDto(Integer screenId, String type, CinemaScreenDto cinemaScreenDto) {
		super();
		this.screenId = screenId;
		this.type = type;
		this.cinemaScreenDto = cinemaScreenDto;
	}

	public ScreenDto() {
		super();
		// TODO Auto-generated constructor stub
	}

}
