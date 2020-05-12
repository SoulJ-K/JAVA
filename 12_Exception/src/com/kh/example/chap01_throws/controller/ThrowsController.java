package com.kh.example.chap01_throws.controller;

public class ThrowsController {
	public void method1() throws Exception {
		System.out.println("method1() 호출됨.....");		
		method2();
		System.out.println("method1() 종료됨....");
	}
	
	public void method2() throws Exception {
		System.out.println("method2() 호출됨....");
		method3();
		System.out.println("method2() 종료됨....");
	}
	
	public void method3() throws Exception {
		System.out.println("method3() 호출됨....");
		throw new Exception();
		//throw 때문에 강제적으로 Exception 발생
		//Unhandled exception type Exception
		
//		System.out.println("method3() 종료됨....");
//		에러가 발생하면 비정상종료 되기 때문에 에러발생 아래의 내용들은 실행되지 않음.
//		따라서 도달할 수 없는 코드, 의미 없는 코드라고 빨간 줄 뜸
	}

}
