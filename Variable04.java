package com.test;

public class Variable04 {
	
	public static void main(String[] args) {
		
		Variable04 var = new Variable04();
		var.test01();
		var.test02();
		
	}
	
	public void test01() {
		//[변수 사이즈 출력]
		System.out.println("byte의 크기 : " + Byte.BYTES);
		System.out.println("int의 크기 : " + Integer.BYTES);
		System.out.println("double의 크기 : " + Double.BYTES);
		System.out.println("char의 크기 : " + Character.BYTES);

	}
	
	public void test02() {
		//[오버플로우]
		//byte bnum = 128; byte 범위 이상의 값이기 때문에 에러 발생.
		//오버플로우는 계산과정에서 범위를 벗어난 값을 가질 경우 발생한다.(최대값에서 최소값으로 순환)
		
		byte bnum = 127;
		System.out.println("bnum : " + bnum);
		
		bnum++;//bnum을 1 증가시킨다.
		System.out.println("bnum : " + bnum);
		System.out.println(bnum+1);//bnum++를 주석처리한 후 128이 나오는 것은 bnum + 1이 int로 자동형변환되어 표현된 것이다.
	}

}
