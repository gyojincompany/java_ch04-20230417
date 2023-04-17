package com.gyojincompany.ch04;

public class Circle {
	
	int radius;
	String name;
	//멤버변수 or 필드 or 속성 선언
	
//	public Circle() {
//		
//	}
	
//	public Circle() {//기본생성자
//		int radius = 100;
//		String name = "donut";
//		this.radius = radius;
//		this.name = name;
//	}
	
	public Circle(int radius, String name) {
		
		this.radius = radius;
		this.name = name;
	}
	
	public double printArea(String name) {
		
		double area = this.radius * this.radius * 3.14;
		
		System.out.println(this.name);
		
		return area;
	}
	

}
