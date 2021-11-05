package com.yedam.java.ch01;

public class Main {

	public static void main(String[] args) {
		// 람다식 기본골격 : (매개변수, ...) -> {실행문} 
		// @FunctionalInterface
		
		
		// 매개변수와 리턴타입이 없는 람다식
		MyFunctionalInterfaceA fa;
		
		fa = new MyFunctionalInterfaceA() {
			@Override
			public void method() {
				System.out.println("익명구현객체입니다.");
			}
		};
		fa.method();

		fa = () -> {
			String str = "method call1"; 
			System.out.println(str);
		};
		fa.method();	
		
		fa = () -> System.out.println("람다식 표현법.");
		fa.method();
		System.out.println();
		// 매개변수가 있는 람다식
		MyFunctionalInterfaceB fb;
		
		fb = new MyFunctionalInterfaceB() {
			private int result = 1;
			@Override
			public void method(int x) {
				System.out.println(x+result);
			}
		};
		
		fb.method(2);
		
		fb = (g) -> {
			int result = g*5;
			System.out.println(result);
			};
		fb.method(3);
		
		fb = g -> System.out.println(g*5);
		fb.method(50);
		System.out.println();
		//리턴값이 있는 람다식
		MyFunctionalInterfaceC fc;
		
		fc = new MyFunctionalInterfaceC() {
			@Override
			public int method(int x, int y) {
				return x+y;
			}
		};
		System.out.println(fc.method(1, 2));

		fc = (x, y) -> {
			int result = x+y;
			return result;
			
		};
		System.out.println(fc.method(1, 2));
	
		fc = (x, y) -> {return x+y;};
		System.out.println(fc.method(1, 2));
		fc = (x, y) -> x+y;
		System.out.println(fc.method(1, 2));
		fc = (x, y) -> {return sum(x,y);}; 
		System.out.println(fc.method(1, 2));
		fc = (x, y) -> sum(x,y); 
		System.out.println(fc.method(1, 2));
		
		System.out.println();
		MyNumber max = (x,y) -> {return (x>=y)? x : y;};
		System.out.println(max.getMax(1000, 2000));
		MyNumber max1 = (x,y) -> (x>=y)? x : y;
		System.out.println(max1.getMax(10, 20));
	}

	public static int sum(int x, int y) {
		return(x+y);
	}
}
