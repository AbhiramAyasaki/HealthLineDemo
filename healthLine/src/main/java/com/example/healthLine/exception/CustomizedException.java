package com.example.healthLine.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class CustomizedException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomizedException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public CustomizedException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
