package com.kh.example.chap04_field.controller;

public class A_KindsOfVariable1 {  // Ŭ���� ������ ����
	
	// Ŭ���� ������ �ۼ��ϴ� ���� = �ʵ� = ������� = ����ʵ� = ��������
	
	private int globlaNum;
	
	public void method1(int num) {  // �޼ҵ� ������ ����
		//				------- --> �Ű����� : �޼ҵ��� ����� �� ��ȣ�ȿ� �����ϴ� ����
//											�ܺο��� ������ ���� �״�� �޾ƿ��� ����
		
		//�޼ҵ� �������� �ۼ��ϴ� ������ �̸� = ��������
		
		int localNum;
		//�Ű����� ���� ���������� �������� ������.
		
		
		localNum = 10;
		System.out.println(localNum);
		//The local variable localNum may not have been initialized
		//���������� �ݵ�� �ʱ�ȭ�� �Ǿ��־����.
		
		System.out.println(num);
		// num�� ���� �޾ƿ��� �Ű������̹Ƿ� �ʱ�ȭ �ʿ� ����
		
		System.out.println(globlaNum);
		//globalNum�� ���������̱� ������  �ٷ� ��� ����
		
		
	}  // �޼ҵ� ������ ��
	
	public void method2() {
//		System.out.println(localNum); 
		//localNum cannot be resolved to a variable
		//localNum�� ��������. ���������� �ش� ���� �������� ��� ����
		System.out.println(globlaNum);
		
		
		
		
	}

}  // Ŭ���� ������ ��
