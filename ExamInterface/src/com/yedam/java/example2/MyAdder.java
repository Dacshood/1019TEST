package com.yedam.java.example2;

public class MyAdder implements AdderInterface {

	@Override
	public int add(int x, int y) {
		return x+y;
	}

	@Override
	public int add(int n) {
		return n+n;
	}
	public static void main(String[] args) {
		MyAdder adder = new MyAdder();
		System.out.println(adder.add(5,10));
		System.out.println(adder.add(10));
	}
}
