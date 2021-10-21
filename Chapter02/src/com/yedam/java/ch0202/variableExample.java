package com.yedam.java.ch0202;

public class variableExample {

	public static void main(String[] args) {

//		int var1 = 365;
//		int var2 = 0b1011; //이진수 이진수 값 앞에 0b를 붙여주면 2진수로 출력 
//		int var3 = 0xB3; //16진수 
//		int var4 = 0206; //8진수
		
//		System.out.println(var1);
//		System.out.println(var2);
//		System.out.println(var3);
//		System.out.println(var4);
		
		byte v1 = -128;
		byte v2 = -30;
		byte v3 = 0;
		byte v4 = 30;
//		byte v5 = 128; byte 값은 -128~127 까지 허용
		byte v5 = 127;
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
		
		long lv1 = 10;
		long lv2 = 3000000000L;
		
		char ch1 = 'A';
		String str = "홍길동";
		//char ch2 = "A"
		String str1 = "A";
		
		float f1 = 3.14F;
		double d1 = 3.14;
		
		float varF = 0.1234321525123F;
		double varD = 0.1234321525123F;
		
		System.out.println("f1 : " + f1 + ", d1 : " + d1);
		System.out.println("varF : " + varF + ", varD : " + varD);
		
		boolean stop = true;
		if(stop) {
			System.out.println("중지합니다");
		}
		
		int var1 = 200;
		String var2 = "AB";
		char var3 = 65; //A로 출력되도록 유니코드로 변환
		long var4 = 500000000000L;
		float var5 = 3.14F;
		float var6 = 100.0F;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
		
		
		
	}

}
