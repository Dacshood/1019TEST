package com.yedam.java.ch02;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) throws IOException {
		Writer writer = new FileWriter("C:/Temp/test7.txt");
		
		char a = 'A';
		char b = 'B';
		char c = 'C';
		
		writer.write(a);
		writer.write(b);
		writer.write(c);
		
		writer.flush();
		writer.close();
		
		System.out.println();
		
		writer = new FileWriter("C:/Temp/test8.txt");
		char[] array1 = {'A','B','C'};
		
		writer.write(array1);
		
		writer.flush();
		writer.close();
		
		System.out.println();
		
		writer = new FileWriter("C:/Temp/test9.txt");
		
		char[] array2 = { 'A', 'B', 'C', 'D', 'E'};
		
		writer.write(array2, 1, 3); // 'B','C','D'
		
		writer.flush();
		writer.close();
		
		writer = new FileWriter("C:/Temp/test10.txt");
		
		String str = "WYZ";
		
		writer.write(str);
		
		writer.flush();
		writer.close();
		
		
		
		
		}
	}


