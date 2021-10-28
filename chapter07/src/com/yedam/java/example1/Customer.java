package com.yedam.java.example1;

public class Customer {
	//필드
	//고객아이디
	protected int customerID;
	//고객이름
	protected String customerName;
	//고객등급
	protected String customerGrade;
	//보너스 포인트
	protected int bonusPoint; 
	//보너스 적립비율
	protected double bonusRatio;
	
	
	//생성자
	public Customer() {
		this.customerGrade = "SILVER" ; //기본등급
		this.bonusRatio = 0.01; //기본등급일 경우 보너스 적립비율 1%
	
		System.out.println("Customer() 생성자 호출");
	}

	public Customer(String customerName, int customerID) {
		this.customerName = customerName;
		this.customerID = customerID;
		this.customerGrade = "SILVER" ; //기본등급
		this.bonusRatio = 0.01; //기본등급일 경우 보너스 적립비율 1%
	
		System.out.println("Customer(String, int) 생성자 호출");
	}
	
	//메소드
	//calcPrice -> 물건을 구입했을 때 1) 보너스 포인트를 적립 2) 할인율을 적용한 가격을 반환
	public int calcPrice (int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	//showCustomerInfo -> 고객이름과 등급, 보너스 포인트를 출력하는 메소드
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 "+ bonusPoint;
	}
	
	
	public int getCustomerID() {
		return customerID;
	}


	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getCustomerGrade() {
		return customerGrade;
	}


	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}


	public int getBounsPoint() {
		return bonusPoint;
	}


	public void setBounsPoint(int bounsPoint) {
		this.bonusPoint = bounsPoint;
	}


	public double getBounsRatio() {
		return bonusRatio;
	}


	public void setBounsRatio(double bounsRatio) {
		this.bonusRatio = bounsRatio;
	}
	
	


}
