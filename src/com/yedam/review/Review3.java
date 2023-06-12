package com.yedam.review;

import java.io.FileInputStream;
import java.io.InputStream;

public class Review3 {
	//599page
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("c:/temp/test2.txt");
		while(true) {
			int data = is.read();
			if(data == -1) {
				break;
			}
			System.out.println(data);
		}
		is.close();
	}
}
