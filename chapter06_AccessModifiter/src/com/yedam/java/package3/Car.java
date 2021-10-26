package com.yedam.java.package3;

public class Car {
	//필드 
	private	int speed;
	private boolean stop;
	
	//메소드
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed <0 ) {
			this.speed = 0;
			return;
		}else {
		this.speed = speed;
		return;
		}
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.speed = 0;
		this.stop = stop;
	}
	
	
	
}
