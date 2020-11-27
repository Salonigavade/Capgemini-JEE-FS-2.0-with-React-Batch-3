package com.cg.training.lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Map<Integer, Integer> myList = new HashMap<>();		
		getValues(myList);		
	}

	private static void getValues(Map<Integer, Integer> myList) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		Integer[] arr1=new Integer[size];
		Integer[] arr=new Integer[size];
	
		for (int i = 0; i <size; i++) {
				System.out.println("Enter key value");
				arr1[i]=sc.nextInt();
				
				//System.out.println("Enter element value");
				//arr[i]=sc.nextInt();
				arr[i]=arr1[i]*arr1[i];
				myList.put(arr1[i],arr[i]);
		}
		sc.close();
		System.out.println("--------------");	
		for (Map.Entry<Integer, Integer> e : myList.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}	
	}

}