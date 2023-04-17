package com.gyojincompany.exer;

public class MainRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);

		r.show();
		int area = s.square();
		System.out.println("s의 면적은 " + area);
		System.out.println("s의 면적은 " + s.square());
		
		s = r;//s는 r이 되는것
		
		s.show();
		
		int a = 10;
		int b = 20;
		b = a;//b=10
	}

}
