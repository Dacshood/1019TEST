package com.yedam.java.example4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("총 스택 저장 공간의 크기 입력 >>");
		int size = scanner.nextInt();
		StringStack stack = new StringStack(size);
		while(true) {
			System.out.println("문자열 입력>>");
			String val = scanner.next();
			if(val.equals("그만"))
				break;
			if(!stack.push(val))
				System.out.println("스택이 가득 찼습니다.");
		}
		System.out.println("스택에 저장된 모든 문자열 꺼내옴 : ");
		int len = stack.length();
		for(int i = 0; i<len; i++) {
			String val = stack.pop();
			System.out.println(val);
		}
		
		
	}

}
