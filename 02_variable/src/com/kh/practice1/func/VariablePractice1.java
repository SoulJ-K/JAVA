package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	public void inputScanner() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();		
		
		System.out.print("������ �Է��ϼ���(��/��) : ");
		String gender = sc.next();		
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		sc.nextLine();		
		
		System.out.print("Ű�� �Է��ϼ���(cm) :");
		double height = sc.nextDouble();		
		
		System.out.println("Ű " + height+"�� " + age+"�� "+gender + name+"�� �ݰ����ϴ�^^");
	}
}

	