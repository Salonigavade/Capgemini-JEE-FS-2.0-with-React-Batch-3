package com.cg.training.client;

import com.cg.training.service.Timer;

public class TimerTester {

	public static void main(String[] args) {
		Runnable runnable=new Timer();
		Thread t1=new Thread(runnable,"Demo");
		t1.start();
		
	}

}
