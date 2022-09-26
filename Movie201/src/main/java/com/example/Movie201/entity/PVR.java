package com.example.Movie201.entity;

import javax.persistence.Embeddable;

@Embeddable
public class PVR {
	

	private String location;
	private int price;

	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public PVR( String location, int price) {
		super();
		this.location = location;
		this.price = price;
	}
	
	public PVR() {
		
	}
	

}
