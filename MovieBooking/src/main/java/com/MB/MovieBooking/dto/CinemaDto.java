package com.MB.MovieBooking.dto;

import javax.validation.constraints.NotEmpty;

public class CinemaDto {
	
	  private Integer cinemaId;

	    @NotEmpty
	    private String name;

	    @NotEmpty
	    private String location;

	    @NotEmpty
	    private String hallNumber;

	    @NotEmpty
	    private String seatNumber;

	    @NotEmpty
	    private Float price;

	    @NotEmpty
	    private String showDate;

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

		public String getHallNumber() {
			return hallNumber;
		}

		public void setHallNumber(String hallNumber) {
			this.hallNumber = hallNumber;
		}

		public String getSeatNumber() {
			return seatNumber;
		}

		public void setSeatNumber(String seatNumber) {
			this.seatNumber = seatNumber;
		}

		public Float getPrice() {
			return price;
		}

		public void setPrice(Float price) {
			this.price = price;
		}

		public String getShowDate() {
			return showDate;
		}

		public void setShowDate(String showDate) {
			this.showDate = showDate;
		}

		public UserDto getUserDto() {
			return userDto;
		}

		public void setUserDto(UserDto userDto) {
			this.userDto = userDto;
		}

		public CinemaDto(Integer cinemaId, @NotEmpty String name, @NotEmpty String location,
				@NotEmpty String hallNumber, @NotEmpty String seatNumber, @NotEmpty Float price,
				@NotEmpty String showDate, UserDto userDto) {
			super();
			this.cinemaId = cinemaId;
			this.name = name;
			this.location = location;
			this.hallNumber = hallNumber;
			this.seatNumber = seatNumber;
			this.price = price;
			this.showDate = showDate;
			this.userDto = userDto;
		}

		public CinemaDto() {
			super();
		}

		@Override
		public String toString() {
			return "CinemaDto [cinemaId=" + cinemaId + ", name=" + name + ", location=" + location + ", hallNumber="
					+ hallNumber + ", seatNumber=" + seatNumber + ", price=" + price + ", showDate=" + showDate
					+ ", userDto=" + userDto + "]";
		}
	    
	    

}
