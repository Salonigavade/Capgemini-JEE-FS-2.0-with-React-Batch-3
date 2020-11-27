package com.cg.eis.exception;

public class EmployeeException extends Exception{
	private String message;
	
	public EmployeeException() {
		super();
	}

	public EmployeeException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		return this.message+ "\n"+super.getMessage();
	}
	
	
}
