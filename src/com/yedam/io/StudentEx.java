package com.yedam.io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class StudentEx {
	public static void main(String[] args) {
		// c:/temp/students.txt 학생들 점수의 평균
		// 최고점수의 학생이름과 최고점수 출력
		try {
			write1();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end of prog");
		
	}
	
	public static void write1() throws IOException {
		Map<HashMap<Integer, String>, Integer> map = new HashMap<>();
		FileWriter fr = new FileWriter("c:/temp/students.txt");
		Scanner scn = new Scanner(System.in);
		System.out.println("학생정보 입력(종료시 quit을 입력하세요) > ");
		while(true) {
			String input = scn.nextLine();
			String[] inputs = input.split(" ");
			if (inputs[0].equals("quit")) {
				System.out.println("종료합니다");
				break;
			}
			if (inputs.length != 3) {
				System.out.println("값을 정확하게 입력해 주세요.");
				continue;
			}
			fr.write(input+ "\n");
			HashMap<Integer, String> key = new HashMap<>();
			key.put(Integer.parseInt(inputs[0]), inputs[1]);

			map.put(key, Integer.parseInt(inputs[2]));
		}
		System.out.println("-------");
		Set<HashMap<Integer, String>> keys= map.keySet();
		Iterator<HashMap<Integer, String>> iter = keys.iterator();
		while(iter.hasNext()) {
			HashMap<Integer, String> key = iter.next();
			Integer val = map.get(key);
			int total = 0;
			
			Set<Entry<Integer, String>> entry = key.entrySet();
			for(Entry<Integer, String> ent : entry) {
				System.out.printf("학번 : %d , 이름 : %s , 점수 : %d\n", ent.getKey(), ent.getValue(), val);
			}
			System.out.printf("평균점수는 %d 점입니다. ", );
			System.out.printf("최고점수는 %d 점이고 최고점수를 획득한 학생은 %s 학생입니다.", );
		}
		fr.flush();
		fr.close();
		scn.close();
	}
}
