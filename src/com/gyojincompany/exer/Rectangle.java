package com.gyojincompany.exer;

public class Rectangle {
	
	int x;
	int y;
	int width;
	int height;
	
	public Rectangle(int x, int y, int width, int height) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public void show() {
		System.out.println("("+this.x+","+this.y+")에서 크기가 "+this.width+"x"+this.height+"인 사각형");
	}
	
//	public int print() {
//		System.out.println("안녕하세요");
//		int sum=10+200;
//		return sum;
//	}
	
	public int square() {
		 int area = this.width * this.height;
		 
		 return area;
	}
	
	

}
