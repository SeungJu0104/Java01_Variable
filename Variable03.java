package com.test;

public class Variable03 {
	//java.lang 패키지는 import가 필요없는 유일한 패키지.
	//다른 패키지는 import 시켜야 사용가능하다.
	public static void main(String[] args) {
		//[상수 테스트]
		int age;//변수는 대소문자를 구별한다.
		final int AGE;//final을 이용해 AGE 변수를 상수로 선언.
		
		age = 20;
		AGE = 25;
		
		System.out.println("age: " + age);
		System.out.println("AGE: " + AGE);
		
		//AGE = 30; AGE 변수는 상수 선언을 했기 때문에 실행 시 오류 발생.
		//즉, 상수는 최초 1회만 값을 기록할 수 있고 이후에는 값 변경이 불가능하다.
		age = 40;
		System.out.println("age: " + age);
		System.out.println("AGE: " + AGE);
		
	}

	
	
}
