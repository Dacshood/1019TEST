package com.yedam.java.ch04;

public class Account {
	private long balance;
	
	public Account() {
		
	}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	//throw : 메소드 예외 떠넘기기 (메소드 뒤에는 throws), 강제로 예외 발생 (강제 예외발생때는 throw)
	public void withdraw(int money) throws BalanceException {
		if(balance<money) {
			throw new BalanceException("잔고부족 : "+(money-balance)+"모자랍니다.");
		}
		balance -= money;
		
	}
}
