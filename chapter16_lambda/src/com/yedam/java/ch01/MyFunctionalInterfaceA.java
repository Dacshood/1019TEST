package com.yedam.java.ch01;
@FunctionalInterface //생략가능 행여나 메소드 두개쓰는걸 방지하기위해 작성
public interface MyFunctionalInterfaceA {
	//람다식을 이용하기에 메소드 하나만 사용할 수 있게 자바가 막음
	public void method();
}
