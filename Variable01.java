package com.test;

public class Variable01 {
	
	//main 메소드, 프로그램 진입점(실행 기능)
	public static void main(String[] args) {
		//생성자
		Variable01 var = new Variable01();
		var.Test01();
		//생성자
		Variable01 var02 = new Variable01();
		var02.Test02();

	}
	
	public void Test01() {
		//숫자(정수)
		byte bnum = 1;
		short snum = 2;
		int inum = 4;
		long lnum = 8L; //L은 long을 의미한다.
		//다만 L을 붙이지 않아도 자동으로 long으로 변환된다.
		//출력될 때는 L은 붙지 않는다.
		
		//숫자(실수)
		float fnum = 4.0f; // f는 float을 의미한다.
		//반드시 f를 붙여야한다.
		//출력될 때는 f는 붙지 않는다.
		
		double dnum = 8.0;
		
		//논리
		boolean isTrue = true;//true 또는 false 만 가능.(반드시 소문자)
		//0과 1 또한 사용 불가능.
		
	
		//문자(한 글자)
		char ch = 'A';
		
		//문자열(참조형, 사용할 때는 기본형처럼 사용 가능)
		String str = "A";
		
		//출력문(변수에 저장된 값을 출력)
		System.out.println("bnum : " + bnum);
		System.out.println("snum : " + snum);
		System.out.println("long : " + lnum);
		System.out.println("fnum : " + fnum);
		System.out.println("str : " + str);
		System.out.println("isTrue : " + isTrue);
		System.out.println();
	}

	//[변수 선언]
	//자료형(타입) 변수명;
	//자료형: 생성할 변수의 종류(어떤 종류 값이 들어갈지 결정)
	//변수명: 우리가 사용할 변수의 이름(방의 이름)
	
	//[변수 선언과 동시에 초기화]
	public void Test02() {
		int inum = 4;
		long lnum = 7;
		float fnum = 8.51f;
		String str = "Hi!";
		
		System.out.println("inum : " + inum);
		System.out.println("lnum : " + lnum);
		System.out.println("fnum : " + fnum);
		System.out.println("str : " + str);
	}
}
