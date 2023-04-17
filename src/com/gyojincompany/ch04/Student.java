package com.gyojincompany.ch04;

public class Student {
	
	String name;
	int age;
	int grade;
	String hakbun;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, int grade, String hakbun) {
		super();
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.hakbun = hakbun;
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	

}
