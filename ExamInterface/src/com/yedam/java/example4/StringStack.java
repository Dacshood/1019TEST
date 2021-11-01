package com.yedam.java.example4;

public class StringStack implements Stack {
	private String[] stack;
	private int size;
	private int set;
			
	public StringStack(int size) {
		this.size = size;
		stack = new String[size];
		this.set = 0;
	}
	@Override
	public int length() {
		return set;
	}

	@Override
	public int capacity() {
		return stack.length;
	}

	@Override
	public String pop() {
		// set이 가질 수 있는 최대 값 : size
		// set이 가질 수 있는 최솟 값 : 0
		if(set == 0) {
			return null;
		}
		return stack[--set];
	}

	@Override
	public boolean push(String val) {
		if(set<size) {
			stack[set++] = val;
		return true;
		}else {
		return false;
	}
	}
	
}
