package com.yedam.java.example2;

public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("빠르게 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("점프를 합니다.");
	}

	@Override
	public void turn() {
		System.out.println("레벨이 모자랍니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*** 중급자 레벨입니다. ***");
	}



}
