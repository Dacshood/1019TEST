package com.yedam.java.package2;

import com.yedam.java.package1.A;
import com.yedam.java.package1.B;

public class C {
	//필드
//	A a;
//	B b;
	
	A a1 = new A(true); //public
//	A a2 = new A(1); //default
//	A a3 = new A("문자열"); //private
	
	//생성자
	public C() {
		A a = new A();
			a.field1 = 5;
//			a.field2 = 5;
//			a.field3 = 5;
			
			a.method1();
//			a.method2();
//			a.method3();
			
		}
	
}
