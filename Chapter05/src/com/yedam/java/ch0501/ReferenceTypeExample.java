package com.yedam.java.ch0501;

public class ReferenceTypeExample {

	public static void main(String[] args) {
		String strVar1 = "신미철"; // 신미철이란 값을 가지는 String객체가 힙영역에 생성.
		String strVar2 = "신미철"; // 신미철이란 값을 가지는 String객체를 참조.
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음.");
		}else {
			System.out.println("strVar1과 strVar2는 참조가 다름.");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음.");
		}else {
			System.out.println("strVar1과 strVar2는 문자열이 다름.");
		}
		String strVar3 = new String("신미철");
		// 참조타입 타입명 = new 참조타입(매개변수);
		String strVar4 = new String("신미철");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음.");
		}else {
			System.out.println("strVar3과 strVar4는 참조가 다름.");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음.");
		}else {
			System.out.println("strVar3과 strVar4는 문자열이 다름.");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
