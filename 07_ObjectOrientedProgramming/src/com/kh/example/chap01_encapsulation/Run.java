package com.kh.example.chap01_encapsulation;

public class Run {
	public static void main(String[] args) {
		Account a = new Account();
		
		//현재 잔액 조회
		a.displayBalance();
		
		a.deposit(1000000);
		a.displayBalance();
		
		a.deposit(1500000);
		a.displayBalance();
		
		a.withDraw(500000);
		a.displayBalance();
		
		
//		a.balance -= 2000000;
		//The field Account.balance is not visible
		//private을 걸어놔서 안됨.
		//private은 나 자신(Account)에서만 볼 수 있게 제한함.
		//외부 클래스인 Run에서는 볼 수 없음
		
		a.withDraw(500000);
		a.displayBalance();
	}

}
