package com.capgemini.training.client;

import com.capgemini.training.day4.lab4.Exercise1.Account;
import com.capgemini.training.day4.lab4.Exercise1.CurrentAccount;
import com.capgemini.training.day4.lab4.Exercise1.SavingsAccount;

public class AccountTester {
	public static void main(String[] args) {

		Account a = new Account("Smith",30,34567987,2000);
		System.out.println(a);
		Account aa = new Account("Kathy",35,34567988,3000);
		System.out.println(aa);
		a.deposit(2000);
		System.out.println(a);
		aa.withdraw(2000);
		System.out.println(aa);

		SavingsAccount sAcc = new SavingsAccount("abc", 25, 745678, 8000);
		System.out.println(sAcc);

		sAcc.withdraw(4000);
		System.out.println(sAcc);

		CurrentAccount cAcc = new CurrentAccount("abc", 25, 745678, 8000,2000);
		System.out.println(cAcc);

		cAcc.withdraw(7000);
		System.out.println(cAcc);

	}
}
