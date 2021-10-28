package com.yedam.java.ch03_02;

public abstract class Animal {
	//필드
	public String kind;
	
	//생성자
	
	
	//메소드
	public void breath() {
		System.out.println("숨을 쉽니다.");
	}
	//추상메소드 선언
	public abstract void sound();
}
