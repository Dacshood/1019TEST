package com.yedam.java.ch0203;

public class variableExample {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드 값 : " + intValue);
		
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue : " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue : " + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue : " + doubleValue);
	
		System.out.println("======== 강제 타입 변환 =========");
		
		int intValue1 = 44032;
		char charValue1 = (char)intValue1;
		System.out.println("charValue : " + charValue1);
	
		long longValue1 = 500;
		intValue1 = (int)longValue1;
		System.out.println("intValue1 : " + intValue1);
		
		double doubleValue1 = 3.14;
		intValue1 = (int)doubleValue1;
		System.out.println("intValue1 : " + intValue1);
		
		System.out.println("===== Quiz =====");
		byte byteValue1 = 65;
		char result1 = (char)byteValue1;
		System.out.println(result1); 
		//A
		
		char charValue2 = 'B';
		short result2 = (short)charValue2;
		System.out.println(result2);
		//유니코드값 B
		
		float floatValue1 = 3.14f;
		int result3 = (int)floatValue1;
		System.out.println(result3);
		//3
	
	}

}
