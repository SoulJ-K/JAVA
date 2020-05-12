package com.kh.example.chap02_tryCatch.controller;

import java.io.IOException;

public class TryCatchController {
	
	public void method1() {
		System.out.println("method1() 호출됨.....");
//		try {
//		method2();
//		} catch (IOException e) {
//			System.out.println(e.getMessage());	
		
//		}finally {
//			System.out.println("예외 발생 여부와 상관없이 무조건 수행됨");
//		}
//		System.out.println("method1() 종료됨....");
//	}
	
	try {
		method2();
		System.out.println("예외 발생시에 출력될까?");       //안됨. method2에서 예외발생하니까 바로 catch로 넘어감
		} catch (IOException e) {
		e.printStackTrace();
		System.out.println(e.getMessage());          //("IOException을 강제로 발생시켰습니다") 안에 있는 메세지만 전달
		} catch(Exception e) {
		System.out.println("Exception으로 잡았음");
		} finally {
		System.out.println("예외 발생 여부와 상관없이 무조건 수행됨");
		}
	}
	
	public void method2() throws IOException {
		System.out.println("method2() 호출됨.....");
		method3();
		System.out.println("method2() 종료됨....");
	}
	
	public void method3() throws IOException {
		System.out.println("method3() 호출됨.....");
		throw new IOException("IOException을 강제로 발생시켰습니다");
//		System.out.println("method3() 종료됨....");
	}

}
