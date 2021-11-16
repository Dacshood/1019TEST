package com.yedam.java.ch03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class NonBufferVSBufferExample {

	public static void main(String[] args) throws Exception {
		String originalFilePath1 = 
				NonBufferVSBufferExample.class.getResource("originalFile1.jpg").getPath();
		String targetFilePath1 = "C:/Temp/targetFile1.jpg"; 
		FileInputStream fis = new FileInputStream(originalFilePath1);
		FileOutputStream fos = new FileOutputStream(targetFilePath1);
		
		long nonBufferTime = copy(fis, fos);
		System.out.println("버퍼를 사용하지 않았을 때 "+nonBufferTime +"ns");
		
		String originalFilePath2 = 
				NonBufferVSBufferExample.class.getResource("originalFile1.jpg").getPath();
		String targetFilePath2 = "C:/Temp/targetFile1.jpg"; 
		FileInputStream fis2 = new FileInputStream(originalFilePath2);
		FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		Long bufferTime = copy(bis, bos);
		System.out.println("버퍼를 사용하였을 때 " + bufferTime + "ns");
		
		fis.close();
		fos.close();
		bis.close();
		bos.close();
	}
	
	static int data = -1;
	public static long copy(InputStream is, OutputStream os) throws Exception {
		long start = System.nanoTime();
		while(true) {
			data = is.read();
			if(data == -1) break;
			os.write(data);
		}
		
		long end = System.nanoTime();
		
		return (end - start);
	}

}
