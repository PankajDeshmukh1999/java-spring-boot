package com.example.Movie201.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Screen {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String type;

	// movie one on one screen
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonBackReference
	private Movie movie;

	// many screen on one one cinema
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JsonBackReference
	private CinemaIF cinemaIF;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public CinemaIF getCinemaIF() {
		return cinemaIF;
	}

	public void setCinemaIF(CinemaIF cinemaIF) {
		this.cinemaIF = cinemaIF;
	}

	public Screen(int id, String type, Movie movie, CinemaIF cinemaIF) {
		super();
		this.id = id;
		this.type = type;
		this.movie = movie;
		this.cinemaIF = cinemaIF;
	}

	public Screen() {
		
	}
	
}
