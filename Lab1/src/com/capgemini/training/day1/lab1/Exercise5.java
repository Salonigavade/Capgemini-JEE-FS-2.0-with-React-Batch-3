package com.capgemini.training.day1.lab1;

import java.util.Scanner;

public class Exercise5 {

	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		int n=sc.nextInt();
		long sum=claculateSum(n);
		System.out.println("Sum = "+sum);
		
	}
	private static long claculateSum(int num) {
		// TODO Auto-generated method stub
		long result=0;
//		while(num<0) {
//			if(num%3==0 || num%5==0) {
//				result=result+num;
//			}
//			num--;
//		}
		for(int i=1;i<=num;i++) {
			if(num%3==0 || num%5==0) {
				result=result+i;
			}
		}
		return result;
	}

}
