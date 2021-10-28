package com.yedam.java.example1;

public class VIPCustomer {
	//필드
	
	private int customerId;//고객아이디
	private String customerName;//고객이름
	private String customerGrade;//고객등급
	private int bonusPoint;//보너스 포인트
	private double bonusRatio;//보너스 적립비율
	
	private int agentId;//VIP 고객 담당 상담원 아이디
	private double saleRatio;//할인율
	
	//생성자
	public VIPCustomer() {
		this.customerGrade = "VIP";	//고객 등급 VIP 
		this.bonusRatio = 0.05;	//보너스 적립 5%
		this.saleRatio = 0.1;	//할인율 10%
	}
	
	//메소드
	// calcPrice
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price*saleRatio);
	}
	// showCustomerInfo
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 "+ bonusPoint;
	}

}
