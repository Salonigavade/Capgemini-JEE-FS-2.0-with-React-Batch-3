package com.capgemini.training.day2.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
//		int size=Integer.parseInt(sc.nextLine());
		int size=sc.nextInt();
		
		int [] arr=new int[size];
		System.out.println("Enter array elemts: ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int a=modifyArray(arr);
		System.out.println("Resultant array: ");
		for(int i=0;i<a;i++) {
			System.out.print(arr[i]+ "\t");
		}
		
	}

	private static int modifyArray(int[] arr) {
		Arrays.sort(arr);
		int n=arr.length;
		int temp[]=new int[n];
		int j=0;
		for(int i=0;i<(n-1);i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j++]=arr[i];
			}
		}
		temp[j++]=arr[n-1];
		
		for(int i=0;i<j;i++) {
			arr[i]=temp[i];
		}
		return j;
	}	

}
