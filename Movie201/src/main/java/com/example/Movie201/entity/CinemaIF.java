package com.example.Movie201.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class CinemaIF implements INNOX, PVR {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cinemaId")
	private Long cinemaId;

	// screen relation
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonBackReference
	private List<Screen> screen;

	// user relation
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private User user;

	@OneToMany
	@JoinColumn
	@JsonBackReference
	private List<Seat> seats;

	public CinemaIF(Long cinemaId, List<Screen> screen, User user) {
		super();
		this.cinemaId = cinemaId;
		this.screen = screen;
		this.user = user;

	}

	public Long getCinemaId() {
		return cinemaId;
	}

	public void setCinemaId(Long cinemaId) {
		this.cinemaId = cinemaId;
	}

	public List<Screen> getScreen() {
		return screen;
	}

	public void setScreen(List<Screen> screen) {
		this.screen = screen;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public CinemaIF() {

	}

	@Override
	public String toString() {
		return "CinemaIF [cinemaId=" + cinemaId + ", screen=" + screen + ", user=" + user + ", seats=" + seats + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cinemaId, screen, seats, user);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CinemaIF other = (CinemaIF) obj;
		return Objects.equals(cinemaId, other.cinemaId) && Objects.equals(screen, other.screen)
				&& Objects.equals(seats, other.seats) && Objects.equals(user, other.user);
	}

	@Override
	public void bookedPvr() {
		System.out.println("Movie ticket booked in PVR "+ getCinemaId()+"-"+getScreen()+"-"+getUser());
	}

	@Override
	public void bookedInnox() {
		System.out.println("Movie ticket booked in PVR "+ getCinemaId()+"-"+getScreen()+"-"+getUser());
	}

}
