package com.capgemini.training.day3.lab3;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number: ");
		int number=Integer.parseInt(sc.nextLine());
		String strNum=String.valueOf(number);

		//		System.out.println("N::"+strNum);
		//		char[] ch = strNum.toCharArray();

		char[] ch=new char[strNum.length()];	//declare char array size same as size of string

		int num=0;
		StringBuffer sb=new StringBuffer();


		for(int i=0;i<strNum.length();i++) {
			ch[i]=strNum.charAt(i);

		}

		int[] no=new int[ch.length];
		System.out.println("NO::"+no.length);
		for(int i=0;i<ch.length;i++) {
			no[i]=Integer.parseInt(String.valueOf(ch[i]));
		}
		
		
		for(int j=1;j<no.length;j++) {
			int diff=j==0?0:no[j]-no[j-1];
			sb.append(diff);
			
		}
		String s=sb.toString();
		s.split("-");

		System.out.println(s);

		
		
		

//		System.out.print("Enter a number: ");  
//		int num= sc.nextInt();
//		
//		Integer obj=new Integer(num);
//		
//		String str=obj.toString();
//		System.out.println(str);
//		
//		int n=str.length();
//		
//		char c[]=new char[n];
//		
//		int a[]=new int[n];
//		
//		int dif[]=new int[n-1];
//		
//		for(int i=0;i<n;i++) {
//			c[i]=str.charAt(i);
//			
//		}
//		
//		  for(int i=0;i<c.length;i++) { 
//			  String b=(String) String.valueOf(c[i]); 
//
//			//  System.out.println(b);
//			  
//			  a[i]=Integer.parseInt(String.valueOf(b));
//			  System.out.print(a[i]+"\t");
//			  
//			  }
//		  System.out.println();
//		 
//		StringBuffer sb = new StringBuffer(); 
//		for(int i=0;i<a.length;i++) {
//			 dif[i]=a[i]-a[i+1];
//			// sb.append(dif);
//			 System.out.print(dif[i]);
//			// System.out.println(sb.toString());
//
//			
//		}


	}

}
