package com.yedam.java.ch02.object;

import java.util.Objects;

public class Main {

	public static void main(String[] args) {
		//Objects.compare(객체1, 객체2, interface Comparator)
		Student s1 = new Student(1);
		Student s2 = new Student(2);
		Student s3 = new Student(3);

		int result = Objects.compare(s1,s2,new StudentComparator());
		System.out.println(result);
		result = Objects.compare(s1, s3, new StudentComparator());
		System.out.println(result);
		System.out.println();
		
		//Objects.equals(객체1, 객체2); 얘는 얕은복제 담당, deepequals 얘가 깊은 복제 담당
		
		Integer o1 = 1000;
		Integer o2 = 1000;
		System.out.println(o1 == o2);
		System.out.println(Objects.equals(o1, o2));
		System.out.println(Objects.equals(o1, null));
		System.out.println(Objects.equals(null, o2));
		System.out.println(Objects.equals(null, null));
		System.out.println(Objects.deepEquals(o1, o2));
		
		System.out.println();
		
		Integer[] arr1 = {1,2};
		Integer[] arr2 = {1,2};
		System.out.println(arr1==arr2);
		System.out.println(Objects.equals(arr1, arr2));
		System.out.println(Objects.deepEquals(arr1, arr2));
		System.out.println(Objects.deepEquals(arr1, null));
		System.out.println(Objects.deepEquals(null, arr2));
		System.out.println(Objects.deepEquals(null, null));
		
		System.out.println();
		
		//해시코드 생성 : hash(), hasCode()
		//Objects.hashCode(객체) : 객체의 해시코드 호출
		//Objects.hash(필드1,필드2, ...) : 주어진 매개값들로 배열로 
		//생성하고 Arrays.hashCode(Object[])
		
		Student s4 = new Student(1,"홍길동");
		Student s5 = new Student(1,"홍길동");
		System.out.println(s4 == s5);
		System.out.println(s4.hashCode());
		System.out.println(Objects.hashCode(s5)); //s5.hashCode();
		
		System.out.println();
		
		//객체의 널 여부 조사 : isNull, nonNull, requireNonNull - 널이 아니면 반환
		
		
		String str1 = "홍길동";
		String str2 = null;
		
		System.out.println(Objects.isNull(str1));
		System.out.println(Objects.nonNull(str2));
		System.out.println(Objects.requireNonNull(str1));
		
		try {
			String strResult = Objects.requireNonNull(str2, "이름이 없습니다.");
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		
		//Objects.toString(객체)
		
		System.out.println(Objects.toString(str1));
		System.out.println(Objects.toString(str2));
		System.out.println(Objects.toString(str2,"이름이 없습니다."));
	}

}
