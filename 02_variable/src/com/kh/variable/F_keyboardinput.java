package com.kh.variable;

import java.util.Scanner;

public class F_keyboardinput {
	public void inputScanner() {
		Scanner sc = new Scanner(System.in);
		//scanner����� �� �� ����Ʈ!
		System.out.print("�̸��� �Է��ϼ���: ");// �ȳ���������
		//�ȳ������� �� �ʿ�
		String name = sc.nextLine();
		//sc.nextline���� �̸��� �Է��ϼ��䰡 ����ڰ� ������ �Է��ϱ� ������ Ȱ��ȭ�Ǿ�����
		//�׷��� ��� �� ���� ���� �̸��� �Է��ϸ� String name�� �̸��� �Էµ�. �׷��� �������� �̸��� ��µ�
		System.out.println(name);
		
		System.out.print("���̸� �Է��ϼ���: ");
		int age = sc.nextInt();
		
		System.out.print("Ű(�Ҽ��� ù° �ڸ����� �Է�) :");
		double height = sc.nextDouble();
		System.out.println(name + "���� " + age + "���̸�, Ű�� " + height + "cm�Դϴ�.");
		
}
	public void inputScanner2() {
		//����ڿ��� �̸��� ���̸� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ���: ");
		String name = sc.nextLine();
		System.out.print("���̸� �Է��ϼ���: ");
//		int age = sc.nextInt();
		int age = Integer.parseInt(sc.nextLine());
		System.out.print("�ּҸ� �Է��ϼ���: ");
		String address = sc.nextLine();
		//System.out.println(name + "����" + age + "���̸�, �ּҴ� " + address + "�Դϴ�.");
		//�̷��� �ϸ� �ּ� ���� ���� ������ ����
		//�ּҸ� �Է��ϼ���: ���������20���̸�, �ּҴ� �Դϴ�  ��� ��� ����.
		//nextLine�� �ٹٲ�(����)�� �ν��Ͽ� ���� �ȿ� �ٹٲ��� ������ �ʰ� ��� ������ ��������, �������� �ٹٲ��� �ν����� ���ϰ� ���ۿ� ����
		/*������ �Է��ϸ� buffer��� �ӽð����� ��
		ex) �������� ������ �Է� �� ���� ħ. ��ǻ�Ϳ��� ���ʹ� �ٹٲ� =n���� ǥ�õ�
				���� 10�� ���۾ȿ� �־����� nextInt()�� ������ ���� 10�� ������ ���۾ȿ��� �ٹٲ��� ��������
				�� ������ ���ڸ� �ֱ� ���� nextLine()�� ������ �־���ϴµ� ���۾ȿ� �����ִ� �ٹٲ��� ������ �Էµ�.*/
		
		//�ذ��ϴ� ���
				//���1. �ٹٲ��� ������ �� �ִ� nextLine() �߰�
//				int age = sc.nextInt();
//				sc.nextLine();
//				//���ۿ� �����ִ� �ٹٲ��� ���ֱ� ���� �뵵 
//				System.out.print("�ּҸ� �Է��ϼ���: ");
//				String address = sc.nextLine();
		//System.out.println(name + "����" + age + "���̸�, �ּҴ� " + address + "�Դϴ�.");
//				���2. age�� ���� ���� nextLine()�� ���� int�� �Ľ��ϱ�
		//�Ľ� : ���ڿ��� �⺻�ڷ������� �ٲ��ִ� ��
//		String userAge = sc.nextLine();
//		int age = Integer.parseInt(userAge);
		
		//���3. next()�� �ּҸ� �ޱ�
		//�Ѱ� : ���⸦ �����ڷ� �ν��ؼ� ���Ⱑ �ִ� ��� ó������ ������
//		int age = sc.nextInt();
//		String address = sc.next();
		
		//+�߰� : char���� �ް� ��������?
		System.out.print("������ �Է��ϼ��� : ");
//		String  userGender = sc.nextLine();
//		char gender = userGender.charAt(0);
		char gender = sc.nextLine().charAt(0);
		//charAt(int index)�� ���ڿ����� index��°�� ���ڸ� �������ִ� �޼ҵ�
		//char�� ������ String�̶�� �θ� 
		//zero index������� 0���� ������. pig �� g�� 3��°�� �ƴ϶� 2��°
		
		System.out.println(name + "����" + age + "���̸�, �ּҴ� " + address + "�Դϴ�.");
		System.out.println("gender :" + gender);
		
		
		
		
		

		
		
	}
}
