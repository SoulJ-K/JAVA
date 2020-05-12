package com.kh.test;

public class MethodPrinter {
	public void methodA() {
	System.out.println("methodA() 호출됨...");
//	return;
	//return 밑에는 코드를 적지 않음
	// Lifo 방식이라고 불리움. 가장 나중에 들어와서 가장 먼저 나간다.
	methodB();
	System.out.println("methodA() 끝남...");
	}
	
	public void methodB() {
		System.out.println("methodB() 호출됨...");
		methodC();
		System.out.println("methodB() 끝남...");
	}	
		
	public void methodC() {
			System.out.println("methodC() 호출됨...");
			System.out.println("methodC() 끝남...");
	
}
}