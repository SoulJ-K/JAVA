package com.kh.example.chap01_encapsulation;

public class Run {
	public static void main(String[] args) {
		Account a = new Account();
		
		//���� �ܾ� ��ȸ
		a.displayBalance();
		
		a.deposit(1000000);
		a.displayBalance();
		
		a.deposit(1500000);
		a.displayBalance();
		
		a.withDraw(500000);
		a.displayBalance();
		
		
//		a.balance -= 2000000;
		//The field Account.balance is not visible
		//private�� �ɾ���� �ȵ�.
		//private�� �� �ڽ�(Account)������ �� �� �ְ� ������.
		//�ܺ� Ŭ������ Run������ �� �� ����
		
		a.withDraw(500000);
		a.displayBalance();
	}

}
