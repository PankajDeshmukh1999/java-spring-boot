package com.MB.MovieBooking.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.Hibernate;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Cinema implements Comparable<Cinema> {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cinemaId;
	private String name;
	private String location;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User userDto;

	@OneToMany(mappedBy = "cinemaDto", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
	private List<Screen> screens = new ArrayList<>();

	public Cinema() {
		super();
	}

	public Cinema(Integer cinemaId, String name, String location, User userDto, List<Screen> screens) {
		super();
		this.cinemaId = cinemaId;
		this.name = name;
		this.location = location;
		this.userDto = userDto;
		this.screens = screens;
	}

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

	public User getUserDto() {
		return userDto;
	}

	public void setUserDto(User userDto) {
		this.userDto = userDto;
	}

	public List<Screen> getScreens() {
		return screens;
	}

	public void setScreens(List<Screen> screens) {
		this.screens = screens;
	}

	@Override
	public int compareTo(Cinema o) {
		// TODO Auto-generated method stub
		return (this.getCinemaId() - o.getCinemaId());
	}

	@Override
	public int hashCode() {
		return getClass().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || Hibernate.getClass(this) != Hibernate.getClass(obj))
			return false;
		Cinema cinema = (Cinema) obj;
		return cinemaId != null && Objects.equals(cinemaId, cinema.cinemaId);
	}

}
