package com.yedam.review;

import java.io.FileWriter;
import java.io.Writer;

public class Review5 {
	//607page
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("c:/temp/test3.txt");
		
		String str = "비오는 월요일밤의 복습시간.";
		
		writer.write(str);
		
		writer.flush();
		writer.close();
		
	}
}
