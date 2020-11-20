package com.capgemini.training.day1.lab1;

import java.util.Scanner;

public class Exercise3 {
	private static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		x=0;
		y=1;
		System.out.println("Enter the vallue of n: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		a[0]=x;
		a[1]=y;
		for(int i=2;i<n;i++) {
			a[i]=a[i-1]+a[i-2];
		}
		System.out.println("----Fibonicci without recursion----");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+"\t");
		}
System.out.println();
		
		System.out.println("----Fibonicci with recursion-----");
		Fibo f=new Fibo();
		for(int k=0;k<n;k++){
			System.out.print(f.calculateFibo(k)+"\t");
		}
	}

}
class Fibo{
	public int calculateFibo(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		else {
			return calculateFibo(n-1)+calculateFibo(n-2);
		}	
	}
}
