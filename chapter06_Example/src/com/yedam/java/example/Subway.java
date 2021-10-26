package com.yedam.java.example;

public class Subway {
	//필드
	private String lineNumber;
	private int passengerCount;
	private int money;

	//생성자
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}

	//메소드 
	public void take(int money) {
		this.money += money;
		this.passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(lineNumber + " 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다.");
	}
}
