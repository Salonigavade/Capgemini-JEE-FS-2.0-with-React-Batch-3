package com.cg.training.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckeExceptionDemo {

	public static void main(String[] args) throws IOException {
		String names[]= new String[4];
		getNames(names);
		showNames(names);

	}

	//try.. with resource
	private static void getNames(String[] names) {
		try(
				BufferedReader br= 
				new BufferedReader(new InputStreamReader(System.in));	
				){
			for(int i=0; i<names.length;i++) {
				System.out.println("Enter name: "+ (i+1));
				names[i]= br.readLine();
			}

		}catch(IOException e) {
			e.printStackTrace();
		}

	}

	//	private static void getNames(String[] names) throws IOException {
	//		BufferedReader br= 
	//				new BufferedReader(new InputStreamReader(System.in));
	//		for(int i=0; i<names.length;i++) {
	//			System.out.println("Enter name: "+ (i+1));
	//			names[i]= br.readLine();
	//		}
	//		
	//	}

	private static void showNames(String[] names) {
		for(String n: names) {
			System.out.println(n);
		}

	}

	//	private static void getNames(String[] names) {
	//		BufferedReader br=null;
	//		try {
	//			br= new BufferedReader(new InputStreamReader(System.in));
	//			for(int i=0; i<names.length;i++) {
	//				System.out.println("Enter name: "+ (i+1));
	//				names[i]= br.readLine();
	//			}
	//		}catch(IOException e) {
	//			e.printStackTrace();
	//		}finally {
	//			try {
	//				br.close();
	//			} catch (IOException e) {				
	//				e.printStackTrace();
	//			}
	//		}
	//		
	//	}

}
