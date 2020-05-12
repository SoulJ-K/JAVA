package com.kh.example.chap01_encapsulation;

public class Account {
	private String name = "�ڽſ�";
	private String phone = "010-123-4567";
	private String pwd = "1q2w3e4r";
	private int bankCode = 3030;
	private int balance = 0; //�ܾ�

	//class���� �ȿ� �ִ� ������ = ������� = field = �������� = ���field
	//������� �տ��� ������ private��� ���������ڸ� �ٿ�����
	
	//�Ա� �޼ҵ�
	public void deposit(int money) {
		if(money>0) {
			balance += money;
			System.out.println(name + "���� ���¿� " + money + "���� �ԱݵǾ����ϴ�.");
		}else {
			System.out.println("�߸��� �ݾ��� �ԷµǾ����ϴ�.");
		}
	}
	// �޼ҵ� �ȿ� �ִ� ���� =  ��������
	
	//��� �޼ҵ�
	public void withDraw(int money) {
		if(money <= balance) {
			System.out.println(name + "���� ���¿��� " + money + "���� ��ݵǾ����ϴ�.");
		} else {
			System.out.println("�ܾ��� �����մϴ�. �ܾ��� Ȯ���ϼ���.");
		}
	}
	
	
	//�ܾ� ��ȸ �޼ҵ�
	public void displayBalance() {
		System.out.println(name + "���� ���� �ܾ��� " + balance + "���Դϴ�.");
	}
}

