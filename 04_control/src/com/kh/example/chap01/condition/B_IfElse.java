package com.kh.example.chap01.condition;

import java.util.Scanner;

public class B_IfElse {
	//if-else��
	//if(���ǽ�){
	//������ ����1;
	//} else {
	//������ ����2;
	//}
	//�� �� �Ѱ��� �����ϴ� ���ǹ�
	//���ǽ� ��� ���� ���̸� if�� �ȿ� �ִ� ������ ���� 1 ����
	//���ǽ� ��� ���� �����̸� if�� �������� else�� �ȿ� �ִ� ������ ���� 2 ����
	
	
		
	public void method1() {
		//Ű����� �Է��� ���ڰ� ¦������ Ȧ������ ���
		 
		 //"���� �Ѱ� �Է��ϼ��� : " �ȳ����� ��� �� num������ ������ ����
		 
		 //¦���� "�Է��Ͻ� ���ڴ� ¦���Դϴ�", Ȧ���� "�Է��Ͻ� ���ڴ� Ȧ���Դϴ�" ���
		 //���α׷��� ���� �� "���α׷� ����"���� ��� �� ���α׷� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Ѱ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("�Է��Ͻ� ���ڴ� ¦���Դϴ�");
		} else {
			System.out.println("�Է��Ͻ� ���ڴ� Ȧ���Դϴ�");
		}
		System.out.println("���α׷� ����");
		
		}
	
	public void method2() {
		//����ڿ��� ����, ����, ���� ������ �Է� �޾Ƽ� ���� kor, eng, mate ������ ����
		//�� ���� ������ 40�� �̻��̰� �� ���� �������� 60�� �̻��� �� "�������"
		//�ϳ��� ���� �̴��� �� "���� �����" ���
		
		Scanner sca = new Scanner(System.in);
		System.out.print("���� ������ �Է��ϼ��� : ");
		int kor = sca.nextInt();
		sca.nextLine();
		
		System.out.print("���� ������ �Է��ϼ��� : ");
		int eng = sca.nextInt();
		sca.nextLine();
		
		System.out.print("���������� �Է��ϼ��� : ");
		int math = sca.nextInt();
		sca.nextLine();
		
		double avg = (kor + eng + math) / 3.0;
		
		if (kor >= 40 && eng >=40 && math >= 40 && avg >= 60) {
			System.out.println("�������");
			} else {
				System.out.println("��������");
			}
		}
	public void method3() {
		//���ڿ� ���ϱ�
		//����ڿ��� �̸��� �޴µ� ���� ������ �̸��� ������ "�����Դϴ�"
		//���� ������ "������ �ƴմϴ�" ���
		//String������ ==���� ���� ���� �� ����
		//���ڿ� �񱳴� String class �ȿ� �ִ� equals() method ���
		Scanner scr = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = scr.nextLine();
		
		if(name.contentEquals("�ڽſ�")) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("������ �ƴմϴ�");
			}
		
		
		
	}
	

}
