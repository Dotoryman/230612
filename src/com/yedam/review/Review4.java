package com.yedam.review;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Review4 {
	// 600 page
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("c:/temp/students.txt");

		byte[] buffer = new byte[1000];

		while (true) {
			int readByteNum = is.read(buffer);
			if (readByteNum == -1) {
				break;
			}
			for (int i = 0; i < readByteNum; i++) {
				System.out.println(buffer[i]);
			}
		}
		System.out.println("end");
		is.close();
	}
}
