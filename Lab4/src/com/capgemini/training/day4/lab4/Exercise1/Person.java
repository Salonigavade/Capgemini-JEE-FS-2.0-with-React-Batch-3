package com.capgemini.training.day4.lab4.Exercise1;

public class Person {
	private String name;
	private Float age;
	
	public Person() {
		
	}

	public Person(String name, Float age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getAge() {
		return age;
	}

	public void setAge(Float age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
