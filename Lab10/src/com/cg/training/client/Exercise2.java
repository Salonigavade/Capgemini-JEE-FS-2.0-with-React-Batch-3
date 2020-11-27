package com.cg.training.client;

import java.io.File;
import java.util.Scanner;

public class Exercise2 {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter file name:");
		String path=sc.nextLine();
		File f=new File("E:\\Program Files\\eclipse-workplace\\cg-2020\\Lab10\\src\\com\\cg\\training\\client\\source1.txt");
		System.out.println("name :"+f.getName());
		System.out.println("path:"+f.getAbsolutePath());
		System.out.println("File exists: "+f.exists());
		System.out.println("File is readable: "+f.canRead());
		System.out.println("File is writable: "+f.canWrite());
		System.out.println("Is a directory: "+f.isDirectory());
		System.out.println("length of the file: "+f.length()+" bytes");
	}

	
}
