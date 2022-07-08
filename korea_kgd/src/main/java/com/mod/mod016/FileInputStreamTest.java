package com.mod.mod016;

import java.io.*;

public class FileInputStreamTest {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		int totalBytes = 0;
		try {
			try {
				fis = new FileInputStream("test.txt");
				fos = new FileOutputStream("text_copy.txt");
				for(int readByte; (readByte = fis.read()) != -1;) {
					System.out.write(readByte);
					totalBytes++;
				}
			}finally {
				fos.close();
				fis.close();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println(" \n 전체 바이트 수 : " + totalBytes + "bytes.");
	}
}
