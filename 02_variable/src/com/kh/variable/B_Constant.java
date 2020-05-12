package com.kh.variable;

public class B_Constant {
public void finalConstant() {
	int age; //일반 변수 선언
	final int AGE; //상수 선언
	
	age = 20;
	AGE = 20;
	
	System.out.println("age :" + age);
	System.out.println("AGE :" + AGE);
	
	
	//변수의 값 변경
	age = 30;
	//AGE = 30;
	//The final local variable AGE may already have been assigned
	//상수값은 변할 수 없다.
	//상수값은 이미 20으로 한번 정해져있음. 그래서 바꿀 수 없음.
	
	System.out.println("값 변경 후 age :" + age);
	System.out.println("값 변경 후 AGE :" + AGE);
	
}
}
