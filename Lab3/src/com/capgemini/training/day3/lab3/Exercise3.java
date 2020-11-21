package com.capgemini.training.day3.lab3;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string : ");
		String str=sc.nextLine();
		String result=alterString(str);
		System.out.println("Result: "+result);
	}

	private static String alterString(String str) {
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(!checkVowel(ch[i])) {
				if(ch[i]=='z') {
					ch[i]= 'b';
				}
				else {
					ch[i]=(char) (ch[i]+1);
					if(checkVowel(ch[i])) {
						ch[i]=(char) (ch[i]+1);
					}
				}
			}
		}
		return String.valueOf(ch);
	}
	
	static boolean checkVowel(char ch) {
		if( ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u') {
			return false;
		}
		return true;
		
	}

}
