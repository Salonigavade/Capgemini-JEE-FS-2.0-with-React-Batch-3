package com.capgemini.training.day4.lab4.Exercise1;

public class CurrentAccount extends Account {
	private Double overDraftLimit;
	
	public CurrentAccount(String name, float age, long accNum, double balance,double overdraftLimit) {
		super(name, age, accNum, balance);
		this.overDraftLimit=overdraftLimit;
	}

	@Override
	public String toString() {
		
		return super.toString()+" CurrentAccount [overdraftLimit=" + overDraftLimit + "]";
	}



	@Override
	public void withdraw(double bal) {
		
		double overBalance=super.getBalance()+this.overDraftLimit;
		
		if((overBalance - bal)<0)
		{
			System.out.println("Overdraft limit reached");
		}
		else
		{
			if(super.getBalance()<bal)
			{
				super.setBalance(0);
				this.overDraftLimit = overBalance-bal;
			}
			else
			{
				super.setBalance(super.getBalance()-bal);
			}
		}
		
	}
	
//	public void withdraw(Double balance) {
//		if(balance>overDraftLimit) {
//			System.out.println("u have reached overdraft limit");
//		}
//		else {
//			Double b=this.getBalance()-balance;
//			balance=b;
//		}
//		
//	}
}
