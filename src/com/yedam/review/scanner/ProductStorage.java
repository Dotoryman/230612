package com.yedam.review.scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductStorage {// 637page
	private List<Product> list = new ArrayList<>();
	private Scanner scn = new Scanner(System.in);
	private int counter;
	
	public void showMenu() {
		while(true) {
			System.out.println("---------------------------");
			System.out.println("1. 등록 | 2. 목록 | 3. 종료 ");
			System.out.println("---------------------------");
			System.out.println("선택 > ");
			String selectNo = scn.nextLine();
			switch(selectNo) {
			case "1" : registerProduct(); break;
			case "2" : showProducts(); break;
			case "3" : return;
			}
		}
	}
	
	public void registerProduct() {
		try {
			Product product = new Product();
			product.setPno(++counter);
			
			System.out.println("상품명 : ");
			product.setName(scn.nextLine());
			
			System.out.println("가격 : ");
			product.setPrice(Integer.parseInt(scn.nextLine()));
			
			System.out.println("재고 : ");
			product.setStock(Integer.parseInt(scn.nextLine()));
			
			list.add(product);
			
		}catch(Exception e) {
			System.out.println("등록에러 : " + e.getMessage());
		}
	}
	public void showProducts() {
		for(Product p : list) {
			System.out.printf("상품번호 %d , 상품명 %s, 상품가격 %d, 상품재고수량 %d\n",
					p.getPno(), p.getName(), p.getPrice(), p.getStock());
		}
	}
}

