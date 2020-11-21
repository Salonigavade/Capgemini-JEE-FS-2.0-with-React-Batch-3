package com.cg.training.service;

public class InvalidNameException extends Exception{

	private String message;
	public InvalidNameException() {
		super();
	}
	public InvalidNameException(String message) {
		//super(message);
		this.message=message;
	}
	public String getMessage() {
		return this.message;
	}
	
}
