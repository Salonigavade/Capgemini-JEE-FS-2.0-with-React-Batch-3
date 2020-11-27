package com.cg.training.client;

import java.util.Scanner;
import java.util.stream.LongStream;

import com.cg.training.service.Factorial;

public class Exercise5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Factorial obj=(no)->{
//			 return LongStream.rangeClosed(1, no)
//				        .reduce(1, (long x, long y) -> x * y);
				

			int fact=1;
			for(int i=no;i>=1;i--) {
				fact=fact*i;
			}
			
			return fact;
			
		};
		
		System.out.println("Enter num to find factorial:");
		int num=sc.nextInt();
		System.out.println(obj.findFacto(num));

	}

}
