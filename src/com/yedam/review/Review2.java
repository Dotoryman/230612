package com.yedam.review;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Review2 {
	//597page
	public static void main(String[] args) throws Exception {
		OutputStream os =new FileOutputStream("c:/temp/test2.txt");
		
		byte[] array = {10, 20, 30, 40, 50};
		
		os.write(array, 1, 3);
		
		os.flush();
		os.close();
		
		System.out.println("end");
	}
}
