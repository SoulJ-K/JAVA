package com.kh.example.chap06_method.controller;

import com.kh.example.chap05_constructor.model.vo.User;

//�޼ҵ� ����
public class MethodTest {
	//�Ű������� ������ ��ȯ �� ������ ���� ����
	//1. �Ű����� ���� ��ȯ �� ���� �޼ҵ�
	public void method1() {
		//��ȯ�� ����		�Ű����� ����
		System.out.println("�Ű������� ��ȯ �� �� �� ���� �޼ҵ��Դϴ�.");
	}
	
	//2. �Ű����� ���� ��ȯ �� �ִ� �޼ҵ�
	public int method2() {
		//��ȯ��O      �Ű�����X
		//This method must return a result of type int
		//��ȯ���� �����ϴ� �޼ҵ忡�� return���� ���������� ���� �� ������ ����
		//(���� ��ȯ�ؾ� �ϴ� ���� int�̱� ������ type int��� �ߴ� ��)
		
//		return 0;
		int i = 10;
		return i;
	}
	
	//3. �Ű����� �ְ� ��ȯ �� ���� �޼ҵ�
	public void method3(int num1, int num2) {
		//��ȯ��X          �Ű�����O
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		int sum = num1 + num2;
		System.out.println("sum : "+ sum);
	}
	
	//4. �Ű����� �ְ� ��ȯ �� �ִ� �޼ҵ�
	public int method4(int num1, int num2) {
		// ��ȯ��O         �Ű�����O
		return num1 + num2;
		
	}
	
	//��ȭ1. ��ȯ���� �迭�� ���
	public int[] method5() {
		int[] iArr = {1, 2, 3, 4, 5};
		for(int i = 0; i<iArr.length; i++) {
			iArr[i] *= 10;
		}
		System.out.println("MethodTest iArr : " + iArr);
		return iArr;
	}
	//��ȭ2. ��ȯ���� Ŭ������ ���
	public User method6() {
		User user = new User("user01", "pass01", "�ڽſ�");
		System.out.println("MethodTest user : " + user);
		
		return user;
	}
	

}