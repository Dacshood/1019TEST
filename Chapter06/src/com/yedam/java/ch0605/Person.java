package com.yedam.java.ch0605;

public class Person {
	final static String nation = "Korea"; //final 정적 필드  
	final String ssn; //final 인스턴스 필드
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
