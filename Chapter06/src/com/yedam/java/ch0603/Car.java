package com.yedam.java.ch0603;

public class Car {
	//필드 
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	int speed;
	
	//생성자 매개변수 this. : 구분지을때 사용 명시적으로 생성자 선언했을때 선언한 매개변수만 사용
	//생성자 오버로딩 : 생성자를 여러개 만들수있음.
	Car(){
		
	}
	Car(String model){
		//this.model = model;
		this(model,"은색",250);
	}
	
	Car(String model, String color){
//		this.model = model;
//		this.color = color;
		this(model,color,250);
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	//메소드

}
