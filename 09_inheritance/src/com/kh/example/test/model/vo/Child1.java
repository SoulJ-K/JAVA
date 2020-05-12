package com.kh.example.test.model.vo;

public class Child1 {
	private String str;
	private int num;
	
	public Child1() {//같은 패키지이나 Parent에게 상속받지 않음.
		Parent p = new Parent();
		
//		p.num = 10;   ---> Private라 안보임
		p.dNum = 0.0; /* 디폴트값이라 가능(같은 패키지)*/
		p.bool = false; /* 프로텍트(같은 패키지) 가능*/
		p.ch = 'A';
	}
	
	//상속받지 않고 불러오는 것이므로 객체생성 필수
	
	public void setStr(String str) {
		this.str = str;
	}
	
	public String getStr() {
		return str;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public int getNum(){
		return num;
	}
}
