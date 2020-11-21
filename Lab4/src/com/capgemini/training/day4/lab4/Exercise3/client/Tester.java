package com.capgemini.training.day4.lab4.Exercise3.client;

import com.capgemini.training.day4.lab4.Exercise3.service.Book;
import com.capgemini.training.day4.lab4.Exercise3.service.CD;
import com.capgemini.training.day4.lab4.Exercise3.service.JournalPaper;
import com.capgemini.training.day4.lab4.Exercise3.service.Video;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book = new Book(1, "zxc", 12, "ljh");
		book.print();
		book.checkIn();
		book.print();
		
		JournalPaper jp = new JournalPaper(2, "jv", 44, "abc", 2001);
		jp.print();
		jp.checkOut();
		jp.print();
		
		Video video = new Video(100, "DJ", 2, 4, "sdf", "faith", 1989);
		video.print();
		video.checkIn();
		video.print();
	
		CD cd = new CD(101, "JK", 1, 9, "lmn", "Comedy");
		cd.print();
		cd.checkOut();
		cd.print();
	}

}
