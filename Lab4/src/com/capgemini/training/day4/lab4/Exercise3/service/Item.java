package com.capgemini.training.day4.lab4.Exercise3.service;

public abstract class Item {
	private Integer identificationNumber;
	private String title;
	private Integer noOfCopies;
	
	public Item() {
		
	}

	public Item(Integer identificationNumber, String title, Integer noOfCopies) {
		super();
		this.identificationNumber = identificationNumber;
		this.title = title;
		this.noOfCopies = noOfCopies;
	}

	public Integer getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(Integer identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(Integer noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	@Override
	public String toString() {
		return "Item [identificationNumber=" + identificationNumber + ", title=" + title + ", noOfCopies=" + noOfCopies
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((identificationNumber == null) ? 0 : identificationNumber.hashCode());
		result = prime * result + ((noOfCopies == null) ? 0 : noOfCopies.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (identificationNumber == null) {
			if (other.identificationNumber != null)
				return false;
		} else if (!identificationNumber.equals(other.identificationNumber))
			return false;
		if (noOfCopies == null) {
			if (other.noOfCopies != null)
				return false;
		} else if (!noOfCopies.equals(other.noOfCopies))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	public void checkIn() {
		noOfCopies = noOfCopies + 1;
	}
	
	public void checkOut() {
		noOfCopies = noOfCopies - 1;
	}
	
	public void print() {
		System.out.println("ID: " + identificationNumber);
		System.out.println("Title: " + title);
		System.out.println("Number of copies: " + noOfCopies);
	}
	
	public void addItem(int identificationNumber, String title, int  noOfCopies) {
		setIdentificationNumber(identificationNumber);
		setTitle(title);
		setNoOfCopies( noOfCopies);
	}
}

