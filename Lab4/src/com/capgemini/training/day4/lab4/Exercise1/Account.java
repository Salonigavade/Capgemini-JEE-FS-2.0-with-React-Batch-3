package com.capgemini.training.day4.lab4.Exercise1;


public class Account {

	private long accNum;
	private double balance;
	private Person accHolder;
	
	public Account(String name,float age,long accNum,double balance)
	{
		this.accNum=accNum;
		this.balance=balance;
		Person p = new Person(name,age);
		accHolder = p;
	}
	
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double bal)
	{
		this.balance += bal;
	}
	public void withdraw(double bal)
	{
		if((this.balance-bal)<500)
			System.out.println("Sorry, Minimun balance should be INR 500");
		else
			this.balance -= bal;
	}

	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + accHolder + "]";
	}
	
	

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}

	public void deposite(Double balance) {
		Double b=this.getBalance()+balance;
		balance=b;
	}

	public void withdraw(Double balance) {
		Double b=this.getBalance()-balance;
		balance=b;
	}

}
