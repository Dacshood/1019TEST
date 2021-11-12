package com.yedam.java.ch03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputOutputStreamExample {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("C:/Temp/primitive.db");
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeUTF("홍길동");
		dos.writeDouble(95.5);
		dos.writeInt(1);
		
		dos.writeUTF("김자바");
		dos.writeDouble(90.3);
		dos.writeInt(2);
		
		dos.flush();
		dos.close();
		
		FileInputStream fis = new FileInputStream("C:/Temp/primitive.db");
		DataInputStream dis = new DataInputStream(fis);
		
		for(int i = 0; i<2; i++) {
			String name = dis.readUTF();
			Double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println(name +" : "+ score +" : "+ order);
		}
		dis.close();
		
		
	}

}
