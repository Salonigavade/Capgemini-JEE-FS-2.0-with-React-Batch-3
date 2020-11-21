package com.cg.training.client;

import java.util.Scanner;

import com.cg.training.service.InvalidNameException;

public class NameTester {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter First Name:");
		String fname=sc.nextLine();
		System.out.println("Enter last Name:");
		String lname=sc.nextLine();
		sc.close();
		try {
			if(fname=="" && lname==""){
				throw new InvalidNameException("Name is not valid");
			}
			
			System.out.println("Name is valid..."+fname+" "+lname);
		
		}catch (InvalidNameException e) {
			e.printStackTrace();
		}
	}


}

