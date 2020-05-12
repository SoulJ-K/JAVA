package com.kh.example.chap04_field.run;

import com.kh.example.chap04_field.controller.B_KindsOfVariable2;
import com.kh.example.chap04_field.model.vo.Product;

public class Run {
	public static void main(String[] args) {
		// 객체생성 : B_KindsOfVariable2
		B_KindsOfVariable2 bk = new B_KindsOfVariable2();
		int a = bk.staticNum;
		//The static field B_KindsOfVariable2.staticNum should be accessed in a static way
		
		int a1 = B_KindsOfVariable2.staticNum;
		//static이라는 공유하는 예약어 때문에 객체생성을 하지 않아도 됨
		//static = 클래스 이름.변수이름
		
		B_KindsOfVariable2 bk2 = new B_KindsOfVariable2();
//									--------------------- > 생성자
		
		Product p = new Product();
		p.inform();
		//JVM 기본 값 초기화 : null, null, 0, 0
		//명시적 초기화 : 초코파이, 오리온, 1500, 100
		//인스턴스 초기화 블럭 : 칸초, 롯데, 1000, 90
		
		Product p2 = new Product();
		p2.inform();
		//인스턴스 초기화 블럭 : 칸초, 롯데, 1000, 80
		
		Product p3 = new Product();
		p3.inform();
		//인스턴스 초기화 블럭 : 칸초, 롯데, 1000, 70
//		칸초, 롯데, 1000, 139
//		칸초, 롯데, 1000, 129
//		칸초, 롯데, 1000, 119



	}

	
}
