package com.gyojincompany.ch04;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle cir1 = new Circle(100, "donut");//메모리에 cir1이라는 인스턴스가 생성
		
//		cir1.radius = 10;
//		cir1.name = "pizza";
		
		System.out.println(cir1.name);
		System.out.println(cir1.radius);
		
//		double cirArea = cir1.printArea("ham");
		
//		System.out.println(cirArea);
		
		Student stu1 = new Student();
		
		stu1.name = "김유신";
		
		Student stu2 = new Student("홍길동", 17, 3, "a1022");
		
		Student stu3 = new Student("이순신", 43, 2, "b2022");
		
		Student stu4 = new Student();
		
		Student stu5 = new Student("강감찬", 27);
		
		
		
	}

}
