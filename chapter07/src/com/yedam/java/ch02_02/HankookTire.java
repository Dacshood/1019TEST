package com.yedam.java.ch02_02;

public class HankookTire extends Tire{
	public HankookTire (String location, int maxRotation) {
		
	super(location, maxRotation);
	}
	//메소드
	@Override
	public boolean roll() {
		accumlatedRotation++;
		if(accumlatedRotation < maxRotation) {
			System.out.println(location + "HankookTire 수명 : "+(maxRotation - accumlatedRotation)+ "회");
		return true;
		}else {
			System.out.println("*** "+location + "HankookTire 펑크 ***");
			return false;
		}
	}
}
