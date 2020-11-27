package com.cg.training.client;

import java.util.Scanner;

import com.cg.training.service.StringInterface;

public class Exercise2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		StringInterface strObj=(str)->{
			String str2="";
			for(int i=0;i<str.length();i++) {
				str2+=str.charAt(i)+" ";
			}

			return str2;
			
			//StringBuilder sb=new StringBuilder(str);
			//Char s=str.charAt(0).split(" ");
			//			String r = null;
			//			sb.append(str.charAt(0));
			//			for(int i=1;i<str.length();i++) {
			//				sb.append(" ");
			//				sb.append(str.charAt(i));				
			//			}
			//			r=sb.toString();
			//			return result;
			//			String r=null;
			//			if(str.length()>0) {
			//				sb.append(str.charAt(0));
			//				for(int i=1;i<str.length();i++) {
			//					sb.append(" ");
			//				sb.append(str.charAt(i));
			//				}
			//				
			//			}
			//			return sb.toString();
		};

		System.out.println("Enter string:");
		String s=sc.nextLine();
		System.out.println("String after spaces is:"+strObj.spaceStr(s));
	}

}
