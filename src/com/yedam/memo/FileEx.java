package com.yedam.memo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileEx {
	public static void main(String[] args) {
		try {
//			FileOutputStream fos = new FileOutputStream("src/com/yedam/memo/sample.txt");
//			fos.write(10);
//			fos.close();
//			MemoApp.java 파일을 읽어서 화면(콘솔)에 출력해보기
			FileInputStream fis = new FileInputStream("src/com/yedam/memo/MemoApp.java");
			InputStreamReader fisr = new InputStreamReader(fis);
			char[] buf = new char[1000];
			fisr.read(buf);

			String str = new String(buf);
			System.out.println(str);

			fisr.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("end of prog");
	}
}
