package com.cg.training.lab6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise5 {

	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arrayList=new ArrayList<>();
		System.out.println("Enter the size:");
		int size=sc.nextInt();
		Integer [] arr=new Integer[size];
		System.out.println("Enter elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			//arrayList.add(arr[i]);
		}
		sc.close();
		int result=getSecondSmallest(arr);
		//System.out.println(arrayList);
		
		System.out.println("Second smallest element in list:"+result);
		
		
		

	}
	private static int getSecondSmallest(Integer[] arr) {
		List<Integer> list=Arrays.asList(arr);
		Collections.sort(list);
		return list.get(1);
	}

}