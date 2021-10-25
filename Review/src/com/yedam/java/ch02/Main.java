package com.yedam.java.ch02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 문제2) 두 수를 입력받아 두수의 대소관계 및 사칙연산을 수행하는 프로그램을 구현하세요.
		
		Scanner scanner = new Scanner(System.in);
		int x = 0;
		int y = 0;
		
		boolean run = true;
		while(run) {
			System.out.println("input.숫자입력 | +.더하기 | -.빼기 | *.곱하기 | /.나누기 | ?.대소관계 | exit.종료 ");
			System.out.println("수행해야할 명령을 입력하세요. ");
			String menu = scanner.next();
			
			switch(menu) {
			case "input" :
				 x = scanner.nextInt();
				 y = scanner.nextInt();						
				break;
			case "+" :
				System.out.println(x+y);
				break;
			case "-" :
				System.out.println(x-y);
				break;
			case "*" :
				System.out.println(x*y);
				break;
			case "/" :
				System.out.println(x/y);
				break;
			case "?" :
				if(x<y) {
				System.out.println("x가 y보다 작습니다.");	
				}
				else if(x>y) {
				System.out.println("x가 y보다 큽니다.");	
				}else if (x==y) {
				System.out.println("x가 y와 같습니다.");	
				}
				break;
			case "exit" :
				run = false;
				break;
			}
		
		}
	}

}
