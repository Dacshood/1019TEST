package com.yedam.java.example3;

public class MovieThread extends Thread {
	@Override
	public void run() {
		while(true) {
			System.out.println("동영상을 재생합니다.");
			if(Thread.interrupted()) {
				break;
			}
		}
		System.out.println("정상종료되었습니다.");
	}
}
