package com.kh.example.chap06_method.controller;

import com.kh.example.chap05_constructor.model.vo.User;

//메소드 연습
public class MethodTest {
	//매개변수의 유무와 반환 값 유무에 따른 구분
	//1. 매개변수 없고 반환 값 없는 메소드
	public void method1() {
		//반환값 없다		매개변수 없다
		System.out.println("매개변수와 반환 값 둘 다 없는 메소드입니다.");
	}
	
	//2. 매개변수 없고 반환 값 있는 메소드
	public int method2() {
		//반환값O      매개변수X
		//This method must return a result of type int
		//반환형이 존재하는 메소드에서 return값을 명시해주지 않을 때 나오는 에러
		//(현재 뱐환해야 하는 값은 int이기 때문에 type int라고 뜨는 것)
		
//		return 0;
		int i = 10;
		return i;
	}
	
	//3. 매개변수 있고 반환 값 없는 메소드
	public void method3(int num1, int num2) {
		//반환값X          매개변수O
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		int sum = num1 + num2;
		System.out.println("sum : "+ sum);
	}
	
	//4. 매개변수 있고 반환 값 있는 메소드
	public int method4(int num1, int num2) {
		// 반환값O         매개변수O
		return num1 + num2;
		
	}
	
	//심화1. 반환값이 배열인 경우
	public int[] method5() {
		int[] iArr = {1, 2, 3, 4, 5};
		for(int i = 0; i<iArr.length; i++) {
			iArr[i] *= 10;
		}
		System.out.println("MethodTest iArr : " + iArr);
		return iArr;
	}
	//심화2. 반환값이 클래스인 경우
	public User method6() {
		User user = new User("user01", "pass01", "박신우");
		System.out.println("MethodTest user : " + user);
		
		return user;
	}
	

}
