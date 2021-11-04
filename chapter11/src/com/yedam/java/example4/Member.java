package com.yedam.java.example4;

import java.util.Objects;

public class Member {
	 
		private String id;
		private String name;
		
		public Member(String id, String name) {
			this.id = id;
			this.name = name;
		}
		
		public String toString() {
			return id + ": " + name;
		}
}
