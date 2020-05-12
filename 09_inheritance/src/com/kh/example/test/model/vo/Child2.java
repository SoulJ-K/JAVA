package com.kh.example.test.model.vo;

public class Child2 extends Parent{
	//상속받아 확장
	private String str;
	
	public Child2() {
//		super.num = 10; 접근 범위가 private라 불가능
		super.dNum = 2.3; /*디폴트 - 같은 패키지라 가능*/
		super.bool = false; /*프로텍트 - 같은 패키지이며 후손이라 가능*/
		super.ch = 'a'; /*접근범위가 public이라*/
	}
	
	public void setStr(String str) {
		this.str = str;
	}
	
	public String getStr() {
		return str;
	}

}
