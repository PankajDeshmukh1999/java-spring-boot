package com.example.Movie201.exceptions;

public class TicketNotFound extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TicketNotFound() {
	}
	
	public TicketNotFound(String massage) {
		super(massage);
	}

	public TicketNotFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public TicketNotFound(String message, Throwable cause) {
		super(message, cause);
	}

	public TicketNotFound(Throwable cause) {
		super(cause);
	}
	
	
	
}
