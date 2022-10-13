package com.example.Movie201.entity;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String title;
	private String releaseDate;
	private String showcycle;

	@JsonIgnore
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Screen screen;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getShowcycle() {
		return showcycle;
	}

	public void setShowcycle(String showcycle) {
		this.showcycle = showcycle;
	}

	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	public Movie(int id, String title, String releaseDate, String showcycle, Screen screen) {
		super();
		this.id = id;
		this.title = title;
		this.releaseDate = releaseDate;
		this.showcycle = showcycle;
		this.screen = screen;
	}

	public Movie() {

	}

	@Override
	public int hashCode() {
		return Objects.hash(id, releaseDate, screen, showcycle, title);
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
		return id == other.id && Objects.equals(releaseDate, other.releaseDate) && Objects.equals(screen, other.screen)
				&& Objects.equals(showcycle, other.showcycle) && Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", releaseDate=" + releaseDate + ", showcycle=" + showcycle
				+ ", screen=" + screen + "]";
	}

}
