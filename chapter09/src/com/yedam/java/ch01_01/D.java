package com.yedam.java.ch01_01;

public class D {
	//로컬 클래스에서 사용 제한
	
	//자바 7이전
	public void method1(int arg) {
		final int localVariable = 1;
		//final 변수 수정 불가
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	//자바 8이후 final 생략
	
	public void method2(int arg) {
		int localVariable =1;
//		arg = 100;
//		localVariable = 100;
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
}
