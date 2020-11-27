package com.cg.training.client;

import java.util.Scanner;

import com.cg.training.service.UserValidation;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		UserValidation obj=(username,password)->{
			if(username.equals("admin") &&
					password.equals("a123")) {
				return true;
			}
			return false;
		};
		
		System.out.println("Enter username and password:");
		String uname=sc.nextLine();
		String pass=sc.nextLine();
		System.out.println(obj.validate(uname, pass));
	}

}
