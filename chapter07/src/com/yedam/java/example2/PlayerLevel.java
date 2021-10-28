package com.yedam.java.example2;

public abstract class PlayerLevel {
	//필드
	protected String BeginnerLevel;
	protected String advancedLevel;
	protected String superLevel;
	protected String skill;
	
	
	//생성자
	public PlayerLevel() {
		
	}
	//메소드
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	
	public abstract void showLevelMessage();
	
}
