package com.example.Movie201.entity;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Seat {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int seatId;

	private int seatNumber;

	private Boolean isBooked = false;

	private String date;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@ManyToOne(cascade = CascadeType.ALL , fetch =  FetchType.EAGER)
	@JoinColumn
	@JsonManagedReference
	private Screen screen;

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JsonBackReference
	@JoinColumn
	private CinemaIF cinemaIF;

	public int getSeatId() {
		return seatId;
	}

	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public Boolean getIsBooked() {
		return isBooked;
	}

	public void setIsBooked(Boolean isBooked) {
		this.isBooked = isBooked;
	}

	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	public CinemaIF getCinemaIF() {
		return cinemaIF;
	}

	public void setCinemaIF(CinemaIF cinemaIF) {
		this.cinemaIF = cinemaIF;
	}

	public Seat(int seatId, int seatNumber, Boolean isBooked, String date, Screen screen, CinemaIF cinemaIF) {
		super();
		this.seatId = seatId;
		this.seatNumber = seatNumber;
		this.isBooked = isBooked;
		this.date = date;
		this.screen = screen;
		this.cinemaIF = cinemaIF;
	}

	public Seat() {

	}

	@Override
	public int hashCode() {
		return Objects.hash(cinemaIF, date, isBooked, screen, seatId, seatNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seat other = (Seat) obj;
		return Objects.equals(cinemaIF, other.cinemaIF) && Objects.equals(date, other.date)
				&& Objects.equals(isBooked, other.isBooked) && Objects.equals(screen, other.screen)
				&& seatId == other.seatId && seatNumber == other.seatNumber;
	}

	@Override
	public String toString() {
		return "Seat [seatId=" + seatId + ", seatNumber=" + seatNumber + ", isBooked=" + isBooked + ", date=" + date
				+ ", screen=" + screen + ", cinemaIF=" + cinemaIF + "]";
	}

}
