package com.cg.training.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class CopyDataThread implements Runnable{

	@Override
	public void run() {
		try {
			File fin = new File("E:\\Program Files\\eclipse-workplace\\capgemini-nov-2020\\Lab8\\src\\source.txt");
			FileInputStream fis = new FileInputStream(fin);
			BufferedReader in = new BufferedReader(new InputStreamReader(fis));

			FileWriter fstream = new FileWriter("E:\\Program Files\\eclipse-workplace\\capgemini-nov-2020\\Lab8\\src\\target.txt", true);
			BufferedWriter out = new BufferedWriter(fstream);


			String aLine = null;
			int cnt=0;
			while ((aLine = in.readLine()) != null) {

				for(int i=0;i<aLine.length();i++) {

					out.write(aLine.charAt(i));
					cnt++;

					if(cnt==10) {
						System.out.println("10 char are read");
						Thread.sleep(3000);
						cnt=0;
					}							
				}
				out.newLine();
			}
			in.close();

			out.close();
		}catch(IOException | InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Done task");
		}

	}



}
