package com.cg.training.service;

import java.time.LocalDateTime;
import java.util.Date;

public class Timer implements Runnable {
	private String name;
	public Timer() {

	}
	public Timer(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}
	@Override
	public void run() {
		while(true) {
			System.out.println("I am "+Thread.currentThread().getName()+" Timer started:" +LocalDateTime.now());
			refresh();
			System.out.println("I am "+Thread.currentThread().getName()+" Timer ended:" + LocalDateTime.now());
		}
	}

	private void refresh() {
		try {
			Thread.sleep(10000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
	}

}
