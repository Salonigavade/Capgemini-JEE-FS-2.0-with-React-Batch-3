package com.capgemini.training.day1.lab1;

import java.util.Scanner;

public class Exercise7 {
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=false;
		System.out.println("Enter a number: ");
		int num=sc.nextInt();

		int currentDigit = num % 10;
		num = num/10;

		while(num>0){
			if(currentDigit <= num % 10){
				flag = true;
				break;
			}

			currentDigit = num % 10;
			num = num/10;
		}

		if(flag){
			System.out.println("Digits are not in increasing order.");
		}else{
			System.out.println("Digits are in increasing order.");
		}
	}

}
