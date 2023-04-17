package com.gyojincompany.exer;

public class TV {
	
	String brandName;
	int year;
	int inch;
	
	public TV(String brandName, int year, int inch) {
		super();
		this.brandName = brandName;
		this.year = year;
		this.inch = inch;
	}

	public void show() {
		System.out.println(this.brandName +"에서 만든 " + this.year + "년형 " + this.inch + "인치 TV");
	}
}
