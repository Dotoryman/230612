package com.yedam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scn = new Scanner(new File("c:/temp/sample.txt"));

		while (true) {
			try {
				String input = scn.nextLine();
				System.out.println(input);
//				if (input == null) {
//					break;
//				} //없어도 된다
			} catch (NoSuchElementException e) {
				break;
			}

		}
		System.out.println("end of prog");
	}
}
