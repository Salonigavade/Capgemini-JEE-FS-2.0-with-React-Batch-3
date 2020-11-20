package com.capgemini.training.day1.lab1;

import java.util.Scanner;

public class Exercise2 {
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch=0;
//		do {
			System.out.println("Enter your choice: ");
			System.out.println("1.Red\n2.Yelloe\n3.Green");
			ch=sc.nextInt();
			switch(ch){
			case 1: System.out.println("Stop");
					break;
			case 2: System.out.println("Ready");
					break;
			case 3: System.out.println("Go");
					break;
			default: System.out.println("Invalid Choice");
			}
//		}while(ch!=3);
		
	}

}
