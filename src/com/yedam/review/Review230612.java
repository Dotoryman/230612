package com.yedam.review;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Review230612 {
	//595page
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("c:/temp/test1.txt");
		
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		os.write(a);
		os.write(b);
		os.write(c);
		
		os.flush();
		os.close();
		
		System.out.println("end");
	}
}
