package com.yedam.java.example;

public class Student {
	
	//필드
	private String studentName;
	private int money;
	
	//생성자
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	//메소드 -> 동작하는 행위 : 동사
	public void takeBus(Bus bus) {
		//버스에 요금을 지불하다
		bus.take(1000);
		this.money -= 1000;
	}
	public void takeSubway(Subway subway) {
		//지하철에 요금을 지불하다
		subway.take(1500);
		this.money -= 1500;
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "입니다.");
	}
	
}
