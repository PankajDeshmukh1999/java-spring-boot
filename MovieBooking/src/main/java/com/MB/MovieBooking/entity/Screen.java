package com.MB.MovieBooking.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Screen implements Comparable<Screen> {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer screenId;
	private String type;

	@ManyToOne
	@JoinColumn(name = "cinema_id")
	private Cinema cinemaDto;

	@OneToOne(mappedBy = "screenDto", orphanRemoval = true)
	private Movie movie;

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

	public Screen(Integer screenId, String type, Cinema cinemaDto, Movie movie) {
		super();
		this.screenId = screenId;
		this.type = type;
		this.cinemaDto = cinemaDto;
		this.movie = movie;
	}

	public Cinema getCinemaDto() {
		return cinemaDto;
	}

	public void setCinemaDto(Cinema cinemaDto) {
		this.cinemaDto = cinemaDto;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	@Override
	public int hashCode() {
		return Objects.hash(screenId, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Screen other = (Screen) obj;
		return Objects.equals(screenId, other.screenId) && Objects.equals(type, other.type);
	}

	public Screen() {
		super();
	}

	@Override
	public int compareTo(Screen o) {
		return (this.getScreenId() - o.getScreenId());
	}

}
