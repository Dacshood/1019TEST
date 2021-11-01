package com.yedam.java.example2;

public class Main {

	public static void main(String[] args) {
		Account ac = new Account("홍길동", 1000000);
		
		ac.deposit(20000);
		ac.withdraw(10000);
		
	}

}
