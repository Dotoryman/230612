package com.yedam.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class StudentEx_Answer {
	public static void main(String[] args) {
		try {
			method2();
			method1();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end of prog");
	}

	public static void method2() throws IOException {
		InputStream is = new FileInputStream("c:/temp/students.txt");
		InputStreamReader isr = new InputStreamReader(is); // 바이트 -> char로 바꿔주기
		char[] buf = new char[100];
		isr.read(buf); // read 입력스트림을 통해서 buf 저장.

		String str = new String(buf);
		System.out.println(str);
//		String[] strAry = str.split("\n");
//		for (String student : strAry) {
//			if (student != null) {
//				String[] std = student.split(" ");
//				System.out.printf("학생번호 %s , 이름 %s, 점수 %s", std[0], std[1], std[2]);
//			}
//		}

		isr.close();
		is.close();
	}

	public static void method1() throws IOException {
		Scanner scn = new Scanner(new File("c:/temp/students.txt"));
		String name = "";
		int sum = 0, cnt = 0, maxScore = 0;
		double avg = 0;
		while (true) {
			String values = "";
			try {
				values = scn.nextLine(); // 학생정보 1라인
			} catch (NoSuchElementException e) {
				break;
			}
			String[] valAry = values.split(" ");
			sum += Integer.parseInt(valAry[2]);
			cnt++;
			if (maxScore < Integer.parseInt(valAry[2])) {
				maxScore = Integer.parseInt(valAry[2]);
				name = valAry[1];
			}
		}
		avg = (double) sum / cnt;
		System.out.printf("평균점수는 %.2f 입니다\n", avg);
		System.out.printf("최고점수는 %d 점이며 점수의 주인공은 %s 학생입니다.\n", maxScore, name);
	}
}
