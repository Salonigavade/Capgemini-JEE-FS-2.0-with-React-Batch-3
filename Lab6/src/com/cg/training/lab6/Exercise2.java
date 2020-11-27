package com.cg.training.lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Exercise2 {
	//	static final int MAX_CHAR = 256; 
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter String:");
		String str=sc.nextLine();
		countChars(str);
	}
	private static void countChars(String str) {
		Map<Character, Integer> numCharMap = new HashMap<Character, Integer>();
		for(int i = 0; i < str.length(); i++){
			
			char c = str.charAt(i);
			
			if(c == ' ')
				continue;
			
			if(numCharMap.containsKey(c)){
				numCharMap.put(c, numCharMap.get(c) + 1);
			}else{
				
				numCharMap.put(c, 1);
			}
		}
	
		//Set<Map.Entry<Character, Integer>> numSet = numCharMap.entrySet();
		for(Map.Entry<Character, Integer> m : numCharMap.entrySet()){
			System.out.println("Char- " + m.getKey() + " Count " + m.getValue());
		}
	}


}


