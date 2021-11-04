package com.yedam.java.ch09.math;

public class Main {

	public static void main(String[] args) {
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-3.14);
		System.out.println("v1= "+v1);
		System.out.println("v2= "+v2);
		System.out.println();
		
		double v3 = Math.ceil(5.3);
		double v4 = Math.ceil(-5.3);
		System.out.println("v3= "+v3);
		System.out.println("v4= "+v4);
		System.out.println();
		
		double v5 = Math.floor(5.3);
		double v6 = Math.floor(-5.3);
		System.out.println("v5= "+v5);
		System.out.println("v6= "+v6);
		System.out.println();
		
		int v7 = Math.max(5, 9);
		double v8 = Math.max(5.3, 2.5);
		System.out.println("v7= "+v7);
		System.out.println("v8= "+v8);
		System.out.println();
		
		int v9 = Math.min(5, 9);
		double v10 = Math.min(5.3, 2.5);
		System.out.println("v9= "+v9);
		System.out.println("v10= "+v10);
		System.out.println();
		
		double v11 = Math.random();
		System.out.println("v11= "+v11);
		System.out.println();
		
		long v12 = Math.round(5.3);
		long v13 = Math.round(5.7);
		System.out.println("v12= "+v12);
		System.out.println("v13= "+v13);
		System.out.println();
		
		double value = 12.3546; //소수점이하 3번째 자리에서 반올림
		double temp = value * 100; //1234.56
		double temp2 = Math.round(temp); //1235.00
		double v14 = temp2 / 100; //12.3500
		System.out.println("v14= "+v14);
		System.out.println();
		
	}

}
