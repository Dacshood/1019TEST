package com.yedam.java.ch01;

public class Main {

	public static void main(String[] args) {
		//generic : 타입변환=(연산) 최대한 연산을 줄이며 프로그램 성능을 향상 시키기 위해 사용
		
		//Box box = new Box();
		//box.set("홍길동");
		//Object는 하위 클래스로 타입변환 하지않음
		//String name = (String)box.get();
		Box<String> box1 = new Box<String>();
		box1.set("홍길동");
		String name = box1.get();
		//get에서 리턴해오는 타입이 Object가 아니기에 타입변환x
		//원하는 타입을 파라미터(T)로 넘기면 자동으로 내부 변환
		
//		box.set(new Apple());
//		Apple apple = (Apple)box.get();
		Box<Apple> box2 = new Box<Apple>();
		box2.set(new Apple());
		Apple apple = box2.get();
	
		Printer<Powder> powderPrinter = new Printer<Powder>();
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powder);
		
		Printer<Plastic> plasticPrinter = new Printer<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plastic);
				
	
	
	
	
	
	
	}

}
