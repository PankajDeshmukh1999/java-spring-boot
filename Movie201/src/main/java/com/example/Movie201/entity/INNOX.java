package com.example.Movie201.entity;

import javax.persistence.Embeddable;

@Embeddable
public class INNOX {

	private String iLocation;

	private int iPrice;

	public String getiLocation() {
		return iLocation;
	}

	public void setiLocation(String iLocation) {
		this.iLocation = iLocation;
	}

	public int getiPrice() {
		return iPrice;
	}

	public void setiPrice(int iPrice) {
		this.iPrice = iPrice;
	}

	public INNOX(String iLocation, int iPrice) {
		super();
		this.iLocation = iLocation;
		this.iPrice = iPrice;
	}

	public INNOX() {

	}

}
