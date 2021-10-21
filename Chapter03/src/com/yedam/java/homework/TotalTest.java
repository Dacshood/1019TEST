package com.yedam.java.homework;

public class TotalTest {

	public static void main(String[] args) {
		int x = -5;
		int y = 10;
		int result;
		
		result = -x;
		System.out.println(result);
		
		result = ++x + y--;
		System.out.println(result);
		
		result = --x + ++y;
		int m = 10;
		int n = 5;
		
		System.out.println((m>7) && (n<=5));
		System.out.println((m%3 != 1) || (n%2 != 0));
		
		
		
		
	}

}
