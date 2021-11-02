package com.yedam.java.ch02;

public class Example {
	
	public static void main(String[] args) {
		//일반 예외 처리 -> 문법상 문제가 있을시 자바에서 문제 처리 
		try {
			Class clazz = Class.forName("java.langa.String2");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
		
		//실행 예외 처리 -> 문법 문제가 없을시 자바에서 문제 처리 X
		String data1 = null;
		String data2 = null;
		try {
		data1 = args[0];
		data2 = args[1];
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
//			return; //메소드로 리턴후 종료
		}
		System.out.println("");
		try {
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);		
		
		int result = value1+value2;
		System.out.println(result);
		}catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
//			return; //리턴으로 종료되지만 finally는 실행 
		}finally {
			System.out.println("다시 실행하세요.");
		}
		System.out.println();
		
		//다중 catch
		try {
			data1 = args[0];
			data2 = args[1];
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);		
			
			int result = value1+value2;
			System.out.println(result);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		}catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		}finally {
			System.out.println("다시 실행하세요.");
		}
		System.out.println();
		
		//catch 블록의 순서
		System.out.println("catch 블록의 순서");
		try {
//			data1 = args[0];
//			data2 = args[1];
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);		
			
			int result = value1+value2;
			System.out.println(result);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		}catch(Exception e){
			System.out.println("실행에 문제가 있습니다.");
		}finally {
			System.out.println("다시 실행하세요.");
		}
		
		//예외처리 떠넘기기
		//e.printStackTrace(); 경로가 뜨기때문에 println으로 새로운값으로 표시
		System.out.println();
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
		
	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lng.String2");
	}
}
