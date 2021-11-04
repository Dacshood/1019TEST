package com.yedam.java.example6;

import java.util.Arrays;

public class BytesToStringExample {

	public static void main(String[] args) {
		byte[]bytes = {73,32,108,111,118,101,32,121,111,117};
		String str = Arrays.toString(bytes);
		System.out.println(str);
	}

}
