package com.kh.variable;

public class A_Variable {

	public void declareVariable() {//�޼ҵ�
	//���� ���� �� �ʱ�ȭ
		//A. ���� ���� : �ڷ��� ������;
		//1.  ����
		boolean isTrue;
		//2.������
		//2-1.����
		char ch;
		//2-2.���ڿ�
		String str;
		//3. ������
		//3-1.����
		byte bNum;
		short sNum;
		int iNum;
		long lNum;
		//3-2.�Ǽ�
		float fNum;
		double dNum;
		//B. �ʱ�ȭ(����) : ������=��;
		isTrue = true;
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L;
		
//		fNum = 4.0;
		//ype mismatch: cannot convert from double to float
		//: 4.0�� �Ǽ��ε� �⺻������ �Ǽ��� double�� �⺻���̱� ������ 4.0�� float�� ����� ���� ����.
		// �ٵ� fNum�� �⺻���� 4����Ʈ�ε� �ְ����ϴ� ���� 8����Ʈ�� �������̱� ������
		// ū ���� ���� ���� ���� �� ���� ������ �׷��� �ڿ� f�� �ٿ� float ǥ�� �ؾ���
		fNum = 4.0f;
		dNum = 8.0;
		
		ch = 'A';
		str = "A";
		
		System.out.println("isTrue�� �� :" + isTrue);
		System.out.println("bNum�� �� :" + bNum);
		System.out.println("sNum�� �� :" + sNum);
		System.out.println("iNum�� �� :" + iNum);
		System.out.println("lNum�� �� :" + lNum);
		System.out.println("fNum�� �� :" + fNum);
		System.out.println("dNum�� �� :" + dNum);
		System.out.println("ch�� �� :" + ch);
		System.out.println("str�� �� :" + str);
	}
	
	public void initVariable() {
		//���� ����� ���ÿ� �ʱ�ȭ
		//1. ����
		boolean isTrue = false;
		//2. ������
		//2-1. ����
		char ch = '��';
		//2-2. ���ڿ�
		String str = "KH����������";
		//3. ������
		//3-1. ����
		byte bNum = 1;
		short sNum = 2;
		int iNum = 4;
		long lNum = 8L;
		//3-2. �Ǽ�
		float fNum = 4.0f;
		double dNum = 8.0d;
		
		System.out.println("isTrue�� �� :" + isTrue);
		System.out.println("bNum�� �� :" + bNum);
		System.out.println("sNum�� �� :" + sNum);
		System.out.println("iNum�� �� :" + iNum);
		System.out.println("lNum�� �� :" + lNum);
		System.out.println("fNum�� �� :" + fNum);
		System.out.println("dNum�� �� :" + dNum);
		System.out.println("ch�� �� :" + ch);
		System.out.println("str�� �� :" + str);
		
		
		
	}
		
		
}
