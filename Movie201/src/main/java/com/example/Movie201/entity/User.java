package com.example.Movie201.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String userName;
	private String userPassword;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonIgnoreProperties
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

	@Override
	public int hashCode() {
		return Objects.hash(cinemaIF, id, userName, userPassword);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(cinemaIF, other.cinemaIF) && id == other.id && Objects.equals(userName, other.userName)
				&& Objects.equals(userPassword, other.userPassword);
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", userPassword=" + userPassword + ", cinemaIF=" + cinemaIF
				+ "]";
	}

}
