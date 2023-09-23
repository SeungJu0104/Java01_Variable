package com.test;

public class Variable05 {
	//[형변환]
	//자동형변환, 강제형변환
	//자동형변환은 정수에서 실수쪽으로 이어진다.
	//강제형변환은 (자료형)변수명 또는 입력 값
	//강제형변환시 데이터의 손실이 발생할 수 있다.

	public static void main(String[] args) {
		Variable05 var = new Variable05();
		var.test01();

	}
	
	public void test01() {
		//작은 크기의 자료형은 큰 크기의 자료형으로 손실없이 저장 가능.(자동형변환 또는 upcasting 또는 묵시적형변환)
		//큰 크기의 자료형을 작은 크기의 자료형으로 자동 변환되지 않기에 별도로 바꿀 자료형을 명시해야한다.(강제형변환 또는 downcasting 또는 명시적형변환)
		//큰 크기의 자료형을 작은 크기의 자료형으로 변환할 경우 데이터의 손실이 발생할 수 있다.
		//강제형변환은 (자료형)변수명 또는 입력 값
		int num = 'A';//char은 각 문자마다 대응되는 유니코드 값(숫자)이 있기 때문에 문자가 int로 자동형변환이 이뤄진다.
		System.out.println("num: " + num);
		
		char ch = 65;//char은 각 문자마다 대응되는 유니코드 값(숫자)이 있기 때문에 int가 문자로 자동형변환이 이뤄진다.
		System.out.println("ch: " + ch);
		
		ch = (char)num;//변수에 따로 담겨있다면 자동형변환이 이뤄지지 않는다. 그러므로 강제형변환을 해야한다.
		
		double dno = 65;//정수가 실수로 자동형변환.
		System.out.println("dno: " + dno);
		
		int inum = 10;
		long lnum = 100;
		
		//int isum = inum + lnum;//에러. long이 int보다 큰 자료형이므로 자동형변환이 이뤄지지않는다.
		int isum = (int)(inum + lnum);//결과를 int로 강제형변환.
		System.out.println("isum: " + isum);
		
		int isum2 = inum + (int)lnum;//long변수를 int로 강제형변환.
		System.out.println("isum2: " + isum2);
		
		//데이터손실
		double dnum = 1234.56;
		
		int res = (int)dnum;//실수를 정수로 강제형변환을 하면 실수부분을 버림한다.
		System.out.println("res: " + res);
		System.out.println("(double)res: " + (double)res);//강제형변환을 하면서 손실된 데이터는 돌아오지 않는다.
		
		int isum3 = inum + (int)dnum;
		System.out.println("isum3: " + isum3);
		
		int isum4 = (int)(inum + dnum);
		System.out.println("isum4: " + isum4);
	}

}
