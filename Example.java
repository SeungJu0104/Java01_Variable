package com.example;

import java.util.Scanner;

public class Example {
	
	Scanner scn = new Scanner(System.in);
	
	public void example1() {
		System.out.print("첫번째 숫자 : ");
		int num1 = scn.nextInt();
		System.out.print("두번째 숫자 : ");
		int num2 = scn.nextInt();
		
		int sum = num1 + num2;
		int gob = num1 * num2;
		int cha = num1 - num2;
		int na = num1 / num2;
		int left = num1 % num2;
		
		System.out.println("더하기 결과 : " + sum);
		System.out.println("빼기 결과 : " + cha);
		System.out.println("곱하기 결과 : " + gob);
		System.out.println("나머지 결과 : " + left);
	}
	
	public void example2() {
		System.out.print("가로 : ");
		double garo = scn.nextDouble();
		System.out.print("세로 : ");
		double sero = scn.nextDouble();
		
		double res = garo * sero;
		double res2 = (garo + sero) * 2;
		
		System.out.println("면적 : " + res);
		System.out.println("둘레 : " + res2);
	}
	
	public void example3() {
		System.out.print("문자열을 입력하시오. : ");
		String val = scn.next();
		
		System.out.println("첫번째 문자 : " + val.charAt(0));
		System.out.println("두번째 문자 : " + val.charAt(1));
		System.out.println("세번째 문자 : " + val.charAt(2));
		System.out.println("입력된 글자 개수 : " + val.length());
		
	}
	
	

}
