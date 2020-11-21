package com.capgemini.training.day3.lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string : ");
		String str=sc.nextLine();

		boolean result=positiveString(str);
		if(result)
			System.out.println(result+" : "+str +" is psitive");
		else
			System.out.println(result+" : "+str +" is not psitive");



	}

	private static boolean positiveString(String str) {
		int len=str.length();

		char[] ch=new char[len];

		for(int i=0;i<len;i++) {
			ch[i]=str.charAt(i);
		}

		Arrays.sort(ch);

		for(int i=0;i<len;i++) {
			if(ch[i]!=str.charAt(i)) {
				return false;
			}

		}

		return true;
	}

}
