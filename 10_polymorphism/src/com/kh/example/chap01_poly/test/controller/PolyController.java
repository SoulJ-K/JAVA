package com.kh.example.chap01_poly.test.controller;

import com.kh.example.chap01_poly.test.model.vo.Child1;
import com.kh.example.chap01_poly.test.model.vo.Child2;
import com.kh.example.chap01_poly.test.model.vo.Parent;

//다형성
public class PolyController {

	public void method() {
		//------------본인이 본인을 다룸
		System.out.println("1. 부모타입 레퍼런스로 부모 객체를 다루는 경우");
		Parent p = new Parent();
//		부모타입 레퍼런스 = 부모 객체
		p.printParent();
		//내가 내 안에 있는걸 부르고 있기 때문에 문제 없음
		System.out.println();
		
		System.out.println("2. 자식타입 레퍼런스로 자식 객체를 다루는 경우");
		Child1 c1 = new Child1();
//		자식타입 레퍼런스 = 자식 객체
		c1.printChild1();
		//내가 내 안에 있는걸 부르고 있기 때문에 문제 없음
		c1.printParent();
		//child1이 자식클래스여서 부모에게 있는걸 가져다 쓸 수 있음
		
		System.out.println();
		
		
		//---------------다형성으로 만들어질 수 있는 것 
		System.out.println("3. 부모타입 레퍼런스로 자식 객체를 다루는 경우");
		Parent p2 = new Child2();
		//자식객체가 부모레퍼런스에게 담기는 것을 업캐스팅
		//부모타입의 참조형변수(레퍼런스)가 모든 자식객체를 받을 수 있는 것
		Parent p3 = new Child1();
		p2.printParent();
		//p2.printChild2를 불러올 수 없음.
		//p2는 parent 타입으로 만들어진 객체이므로 child2안에 있는 parent만 불러올 수 있음
		
		((Child2)p2).printChild2();
		//child2로 p2를 형변환해줘서 소환 가능
		//부모가 자식에게 담기는 것을 다운캐스팅
		
		System.out.println();
		
		System.out.println("4. 자식타입 레퍼런스로 부모 객체를 다루는 경우");
//		Child2 c2 = new Parent();
		//child가 더 큰 개념
		//child2는 child2+parent를 가지고 있음. 그런데 new로 parent를 부름
		//parent엔 child2가 없음. 그래서 불러오지 못함.
		
		//---부모는 자식을 받을 수 있지만 자식은 부모를 받을 수 없음.
		
//		Child2 c2 = (Child2) new Parent();
		//어떻게든 해결 할 수 없음
		
		System.out.println();
		System.out.println("=== 간단 예제 ===");
		System.out.println();
		
		Parent[] pArr = new Parent[4];
		pArr[0] = new Child1();
		pArr[1] = new Child2();
		pArr[2] = new Child1();
		pArr[3] = new Child2();
		
		for(int i = 0; i <pArr.length; i++) {
			if(pArr[i] instanceof Child1) {
				((Child1)pArr[i]).printChild1();
			}else if(pArr[i] instanceof Child2) {
				((Child2)pArr[i]).printChild2();
			}
		}
		
		for(int i = 0; i < pArr.length; i++) {
			pArr[i].print();
			//동적 바인딩을 통해 자식들이 출력됨
			//parent pArr[i].print();
			//print를 불러온게 parent이기 때문에 부모야!!!가 출력되야하지만
			//오버라이딩으로 인해 동적바인딩되어 자식들이 출력됨
		}
	
	}
	
	

}
