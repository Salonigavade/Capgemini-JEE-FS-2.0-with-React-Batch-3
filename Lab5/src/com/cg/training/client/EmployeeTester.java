package com.cg.training.client;

import java.util.Scanner;

import com.cg.eis.exception.EmployeeException;

public class EmployeeTester {
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter employee name:");
		String name=sc.nextLine();

		try {
			System.out.println("Enter salary of employee:");
			Double salary=sc.nextDouble();

			if(salary<3000) {
				throw new EmployeeException("your salary is below 3000");
			}

			System.out.println("Name: "+name+"\t salary: "+salary);
		}
		catch(EmployeeException e) {
			e.printStackTrace();
		}
	}

}
