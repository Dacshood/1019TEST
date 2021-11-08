package com.yedam.java.ch0604;

public class MemberService {
	
	boolean login (String id, String password) {
		if(id.equals("hong")&&password.equals("12345")) {
			System.out.println("false");
			return false;
		}
		System.out.println("로그인되었습니다.");
			return true;
	}
	}
	
	
	
	

