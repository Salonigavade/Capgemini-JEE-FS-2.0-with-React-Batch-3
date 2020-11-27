package com.cg.training.lab6.client;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.cg.training.lab6.service.Student;
import com.cg.training.lab6.service.StudentMedal;

public class Exercise4Tester {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {

		HashMap<Integer,Student> obj=new HashMap<>();
		HashMap<Integer,Student> obj2=getStudents(obj);
		for(Map.Entry<Integer,Student> list:obj2.entrySet()) {
			System.out.println(list.getKey()+":"+list.getValue());
		}
		//		

	}
	private static HashMap<Integer, Student> getStudents(HashMap<Integer, Student> obj) {
		//		System.out.println("Number of students:");
		//		int num=sc.nextInt();
		//		Student s[]=new Student[num];
		Student s=new Student();
		Student s2=new Student();


		System.out.println("Enter the name,rollno,marks of student 1:");
		String name=sc.nextLine();
		int n=sc.nextInt();
		int m=sc.nextInt();
		s.setName(name);s.setRollNo(n);s.setMarks(m);
		if(s.getMarks()>=90) {
			s.setMedal(StudentMedal.GOLD);
		}else if(s.getMarks()>=80 && s.getMarks()<90) {
			s.setMedal(StudentMedal.SILVER);
		}else if(s.getMarks()>=70 && s.getMarks()<80) {
			s.setMedal(StudentMedal.BRONZE);
		}else {
			s.setMedal(StudentMedal.NOTAPPLICABLE);
			//System.out.println("Not applicable for scholorship");
		}

		Student s3=new Student("ABC3",102,60,StudentMedal.BRONZE);
		Student ss[]=new Student[]{s,s3};
		for(int i=0;i<ss.length;i++) {
			if(ss[i].getMarks()<60) {
				System.out.println("Marks are less, not applicable for scholorship");
			}
			else {
				obj.put(ss[i].getRollNo(),ss[i]);
			}
		}
		obj.put(s.getRollNo(),s);
		obj.put(s3.getRollNo(),s3);

		return obj;

		//		for(int i=0;i<num;i++) {
		//			System.out.println("Enter the name,rollno,marks of student2:");
		//			String name=sc.nextLine();
		//			sc.nextLine();
		//			int roll=sc.nextInt();
		//			int mark=sc.nextInt();
		//			s[i].setName(name);
		//			s[i].setRollNo(roll);
		//			s[i].setMarks(mark);
		//
		//		}
		//		for(int i=0;i<num;i++) {
		//			if(s[i].getMarks()>=90) {
		//				s[i].setMedal(StudentMedal.GOLD);
		//			}else if(s[i].getMarks()>=80 && s[i].getMarks()<90) {
		//				s[i].setMedal(StudentMedal.SILVER);
		//			}else if(s[i].getMarks()>=70 && s[i].getMarks()<80) {
		//				s[i].setMedal(StudentMedal.BRONZE);
		//			}else {
		//				System.out.println("Not applicable for scholorship");
		//			}
		//		}
		//		for(int i=0;i<num;i++) {
		//			obj.put(s[i].getRollNo(),s[i]);
		//		}
		//		

		//		for(Map.Entry<Integer,Student> list:obj.entrySet()) {
		//			System.out.println(list.getKey()+":"+list.getValue());
		//		}
		//

		//		Student s=new Student();
		//		System.out.println("Enter ame , roll, marks od student");
		//		String name=sc.nextLine();
		//		int n=sc.nextInt();
		//		int m=sc.nextInt();
		//		s.setName(name);s.setRollNo(n);
		//		s.setMarks(m);
		//		if(m>=90)
		//		{
		//			s.setMedal(StudentMedal.GOLD);
		//		}else if(m>=80 && m<90) {
		//			s.setMedal(StudentMedal.SILVER);
		//
		//		}
		//		System.out.println(s.getName()+s.getRollNo()+s.getMarks()+s.getMedal());
		//		Student s2=new Student("ABC2",101,80,StudentMedal.SILVER);
		//		System.out.println(s2.getName()+s2.getRollNo()+s2.getMarks()+s2.getMedal());
		//
		//		obj.put(s.getRollNo(),s);
		//		obj.put(s2.getRollNo(),s2);
		//		System.out.println(obj);


		//		Student s1=new Student("ABC",100,99,StudentMedal.GOLD);;
		//		Student s2=new Student("ABC2",101,80,StudentMedal.SILVER);;
		//		Student s3=new Student("ABC3",102,60,StudentMedal.BRANZE);
		//		System.out.println(s1.getName()+s1.getRollNo()+s1.getMarks()+s1.getMedal());
		//		
		//		obj.put(s1.getRollNo(),s1);
		//		//System.out.println(obj);
		//
		//		obj.put(s2.getRollNo(),s2);
		//		obj.put(s3.getRollNo(),s3);
		//
		//		System.out.println(obj);

		//HashMap<Integer,Student> obj3=obj;
		//		for(Map.Entry<Integer,Student> s:obj.entrySet()) {
		//			System.out.println(s.getKey()+":"+s.getValue());
		//		}
		//		
	}


}
