package com.yedam.java.ch0401;

import java.util.Scanner;

public class ConditionalStatementExample {

	public static void main(String[] args) {
		// 기본 IF문
		int score = 90;
		
		if(score>=90)
		{
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		if (score<=90)  
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		
		System.out.println("============");
		// IF~ELSE문	
		if(score>=90) { 
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		} 	else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
		System.out.println("============");
		// IF ~ ELSE IF ~ ELSE 구문
		score = 75;
		
		if(score>=90) { 
			System.out.println("점수가 100~90 입니다.");
			System.out.println("등급은 A입니다.");
		}	else if(score>=80) {
			System.out.println("점수가 80~89 입니다.");
			System.out.println("등급은 B입니다.");
		}	else if(score>=70) {
			System.out.println("점수가 70~79 입니다.");
			System.out.println("등급은 C입니다.");
		}	else {
			System.out.println("점수가 70미만입니다.");
			System.out.println("등급은 D입니다.");
		}
		
		System.out.println("============");
		int num = (int) (Math.random() *6) +1;
//		0.0 <= Math.random() < 1.0
//		0.0 * 10 <= Math.random() * 10 <= 1.0 * 10
//		(int) 0 <= (int)Math.random() * 10 <= (int) 10
//		(int) 0+1 <= (int)Math.random() *20 +1 <= (int) 20+1
//		(int)Math.random() * 갯수 + 시작숫자;
		
		if(num ==1) {
			System.out.println("1번이 나왔습니다.");
		}else if(num==2) { 
			System.out.println("2번이 나왔습니다.");
		}else if(num==3) {
			System.out.println("3번이 나왔습니다.");
		}else if(num==4) {
			System.out.println("4번이 나왔습니다.");
		}else if(num==5) {
			System.out.println("5번이 나왔습니다.");
		}else if(num==6){
			System.out.println("6번이 나왔습니다.");
		}
		
		System.out.println("=======Quiz");
		Scanner scanner = new Scanner(System.in);
		//문제1 두개의 정수가 주어졌을 때 두 정수의 합이 자연수이면 'Natural Number'를 출력하도록 구현하세요
		//int a= scanner.nextInt();
		//int b= scanner.nextInt();
		//int sum = a+b;
		//if(sum>0) {
		//	System.out.println("Natural Number");
		//}
		//문제2 두개의 정수가 주어졌을 때 두 수의 대소관계에 따라 부등호(>, = , <)를 출력하도록 구현하세요
		//int x = scanner.nextInt();
		//int y = scanner.nextInt();
//		if (x>y) {
//			System.out.println("x가 y보다 큽니다.");
//		}else if (x==y) {
//			System.out.println("x가 y와 같습니다.");
//		}else if (x<y) {
//			System.out.println("x가 y보다 작습니다.");
//		}
//		//문제3 체질량 지수인 BMI에 따라 비만도를 네가지 단계로 구분하여 결과값을 출력하도록 구현하세요
//		//BMI = 체중 / (키 * 키)
//		//저체중(18.5미만), 정상(18.5 이상 25미만), 과체중(25이상 30미만), 비만(30이상)
//		double kg = scanner.nextDouble(); double tall = scanner.nextDouble();
//		double BMI = kg / (tall * tall);
//		if (BMI<18.5) {
//			System.out.println("저체중입니다.");
//		}else if (BMI<25) {
//			System.out.println("정상입니다.");
//		}else if (BMI<30) {
//			System.out.println("과체중입니다.");
//		}else {
//			System.out.println("비만입니다.");
//		}
		System.out.println("============");
		int random = (int)(Math.random() * 6 )+1;
		
		switch(random) { 
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		default:
			System.out.println("6번이 나왔습니다.");
		}
	
		int time = (int)(Math.random() * 4) + 8;
		System.out.println("현재시각 : " + time + "시");
		
		switch(time) {
		case 8:
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의를 합니다.");
		case 10:
			System.out.println("업무를 합니다.");
			default:
			System.out.println("외근을 나갑니다.");
		
		}
	
		char grade = 'B';
		
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("우수 회원입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("일반 회원입니다.");
			break;
		default:
			System.out.println("손님입니다.");
		}
		
		String position = "과장";
		
		switch(position) {
		case "부장" :
			System.out.println("700만원");
			break;
		case "과장" :
			System.out.println("500만원");
			break;
		default:
			System.out.println("300만원");
		}
		
		System.out.println("=======Quiz");
		//문제4 구구단을 출력하되 입력받은 단의 6번째 값을 출력하도록 구현하세요.
		//예를들어, 2단일 경우엔 2 * 6 = 12
		//출력문에는 변수를 사용하지 않습니다.
		int gugudan = scanner.nextInt();
		switch(gugudan) {
		case 1:
			System.out.println(gugudan*6);
			break;
		case 2:
			System.out.println(gugudan*6);
			break;
		case 3:
			System.out.println(gugudan*6);
			break;
		case 4:
			System.out.println(gugudan*6);
			break;
		case 5:
			System.out.println(gugudan*6);
			break;
		case 6:
			System.out.println(gugudan*6);
			break;
		case 7:
			System.out.println(gugudan*6);
			break;
		case 8:
			System.out.println(gugudan*6);
			break;
			default:
			System.out.println(gugudan*6);
		}
		//문제5 다음과 같이 점수 범위에 따라 등급을 구분하여 입력받은 점수에 대한 등급을 출력하세요
		//점수 범위는 0~100점이고
		//90 이상 100 이하 : A등급
		//80 이상 90 미만 : B등급
		//70 이상 80 미만 : C등급
		//60 이상 70 미만 : D등급 => (60 ~ 69) / 10 = 6 =>
		//60 미만 : E등급
		int grade1 = scanner.nextInt();
		switch (grade1/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
			default:
				System.out.println("E");
		}
	
	
	}
}
