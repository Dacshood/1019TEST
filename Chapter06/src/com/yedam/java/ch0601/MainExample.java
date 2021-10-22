package com.yedam.java.ch0601;

public class MainExample {

	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("car1 변수가 Car 객체(인스턴스)를 참조합니다.");
		
		Car car2 = new Car();
		System.out.println("car2 변수가 또 다른 Car 객체(인스턴스)를 참조합니다.");
		
		
		if(car1 == car2) {
			System.out.println("car1과 car2는 같은 객체(인스턴스)를 참조합니다.");
		} else {
			System.out.println("car1과 car2는 다른 객체(인스턴스)를 참조합니다.");
		}
		
		Car myCar = new Car(); //객체 선언이 반드시 필요 -> 인스턴스화 , 생성자를 부르는 연산
		System.out.println("제작회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색깔 : " + myCar.color);
		System.out.println("최고속도 : "+ myCar.maxSpeed);
		System.out.println("현재속도 : "+ myCar.speed);
	
		myCar.speed = 60;
		System.out.println("현재속도 : "+ myCar.speed);
	}
	

}
