package com.spring.core;

public class personException extends Exception {
	private String message;
	
	public personException() {
		
	}
	public personException(String message) {
		super(message);
		this.message=message;
	}
}
