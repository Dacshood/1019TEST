package com.yedam.java.ch02;

public class CalcThread extends Thread{
	public CalcThread(String name) {
		setName(name);
	}
	
	@Override
	public void run() {
		for(int i=0; i<20000000; i++) {
			
		}
		System.out.println(getName());
	}
	

}
