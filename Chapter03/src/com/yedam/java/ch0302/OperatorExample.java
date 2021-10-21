package com.yedam.java.ch0302;

public class OperatorExample {

	public static void main(String[] args) {
		int a = -100;
		int result1 = +a;
		int result2 = -a;
		System.out.println("a : " + a);
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		
		byte b = 100;
		//byte result3 = -b;
		int result3 = -b;
		System.out.println(result3);
		
		//증감연산자
		int x, y, z;
		x= y = 10;
		// y = 10 -> x = y -> x = 10 대입은 오른쪽에서 왼쪽으로
		
		System.out.println("==============");
		x++; // x= x + 1
		++x; // x = x + 1
		System.out.println("x=" + x);
		
		System.out.println("================");
		y--; // y = y - 1
		--y; // y = y - 1
		System.out.println("y="+ y);
		
		System.out.println("================");
		z = x++; // 증감이 뒤에 사용되면 x를 z로 먼저 대입하고 더하기
		System.out.println("z=" + z);
		System.out.println("x=" + x);
	
		System.out.println("================");
		z = ++x;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
	
		System.out.println("================");
		z = ++x + y++; 
		System.out.println("z=" + z); //23
		System.out.println("x=" + x); //15
		System.out.println("y=" + y); //9
		
		x = y = 5;
		z = x++ + --y;
		System.out.println("z=" + z); //9
		System.out.println("x=" + x); //6
		System.out.println("y=" + y); //4
		z= --x + y++;
		System.out.println("z=" + z); //9
		System.out.println("x=" + x); //5
		System.out.println("y=" + y); //5
		
		//논리부정연산자
		boolean play = true;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
				
		//이항연산자
		//산술연산자
		int v1 = 5;
		int v2 = 2;
		
		int result;
		result = v1 + v2;
		System.out.println(result);
		
		result = v1 - v2;
		System.out.println(result);
		
		result = v1 * v2;
		System.out.println(result);
		
		result = v1 / v2 ;
		System.out.println(result);
		
		result = v1 % v2 ; 
		System.out.println(result);
		
		double doubleResult = (double)v1 /v2;
		System.out.println(doubleResult);
		
		System.out.println("==============");
		char c1 = 'A' + 1;
		char c2 = 'A';
//		char c3 = c2 + 1;
		int c3 = c2 +1;
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("c3의 유니코드값 : " + c3);
		System.out.println("c3의 출력문자 : " + (char)c3);
		
		System.out.println("==============");
		String str1 = "JDK" + 6.0;
		String str2 = str1 + "특징";
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0;
		String str4 = 3 + 3.0 + "JDK";
		System.out.println(str3);
		System.out.println(str4);
		
		System.out.println("==== Quiz");
		int m, n, total;
		m = n = 10;
		
// 1번 부호연산자를 이용하여 변수 M의 값을 음수로 변경하여 출력하세요.
//		단, 변수 m의 값은 변하지 않습니다.
		System.out.println(-m);
		//total = -m;
		//System.out.printf("m : %d , total : %d\n", m, total);
// 2번 변수 m와 n의 값을 더한 후 n의 값을 증가시키는 연산식을 한줄로 작성하세요.
		total = m+n++;
		System.out.println(total);
		System.out.println(n);
// 3번 변수 m와 n의 값을 더한 값이 20이 되도록 변수 m과 n 중 하나의 변수에 증감연산자를 사용하세요.
		total = m+--n;
		System.out.println(total);
// 4번 변수 m에서 변수 n을 나눈 후 몫과 나머지를 출력하세요.
		System.out.printf("몫 : %d, 나머지 : %d\n",(m/n),(m%n));
		
		double doubleResult1 = (double) m/n;
		System.out.println(doubleResult1);
// 5번 356이 주어졌을 경우 산술 연산자만 사용해서 300으로 변수 값을 변경해서 출력하세요.
		int val = 356;
		total = val/100*100;
		//total = val-(val%100);
		System.out.println(total);
		
		// 비교연산자
		System.out.println("====================");
		int num1 = 10;
		int num2 = 10;
		boolean bResult1, bResult2, bResult3;
		bResult1 = (num1 == num2);
		bResult2 = (num1 != num2);
		bResult3 = (num1 <= num2);
		System.out.println(bResult1);
		System.out.println(bResult2);
		System.out.println(bResult3);
		
		char char1 = 'A';
		char char2 = 'B';
		boolean bResult4 = (char1 <char2);
		System.out.println(bResult4);
		
		int v3 = 1;
		double v4 = 1.0;
		System.out.println(v3 == v4);
		
		double v5 = 0.1;
		float v6 = 0.1f;
		System.out.println(v5 == v6);
		System.out.println((float)v5 == v6);
		
		//논리연산자
		System.out.println("==============");
		int charCode = 'A'; // 65
		
		//유니코드 중 65 보다 크거나 같으며 90보다 작거나 같아야 대문자
		if((charCode>=65) & (charCode<=90)) {
			System.out.println("대문자");
		}
		
		//유니코드 중 97보다 크거나 같으며 122보다 작거나 같으면 소문자
		if((charCode>=97) & (charCode<=122)) {
			System.out.println("소문자");
		}
		
		//유니코드 중 48보다 크고 57보다 작아야 숫자 0~9
		if((charCode>48) & (charCode<57)) {
			System.out.println("숫자 0~9");
		}
		
		int numValue = 6;
		
		// 2의 배수 이거나 3의 배수가 맞는지
		if((numValue%2==0) | (numValue%3==0)) {
			System.out.println("2 또는 3의 배수군요");
		}
		
		if((numValue%2==0) || (numValue%3==0)) {
			System.out.println("2 또는 3의 배수군요");
		}
		
		System.out.println("==============");
		
		//대입연산자 = + (사칙연산자, 논리연산자, 논리부정연산자)
		int intResult = 0;
		
		intResult += 10; // intResult + 10 = intResult 
		System.out.println(intResult);
		intResult -= 5; // intResult - 5 = intResult
		System.out.println(intResult);
		intResult *= 3; // intResult * 3 = intResult
		System.out.println(intResult);
		intResult /= 5; // intResult / 5 = intResult
		System.out.println(intResult);
		intResult %= 3; // intResult % 3 = intResult
		System.out.println(intResult);
		
		System.out.println("==============");
		//삼항연산자
		
		int score = 95;
//		char grade = '';
//		// 점수가 90점 보다 크면 등급을 A라고 주고 90보다 작거나 같으면 등급 B를 준다.
//		if(score > 90) {
//			grade = 'A';
//		}else if(score <=90) {
//			grade = 'B';
//		
//		}
//		System.out.printf("등급은 %c 입니다.\n", grade);
//		
		char grade = (score >90)? 'A' : 'B';
		
		System.out.printf("등급은 %c 입니다.\n", grade);
		
		int age = 27;
		String str = (age>=20)? "성인" : "미성년";
		System.out.printf("나이는 %d이고 %s입니다.\n", age, str);
		
		int value = 35;
		int valResult = (value%3==0)? value%3 : value/3;
		System.out.println(valResult);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
