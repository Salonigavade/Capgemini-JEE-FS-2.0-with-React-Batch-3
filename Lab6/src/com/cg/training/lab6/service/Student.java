package com.cg.training.lab6.service;

import java.util.Arrays;

public class Student {
	private String name;
	private Integer rollNo;
	private Integer marks;
	private StudentMedal medal;

	public Student() {
		
	}

	public Student(String name, Integer rollNo, Integer marks, StudentMedal medal) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
		this.medal = medal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public StudentMedal getMedal() {
		return medal;
	}

	public void setMedal(StudentMedal medal) {
		this.medal = medal;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", marks=" + marks + ", medal=" + medal + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((marks == null) ? 0 : marks.hashCode());
		result = prime * result + ((medal == null) ? 0 : medal.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((rollNo == null) ? 0 : rollNo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (marks == null) {
			if (other.marks != null)
				return false;
		} else if (!marks.equals(other.marks))
			return false;
		if (medal != other.medal)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rollNo == null) {
			if (other.rollNo != null)
				return false;
		} else if (!rollNo.equals(other.rollNo))
			return false;
		return true;
	}

	
	
	
	

//	public StudentMedal mark() {
//	//	for(int i=0;i<marks.length;i++) {
//			if(this.marks>=90) {
//				
//				return this.medal=StudentMedal.GOLD;
//			}
//			else if(this.marks>=80 && this.marks<90 ) {
//				return this.medal=StudentMedal.SILVER;
//			}
//			else if(this.marks>=70 && this.marks<80 ) {
//				return this.medal=StudentMedal.BRANZE;
//			}
//		//}
//		return null;
//	}
}
