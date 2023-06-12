package com.yedam.memo;

import java.io.FileOutputStream;

public class FileEx {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("src/com/yedam/memo/sample.txt");
			fos.write(10);
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("end of prog");
	}
}
