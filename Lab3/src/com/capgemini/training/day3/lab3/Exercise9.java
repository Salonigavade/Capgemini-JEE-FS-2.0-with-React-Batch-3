package com.capgemini.training.day3.lab3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		Date today=new Date();
//		System.out.println(today);
//		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
//			//convert Date to String
//		String todayFormatted=sdf.format(today);
//		System.out.println(todayFormatted);
		
		System.out.println("Enter date(dd/MM/yyyy) : ");
		String date=sc.nextLine();
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date1=LocalDate.parse(date,formatter);
		System.out.println("Date is : "+date1);
	}

}
