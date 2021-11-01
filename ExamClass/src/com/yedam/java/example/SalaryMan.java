package com.yedam.java.example;

public class SalaryMan {
	//필드
	int salary = 1000000;
	int AnnualGross;
	//생성자
	public SalaryMan(int salary) {
		this.salary = salary;
		
	}
	public SalaryMan() {}
	
	public int getAnnualGross() {
		AnnualGross = salary * 12 + salary * 5;
		return AnnualGross;
	}
}