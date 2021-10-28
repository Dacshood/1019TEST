package com.yedam.java.example1;

public class Gold extends Customer {
	//필드
	private double saleRatio;//할인율
	
	//생성자
	public Gold(String customerName, int customerID) {
		super(customerName, customerID);
		
		this.customerGrade = "Gold";//고객 등급 Gold 
		this.bonusRatio = 0.02;	//보너스 적립 2%
		this.saleRatio = 0.1;	//할인율 10%
		
		System.out.println("Gold(String, int) 생성자 호출");
	}
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price*saleRatio);
	}
	public String showGoldInfo() {
		return super.showCustomerInfo();
	}
}
