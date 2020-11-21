package com.capgemini.training.day3.lab3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the text");
//		String str=sc.nextLine();

		BufferedReader br=null;

		int lineCnt=0;
		int charCnt=0;
		int wordCnt=0;

		try {
		//	br=new BufferedReader(new InputStreamReader(System.in));
			br=new BufferedReader(new FileReader("E:\\Program Files\\eclipse-workplace\\capgemini-nov-2020\\Lab3\\text"));

			String line=br.readLine();
			while(line!=null) {

				lineCnt++;

				String [] word=line.split(" ");
				wordCnt=wordCnt+word.length;

				for(String s:word) {
					charCnt=charCnt+s.length();
				}
				line=br.readLine();
			}
			//}
			System.out.println("No of Words: "+wordCnt);
			System.out.println("No of characters: "+charCnt);
			System.out.println("No of lines: "+lineCnt);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally{
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
