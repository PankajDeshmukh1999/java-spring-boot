package com.example.Movie201.entity;

import java.util.List;

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
public class CinemaIF {

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

	@Embedded
	private PVR pvr;

	@Embedded
	private INNOX innox;

	public CinemaIF(Long cinemaId, List<Screen> screen, User user, PVR pvr, INNOX innox) {
		super();
		this.cinemaId = cinemaId;
		this.screen = screen;
		this.user = user;
		this.pvr = pvr;
		this.innox = innox;
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

	public PVR getPvr() {
		return pvr;
	}

	public void setPvr(PVR pvr) {
		this.pvr = pvr;
	}

	public INNOX getInnox() {
		return innox;
	}

	public void setInnox(INNOX innox) {
		this.innox = innox;
	}

	public CinemaIF() {

	}

}
