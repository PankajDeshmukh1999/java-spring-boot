package com.example.Movie201.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String userName;
	private String userPassword;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<CinemaIF> cinemaIF;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public List<CinemaIF> getCinemaIF() {
		return cinemaIF;
	}

	public void setCinemaIF(List<CinemaIF> cinemaIF) {
		this.cinemaIF = cinemaIF;
	}

	public User(int id, String userName, String userPassword, List<CinemaIF> cinemaIF) {
		super();
		this.id = id;
		this.userName = userName;
		this.userPassword = userPassword;
		this.cinemaIF = cinemaIF;
	}
	
	public User() {
		
	}
	

}
