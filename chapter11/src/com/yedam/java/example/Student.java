package com.yedam.java.example;

import java.util.Objects;

public class Student {
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum=studentNum;
	}
	public String getStudentNum() {
		return studentNum;
	}
	@Override
	public boolean equals(Object studentNum) {
		if(studentNum instanceof Student) {
			Student Sd = (Student) studentNum;
			if(Sd.studentNum == this.studentNum) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(studentNum);
	}

}
