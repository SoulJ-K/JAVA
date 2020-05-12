package com.kh.example.test.model.vo;

import com.kh.example.test.model.vo.Parent;

public class Child3 extends Parent{
	public Child3() {
//		super.num = 10; 접근제한자 private 때문에
//		super.dNum = 15.2;   접근제한자 defult는 같은 패키지에 한에서만 가능
		super.bool = false; /* 프로텍트는 패키지가 같지 않아도 자식에게 상속 가능*/
		super.ch = 'd';
	}

}
