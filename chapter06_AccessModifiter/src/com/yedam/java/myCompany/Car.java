package com.yedam.java.myCompany;

import com.yedam.java.hankook.SnowTire;
import com.yedam.java.hyundai.Engine;
import com.yedam.java.kumho.BigWidthTire;

public class Car {
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	com.yedam.java.hankook.Tire tire3 = new com.yedam.java.hankook.Tire();
	com.yedam.java.kumho.Tire tire4 = new com.yedam.java.kumho.Tire();
	//같은 프로젝트안에 같은 이름의 클래스가 존재할시 import 하지 않고 필드에 명시
}
