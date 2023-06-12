package com.yedam.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

// 사원정보를 파일에 저장하기
// 사원번호, 이름, 부서
class Emp implements Serializable { // 직렬화, 딱히 기능은 없지만 이 클래스가 직렬화/역직렬화 가 가능하다는 의미로 표시한다
	int empNo;
	String empName;
	String dept;

	public Emp(int empNo, String empName, String dept) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.dept = dept;
	}

}

public class ObjectEx {

	public static void main(String[] args) throws Exception {
		method2();
		method1();
		System.out.println("end of prog!");
	}

	public static void method2() throws Exception {
		FileInputStream fis = new FileInputStream("c:/temp/list.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);

		List<Emp> list = (List<Emp>) ois.readObject();
		for(Emp emp : list) {
			System.out.printf("사원번호 %d, 이름 %s, 부서 %s \n", emp.empNo, emp.empName, emp.dept);
		}
	
	}

	public static void method1() throws Exception {

		List<Emp> list = new ArrayList<>();
		list.add(new Emp(101, "홍길동", "인사"));
		list.add(new Emp(102, "고길동", "개발"));
		list.add(new Emp(103, "박길동", "총무"));

		FileOutputStream fos = new FileOutputStream("c:/temp/list.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(list);

		oos.close();
		fos.close();

	}
}
