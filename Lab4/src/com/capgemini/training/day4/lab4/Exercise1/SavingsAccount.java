package com.capgemini.training.day4.lab4.Exercise1;

public class SavingsAccount extends Account {
	
	public SavingsAccount(String name, float age, long accNum, double balance) {
		super(name, age, accNum, balance);
	}

	private final double minBalance=1000;

	@Override
	public void withdraw(double bal) {

		if((super.getBalance()-bal)<this.minBalance)
			System.out.println("Sorry !! Minimun balance should be INR 1000");
		else
			super.setBalance(super.getBalance()-bal);
	}


	//	public void withdraw(Double balance) {
	//		if(balance>minBalance) {
	//		Double b=this.getBalance()-balance;
	//		balance=b;
	//		}
	//		else {
	//			System.out.println("Balance is less than min balance");
	//		}
	//	}
}
