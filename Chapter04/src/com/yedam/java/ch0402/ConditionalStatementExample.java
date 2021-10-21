package com.yedam.java.ch0402;

public class ConditionalStatementExample {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) { // int i=0; i<0; i++
			//실행문
			System.out.println(i);
		}
		
		int sum = 0;
		for(int i=1; i<=100; i++) {
			System.out.println(i);
			sum += i;
		}
	System.out.println(sum);
//	int i = 0;
//	for( ; ;) {
//		sum += 1;
//		i++;
//		System.out.println(i);
//	}
	for(int i = 0, j=100; i<=50 && j>=50; i++,j--) {
	}

	for(int x=2; x<=9; x++) {
		System.out.println("*** " + x + "단 ***");
		for(int y=1; y<=9; y++) {
			System.out.println(x+"X"+y+"="+x*y);
		}
	}
	
	String tree = "";
	for (int i=1; i<=5; i++) {
		// i=1;
		tree += "*";
		System.out.println(tree);
		//i++
	}
	
	}
}
