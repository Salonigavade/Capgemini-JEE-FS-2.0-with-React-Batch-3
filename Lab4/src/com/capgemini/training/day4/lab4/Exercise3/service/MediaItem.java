package com.capgemini.training.day4.lab4.Exercise3.service;

public abstract class MediaItem extends Item {
private int runtime;
	
	public MediaItem(int idNum, String title, int numCopies, int runtime) {
		super(idNum, title, numCopies);
		this.runtime = runtime;
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	
	@Override
	public void print() 
	{
		super.print();
		System.out.println("Runtime: " + runtime);
	}

}
