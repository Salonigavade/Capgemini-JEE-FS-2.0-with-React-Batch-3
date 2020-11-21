package com.capgemini.training.day2.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {

	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter array size : ");
		int n=sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements : ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int num=getSecondSmallest(arr);
		System.out.println("Second smallest no is: "+num);
		
	}
	private static int getSecondSmallest(int[] arr) {
		// TODO Auto-generated method stub
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr[1];
	}
	
}
