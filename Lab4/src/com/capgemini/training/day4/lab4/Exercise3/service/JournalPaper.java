package com.capgemini.training.day4.lab4.Exercise3.service;

public class JournalPaper extends WrittenItem{
	private int year;

	public JournalPaper(int idNum, String title, int numCopies, String author, int year) {
		super(idNum, title, numCopies, author);
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public void print() 
	{
		super.print();
		System.out.println("Year: " + year);
	}

}
