package com.MB.MovieBooking.dto;

public class MovieDto {
	private Integer movieId;
	private String title;
	private String releaseDate;
	private String showCycle;

	private ScreenDto screenDto;
	
	

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getShowCycle() {
		return showCycle;
	}

	public void setShowCycle(String showCycle) {
		this.showCycle = showCycle;
	}

	public ScreenDto getScreenDto() {
		return screenDto;
	}

	public void setScreenDto(ScreenDto screenDto) {
		this.screenDto = screenDto;
	}

	public MovieDto(Integer movieId, String title, String releaseDate, String showCycle, ScreenDto screenDto) {
		super();
		this.movieId = movieId;
		this.title = title;
		this.releaseDate = releaseDate;
		this.showCycle = showCycle;
		this.screenDto = screenDto;
	}

	public MovieDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
