package com.yedam.java.examplePlus2;

import java.util.Scanner;

public abstract class Calculator {
	//필드
	protected int a, b;
	
	abstract protected int calc();
	protected void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 2개를 입력하세요 >> ");
		a = scanner.nextInt();
		b = scanner.nextInt();
	}
	public void run() {
		input();
		int res = calc();
		System.out.println("계산된 값은 " + res);
	}
	
}
