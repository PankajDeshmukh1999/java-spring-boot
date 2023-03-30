package com.MB.MovieBooking.entity;

import java.util.Objects;

import javax.persistence.Entity;

import org.hibernate.Hibernate;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class INNOX extends Cinema {

	private String hallNumber;
	private String seatNumber;
	private Float price;
	@JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
	private String showDate;

	public INNOX() {
		super();
	}

	public INNOX(String hallNumber, String seatNumber, Float price, String showDate) {
		super();
		this.hallNumber = hallNumber;
		this.seatNumber = seatNumber;
		this.price = price;
		this.showDate = showDate;
	}

	public String getHallNumber() {
		return hallNumber;
	}

	public void setHallNumber(String hallNumber) {
		this.hallNumber = hallNumber;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getShowDate() {
		return showDate;
	}

	public void setShowDate(String showDate) {
		this.showDate = showDate;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o))
			return false;
		INNOX inox = (INNOX) o;
		return getCinemaId() != null && Objects.equals(getCinemaId(), inox.getCinemaId());
	}

	@Override
	public int hashCode() {
		return getClass().hashCode();
	}
}