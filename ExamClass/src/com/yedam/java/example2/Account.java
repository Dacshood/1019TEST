package com.yedam.java.example2;

public class Account {
	//필드
	private String owner;
	private long balance;
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	public Account (String owner, long balance) {
		this.balance = balance;
		this.owner = owner;
	}
	
	//메소드
	public long deposit(long amount) {
		balance += amount;
		System.out.println("현재 "+owner+"님의 잔액은 : "+balance);
		return balance;
		
	}
	
	public long withdraw(long amount) {
		if(balance<amount) {
			System.out.println("잔액이 부족합니다.");
		}else {
		balance -= amount;
		System.out.println("현재 "+owner+"님의 잔액은 : "+balance);
		}
		return balance;
	}
	

}
