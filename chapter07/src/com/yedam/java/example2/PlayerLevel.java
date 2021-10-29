package com.yedam.java.example2;

public abstract class PlayerLevel {
	
	//필드
//	protected String BeginnerLevel;
//	protected String AdvancedLevel;
//	protected String SuperLevel;
//	protected String skill;
	
	
	//생성자
//	public PlayerLevel() {
//		
//	}
	//메소드
	//run, jump, turn
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	//레벨 메세지
	public abstract void showLevelMessage();
	//필살기
	final public void go(int count) {
		run();
		for(int i=0; i<count; i++) {
			jump();
		}
		turn();
	}
	
}
