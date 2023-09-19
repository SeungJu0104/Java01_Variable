package com.test;

//현재 위치(com.test) 패키지 외 다른 패키지(java.io)에 속한 클래스를 사용하려면 import를 해야한다.
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Scanner;

public class Variable02 {

	public static void main(String[] args) {
		Variable02 var = new Variable02();
		//var.inputTest01();
		var.inputTest02();
	}
	
	public void inputTest01() {
		//키보드 입력 : java.io 패키지에서 제공하는 클래스를 활용.
		//BufferedReader(String으로만 입력 가능. 다른 자료형은 형변환 필요.)
		//입력받은 내용을 버퍼에 저장해 try catch문 내에 value로 입력값을 다시 저장.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String value = br.readLine();
			String value02 = value + "!!";
			System.out.println(value02);
		} catch(java.io.IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void inputTest02() {
		//Scanner 변수명 = new Scanner(System.in);
		Scanner scn = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String name = scn.nextLine();
		System.out.print("나이 입력 : ");
		int age = scn.nextInt();
		//정수 -> 스캔에 사용한 변수명.nextInt();
		//실수 -> 스캔에 사용한 변수명.nextDouble(); 또는 스캔에 사용한 변수명.nextFloat();
		//문자열 -> 스캔에 사용한 변수명.nextLine(); 또는 스캔에 사용한 변수명.next();
		scn.close();
		
		System.out.println(name);
		System.out.println(age);
		
	}
	

}
