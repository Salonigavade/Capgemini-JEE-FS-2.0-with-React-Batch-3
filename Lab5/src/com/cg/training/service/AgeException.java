package com.cg.training.service;

public class AgeException extends Exception {
	private String msg;
	
	public AgeException() {
		super();
	}

	public AgeException(String msg) {
		this.msg=msg;
		
	}
	
	public String getMessage() {
		return this.msg;
		
	}
}
