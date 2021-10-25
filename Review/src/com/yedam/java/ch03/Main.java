package com.yedam.java.ch03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 문제 3) 입력한 수만큼 주사위(1~6)를 굴려서 나온 수들 중 최고 수와 최저 수, 수들의 합을 구하는 프로그램을 구현하세요.

		Scanner scanner = new Scanner(System.in);

		int[] numList = null;
		int size = 0;
		boolean run = true;

		while (run) {
			System.out.println("1.숫자입력 | 2.주사위 굴리기 | 3.최고 수 | 4.최저 수 | 5.총합 | 6.종료");
			System.out.println("선택 > ");
			int selectNo = scanner.nextInt();
			switch(selectNo) {
			case 1 :
				System.out.println("숫자입력");
				size = scanner.nextInt();
				numList = new int[size];
				break;
			case 2 :
				System.out.println("주사위 굴리기");
				for(int i=0; i<numList.length; i++) {
				int num = (int)(Math.random() * 6)+1;
				numList[i] = num;
				//numList[i] = (int)(Math.random() * 6)+1;
				}break;
			case 3 :
				System.out.println("최고 수");
				int max = 1;
				int indexOfMax = 0;
				for(int i = 0; i<numList.length; i++) {
					if(numList[i]>max) {
						max = numList[i];
						indexOfMax = i;
					}
				}
				System.out.printf("주사위를 굴린결과 최고 숫자는 %d번 굴렸을 때 나온%d입니다.\n",indexOfMax+1,max);
				break;
			case 4 :
				System.out.println("최저 수");
				int min = 6;
				int indexOfMin = 0;
				for(int i = 0; i<numList.length; i++) {
					if(numList[i]<min) {
						min = numList[i];
						indexOfMin = i;
					}
				}
				System.out.printf("주사위를 굴린결과 최저 숫자는 %d번 굴렸을 때 나온%d입니다.\n",indexOfMin+1,min);
				break;
			case 5 :
				System.out.println("총합");
				int sum = 0;
				for(int num : numList) {
					sum +=num;
				}
				System.out.println(sum);
				break;
			case 6 :
				System.out.println("종료");
				run = false;
				break;
			}
			
			
		}
	}
}
