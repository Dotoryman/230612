package com.yedam.review;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class Review6 {
	// 612page
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("c:/temp/students.txt");

		char[] buffer = new char[100];

		int readCharNum = reader.read(buffer, 2, 3);
		if (readCharNum != -1) {
			for (int i = 0; i < buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
		System.out.println("End");
		reader.close();
	}
}
