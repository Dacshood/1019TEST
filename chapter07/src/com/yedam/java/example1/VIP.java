package com.yedam.java.example1;

public class VIP extends Customer {
	//필드 
	private int agentId;//VIP 고객 담당 상담원 아이디
	private double saleRatio;//할인율
	
	//생성자
	
	public VIP() {
		this.customerGrade = "VIP";	//고객 등급 VIP 
		this.bonusRatio = 0.05;	//보너스 적립 5%
		this.saleRatio = 0.1;	//할인율 10%
		
		System.out.println("VIP() 생성자 호출");
	}
	public VIP(String customerName, int customerID, int agentId) {
		super(customerName, customerID);
		
		this.customerGrade = "VIP";	//고객 등급 VIP 
		this.bonusRatio = 0.05;	//보너스 적립 5%
		this.saleRatio = 0.1;	//할인율 10%
		this.agentId = agentId;
		
		System.out.println("VIP(String, int) 생성자 호출");
	}
	//메소드
	public int getAgentId() {
		return agentId;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price*saleRatio);
	}
	public String showVIPInfo() {
		return super.showCustomerInfo()+ "담당 상담원 아이디는 " + agentId + "입니다.";
	}
	
}
