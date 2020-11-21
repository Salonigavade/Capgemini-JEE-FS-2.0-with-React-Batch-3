package com.capgemini.training.day2.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size=Integer.parseInt(sc.nextLine());
		
		String [] names=new String[size];
		System.out.println("Enter the names") ;
		for(int i=0;i<size;i++) {
			names[i]=sc.nextLine();
		}
		
		String s=sortString(names);
		
		
		
	}

	private static String sortString(String[] names) {
		Arrays.sort(names);
		int len=names.length;
		int mid=len/2;
		System.out.println("Resultant array is: ");
		if(len%2==0) {
			for(int i=0;i<mid;i++) {
				System.out.println(names[i].toUpperCase());
			}
			for(int j=mid;j<len;j++)//int j=len-1;j>=len/2;j--
			{
				System.out.println(names[j].toLowerCase());
			}
		}
		else {
			for(int i=0;i<(mid)+1;i++) {
				System.out.println(names[i].toUpperCase());
			}
			for(int j=(mid+1);j<len;j++)//int j=len-1;j>=len/2;j--
			{
				System.out.println(names[j].toLowerCase());
			}
		}
		
		return null;
	}

}
