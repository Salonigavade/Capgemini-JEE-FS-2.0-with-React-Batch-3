package com.capgemini.training.day4.lab4.Exercise3.client;

import com.capgemini.training.day4.lab4.Exercise3.service.Book;
import com.capgemini.training.day4.lab4.Exercise3.service.CD;
import com.capgemini.training.day4.lab4.Exercise3.service.JournalPaper;
import com.capgemini.training.day4.lab4.Exercise3.service.Video;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//testing book
		Book book = new Book(1, "zxc", 12, "ljh");
		book.print();
		book.checkIn();
		book.print();
		//testing  journal paper
		JournalPaper jp = new JournalPaper(2, "jv", 44, "abc", 2001);
		jp.print();
		jp.checkOut();
		jp.print();
		//testing video
		Video video = new Video(100, "AA", 2, 4, "sdf", "love", 1989);
		video.print();
		video.checkIn();
		video.print();
		//testing cd
		CD cd = new CD(101, "JK", 1, 9, "lmn", "story");
		cd.print();
		cd.checkOut();
		cd.print();
	}

}
