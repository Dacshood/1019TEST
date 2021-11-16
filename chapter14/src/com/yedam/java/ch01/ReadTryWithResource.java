package com.yedam.java.ch01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadTryWithResource {

	public static void main(String[] args) {
		try(InputStream fis = new FileInputStream("data01.txt")){
			int i;
			while((i = fis.read()) != -1) {
				System.out.println((char)i);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
