package com.yedam.java.ch08.wrapper;

public class Main {

	public static void main(String[] args) {
		// - 박싱 : 기본 타입의 값을 포장객체로 만드는 과정
		// - 언박싱 : 포장 객체에서 기본 타입의 값을 얻어내는 과정
		// 컬렉션 프레임워크 중 리스트는 배열처럼 사용은 가능하지만 기본타입으로 사용 불가능해서 박싱이나 언박싱 사용
		
		// 박싱 가로줄이 생기면 자바가 권장하지 않음
		//Integer obj1 = new Integer(100);
		//Integer obj2 = new Integer("200");
		Integer obj4 = Integer.valueOf("200"); //강제 방식
		
		// 자동 박싱
		// Integer와 같은 포장 객체는 new 연산자 필요없이 생성
		Integer obj3 = 100;
		
		// 언박싱 
		//intValue 내부에 값을 가져옴.
		int value3 = obj3.intValue();
		
		System.out.println(value3);
		
		//자동 언박싱
		int value4 = obj4;
		System.out.println(value4);
		int result = obj3 + 100;
		System.out.println(result);
		
		// 문자열을 기본타입 값으로 변환
		int val1 = Integer.parseInt("10");
		double val2 = Double.parseDouble("3.14");
		boolean val3 = Boolean.parseBoolean("true");
		
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		
		//포장 객체 비교
		Integer obj7 = 300;
		Integer obj8 = 300;
		System.out.println("===결과 "+(obj7==obj8));
		System.out.println("언박싱 후 ==결과 " + (obj7.intValue()==obj8.intValue()));
		System.out.println("equals() 결과 : " + obj7.equals(obj8));
		
		System.out.println();
		//p.502 표에 있는 값의 범위는 예외
		//위에 결과에서는 내부값이 다르게 나왔지만 제한된 범위 안에서는 예외적으로 같게 나옴
		//아래방법보다는 위 방법처럼 언박싱이나 equals로 결과 표시하는것을 선호
		
		Integer obj9 = 10;
		Integer obj10 = 10;
		System.out.println("===결과 "+(obj9==obj10));
		System.out.println("언박싱 후 ==결과 " + (obj9.intValue()==obj10.intValue()));
		System.out.println("equals() 결과 : " + obj9.equals(obj10));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
