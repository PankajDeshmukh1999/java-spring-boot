package com.example.Movie201.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class TicketBooking {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long TBid;

	@ManyToOne
	@JoinColumn
	@JsonManagedReference
	private Screen screen;

	@ManyToOne
	@JoinColumn
	@JsonManagedReference
	private User user;

	private boolean isBooked;

	@OneToMany(cascade = CascadeType.ALL)
	@JsonBackReference
	private Set<SeatBooking> bookedSeats;

	public Long getId() {
		return TBid;
	}

	public void setId(Long id) {
		this.TBid = id;
	}

	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public boolean isBooked() {
		return isBooked;
	}

	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}

	public Set<SeatBooking> getBookedSeats() {
		return bookedSeats;
	}

	public void setBookedSeats(Set<SeatBooking> bookedSeats) {
		this.bookedSeats = bookedSeats;
	}

	public TicketBooking(Long id, Screen screen, User user, boolean isBooked, Set<SeatBooking> bookedSeats) {
		super();
		this.TBid = id;
		this.screen = screen;
		this.user = user;
		this.isBooked = isBooked;
		this.bookedSeats = bookedSeats;
	}
	
	public TicketBooking() {
		 
	}

}
