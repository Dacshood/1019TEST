package com.yedam.java.example5;

public class Rectangle {
	double x;
	double y;
	
	public Rectangle(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double getArea() {
		return x*y;
	}
	public double getCircumference() {
		return 2*x + 2*y;
	}
	
}
