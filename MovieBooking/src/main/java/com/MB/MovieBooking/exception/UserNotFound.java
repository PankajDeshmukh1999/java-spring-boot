package com.MB.MovieBooking.exception;

public class UserNotFound extends Exception {

	public UserNotFound(String message) {
		System.out.println("User is not valid");
	}

}
