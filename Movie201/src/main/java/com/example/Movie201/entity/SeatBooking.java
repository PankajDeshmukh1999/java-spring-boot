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

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class SeatBooking {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne(cascade = CascadeType.ALL , fetch =  FetchType.EAGER)
	@JoinColumn
	@JsonManagedReference
	private Seat seat;

	@ManyToOne(cascade = CascadeType.ALL , fetch =  FetchType.EAGER)
	@JoinColumn
	private Screen screen;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	public SeatBooking(Long id, Seat seat, Screen screen) {
		super();
		this.id = id;
		this.seat = seat;
		this.screen = screen;
	}
	
	public SeatBooking() {
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, screen, seat);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SeatBooking other = (SeatBooking) obj;
		return Objects.equals(id, other.id) && Objects.equals(screen, other.screen) && Objects.equals(seat, other.seat);
	}

	@Override
	public String toString() {
		return "SeatBooking [id=" + id + ", seat=" + seat + ", screen=" + screen + "]";
	}
	
	
}
