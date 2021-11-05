package com.yedam.java.ch02;

public class UsingThis {
	public int outterField = 10;
	
	class Innter{
		int innerField = 20;
		
		void method() {
			MyFunctionalInterface fi = () -> {
				System.out.println("outterField : " + outterField);
				System.out.println("outterField : "+ UsingThis.this.outterField);
				
				System.out.println("innerField : "+ innerField);
				System.out.println("innerField : "+ this.innerField);
			};
			fi.method();
			
		}
	}
}
