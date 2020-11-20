package com.capgemini.training.day1.lab1;

import java.util.Scanner;

public class Exercise4 {
private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag;
		System.out.println("Enter number : ");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			if(i==0 || i==1)
				continue;
			flag=1;
			for(int j=2;j<=i/2;++j) {
				if(i%j==0) {
					flag=0;
					break;
				}
			}
			if(flag==1)
				System.out.println(i);
		}
	}

}
