package com.example;

public class TestMain {

	public static void main(String[] args) {
		Example ex = new Example();//같은 클래스 내에서는 클래스명 변수명 = new 클래스명(); 한번만 써도 무방.
		ex.example1();
		ex.example2();
		ex.example3();
		
		//또는 new Example().example1(); 이런 방식으로 non static 메소드 실행 가능하다.
	}

}
