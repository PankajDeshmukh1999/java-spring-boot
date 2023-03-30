package com.example.Movie201.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "innox")
public class INNOX extends CinemaIF {
	
	private String hallNumber;
	private String seatNumber;
	private Float price;
	@JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
	private String showDate;
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
	public INNOX(String hallNumber, String seatNumber, Float price, String showDate) {
		super();
		this.hallNumber = hallNumber;
		this.seatNumber = seatNumber;
		this.price = price;
		this.showDate = showDate;
	}
	public INNOX() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(hallNumber, price, seatNumber, showDate);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		INNOX other = (INNOX) obj;
		return Objects.equals(hallNumber, other.hallNumber) && Objects.equals(price, other.price)
				&& Objects.equals(seatNumber, other.seatNumber) && Objects.equals(showDate, other.showDate);
	}
	
	
}
