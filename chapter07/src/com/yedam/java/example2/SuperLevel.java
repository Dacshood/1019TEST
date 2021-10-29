package com.yedam.java.example2;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("엄청 빠르게 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("점프를 합니다.");
	}

	@Override
	public void turn() {
		System.out.println("한 바퀴를 돕니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*** 고급자 레벨입니다. ***");
	}

}
