package com.customExceptions;

public class InvalidDenominatorException extends Exception {

	private String message;
	
	public InvalidDenominatorException(String message) {
		this.message=message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
}
