package com.yedam.java.examplePlus;

public class NamedCircle extends Circle{
	String name;
	int radius;
	
	public NamedCircle(int radius, String name) {
		super(radius);
		this.radius = radius;
		this.name = name;
	}
	
	public void show() {
		System.out.println(name+", 반지름 = "+radius);
	}
	
	
	
}
