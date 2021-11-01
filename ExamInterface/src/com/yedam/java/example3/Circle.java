package com.yedam.java.example3;

public class Circle implements Shape {
	double Area;
	double i;
	

	public Circle(double i) {
		this.i = i;
	}
	
	@Override
	public void draw() {
	}

	@Override
	public double getArea() {
		Area = i*i*PI;
		return Area;
	}
	
	 public static void main(String[] args) {
			Shape coin = new Circle(10);
			coin.redraw();
			System.out.println("코인의 면적은 " + coin.getArea());
		}
}
