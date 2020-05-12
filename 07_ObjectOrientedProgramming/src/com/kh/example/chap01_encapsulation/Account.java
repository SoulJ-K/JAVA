package com.kh.example.chap01_encapsulation;

public class Account {
	private String name = "박신우";
	private String phone = "010-123-4567";
	private String pwd = "1q2w3e4r";
	private int bankCode = 3030;
	private int balance = 0; //잔액

	//class영역 안에 있는 변수들 = 멤버변수 = field = 전역변수 = 멤버field
	//멤버변수 앞에는 무조건 private라는 접근제한자를 붙여야함
	
	//입금 메소드
	public void deposit(int money) {
		if(money>0) {
			balance += money;
			System.out.println(name + "님의 계좌에 " + money + "원이 입금되었습니다.");
		}else {
			System.out.println("잘못된 금액이 입력되었습니다.");
		}
	}
	// 메소드 안에 있는 변수 =  지역변수
	
	//출금 메소드
	public void withDraw(int money) {
		if(money <= balance) {
			System.out.println(name + "님의 계좌에서 " + money + "원이 출금되었습니다.");
		} else {
			System.out.println("잔액이 부족합니다. 잔액을 확인하세요.");
		}
	}
	
	
	//잔액 조회 메소드
	public void displayBalance() {
		System.out.println(name + "님의 계좌 잔액은 " + balance + "원입니다.");
	}
}

