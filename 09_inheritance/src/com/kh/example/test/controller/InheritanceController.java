package com.kh.example.test.controller;

import com.kh.example.test.model.vo.Child1;
import com.kh.example.test.model.vo.Child2;
import com.kh.example.test.model.vo.Parent;

public class InheritanceController {
	public void method() {
		//parent클래스의 num필드 접근
		System.out.println("parent클래스의 num필드 접근");
		Parent p = new Parent();
		p.setNum(9);
		System.out.println("Parent 안에 있는 num : " + p.getNum());
		
		System.out.println();
		
		System.out.println("Child1클래스의 str필드 접근");
		Child1 c1 = new Child1();
		c1.setStr("Hello");
		System.out.println("Child1 안에 있는 str : " + c1.getStr());
		System.out.println("Child1클래스의 num필드 접근");
		c1.setNum(99);
		System.out.println("Child1 안에 있는 num : " + c1.getNum());
		//상속하기 전------------------
		
		//상속후------------------
		System.out.println();
		System.out.println("상속후------------------");
		
		System.out.println("Child2 클래스의 str필드 접근");
		Child2 c2 = new Child2();
		c2.setStr("World");
		System.out.println("Child2 안에 있는 str : " + c2.getStr());
		System.out.println("Child2클래스가 상속받은 Parent의 필드 접근");
//		c2.num;
//		Parent의 num 접근 제한자가 private라 접근 물가능
		c2.setNum(999);
		System.out.println("Child2 안에 있는 상속받은 num : " + c2.getNum());
		System.out.println("Parent 안에 있는 num : " + p.getNum());
		// 상속받은 자식클래스에서 값을 바꿔도 부모클래스의 값은 바뀌지 않음
		
		
	}

}
