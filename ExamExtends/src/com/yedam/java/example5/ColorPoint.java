package com.yedam.java.example5;

public class ColorPoint extends Point {

	String colorName;
	private String Color;

	public void setPoint(int i, int j) {
		super.move(i, j);
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public ColorPoint(int x, int y, String colorName) {
		super(x, y);
		this.colorName = colorName;
	}

	public void show() {
		System.out.println(Color + "색으로 (" + super.getX() + "," + super.getY() + ")");
	}

	public static void main(String[] args) {

		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setPoint(10, 20);
		cp.setColor("GREEN");
		cp.show();
	}

}
