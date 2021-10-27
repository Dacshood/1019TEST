package com.yedam.java.ch01_01;

public class Computer extends Calculator{

	@Override
	double areCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		 return Math.PI * r * r;
	
	}
	//@Override 이 메소드가 오버라이딩 되고있다고 명시

	
	
	
}
