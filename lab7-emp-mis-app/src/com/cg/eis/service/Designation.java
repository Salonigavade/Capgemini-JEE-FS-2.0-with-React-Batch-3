package com.cg.eis.service;

public enum Designation {
	SYSTEM_ASSOCIATE("System Associate"),
	PROGRAMMER("Programmer"),
	MANAGER("Manager"),
	CLERK("Clerk");
	
	private String designation;
	
	private Designation(String designation) {
		this.designation=designation;
	}

	public String getDesignation() {
		return designation;
	}
	
	
	
	
}
