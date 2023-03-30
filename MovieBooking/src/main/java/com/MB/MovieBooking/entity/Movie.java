package com.MB.MovieBooking.entity;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Movie implements Comparable<Movie> {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer movieId;
	private String title;
	@JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
	private String releaseDate;
	private String showCycle;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
	@JoinColumn(name = "screen_id")
	private Screen screenDto;

	public Screen getScreenDto() {
		return screenDto;
	}

	public void setScreenDto(Screen screenDto) {
		this.screenDto = screenDto;
	}

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

	public Movie(Integer movieId, String title, String releaseDate, String showCycle, Screen screenDto) {
		super();
		this.movieId = movieId;
		this.title = title;
		this.releaseDate = releaseDate;
		this.showCycle = showCycle;
		this.screenDto = screenDto;
	}

	public Movie() {
		super();
	}

	@Override
	public int compareTo(Movie o) {
		return (this.getMovieId() - o.getMovieId());
	}

	@Override
	public int hashCode() {
		return Objects.hash(movieId, releaseDate, showCycle, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		return Objects.equals(movieId, other.movieId) && Objects.equals(releaseDate, other.releaseDate)
				&& Objects.equals(showCycle, other.showCycle) && Objects.equals(title, other.title);
	}

}
