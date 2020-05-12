package com.kh.example.chap04_field.controller;

public class A_KindsOfVariable1 {  // 클래스 영역의 시작
	
	// 클래스 영역에 작성하는 변수 = 필드 = 멤버변수 = 멤버필드 = 전역변수
	
	private int globlaNum;
	
	public void method1(int num) {  // 메소드 영역의 시작
		//				------- --> 매개변수 : 메소드의 선언부 중 괄호안에 선언하는 변수
//											외부에서 보내는 값을 그대로 받아오는 역할
		
		//메소드 영역에서 작성하는 변수의 이름 = 지역변수
		
		int localNum;
		//매개변수 역시 지역변수의 일종으로 생각함.
		
		
		localNum = 10;
		System.out.println(localNum);
		//The local variable localNum may not have been initialized
		//지역변수는 반드시 초기화가 되어있어야함.
		
		System.out.println(num);
		// num은 값을 받아오는 매개변수이므로 초기화 필요 없음
		
		System.out.println(globlaNum);
		//globalNum은 전역변수이기 때문에  바로 출력 가능
		
		
	}  // 메소드 영역의 끝
	
	public void method2() {
//		System.out.println(localNum); 
		//localNum cannot be resolved to a variable
		//localNum은 지역변수. 지역변수는 해당 지역 내에서만 사용 가능
		System.out.println(globlaNum);
		
		
		
		
	}

}  // 클래스 영역의 끝
