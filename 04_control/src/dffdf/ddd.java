package dffdf;

import java.util.Scanner;

public class ddd {
	Scanner sc = new Scanner(System.in);
		
	 public void method1() {
		 //Ű����� �Է��� ���ڰ� ������� �������� ����Ͻÿ�
		 // "���ڸ� �� �� �Է��ϼ���: " �ȳ���Ʈ ��� �� num ������ �Է��� ���� ����
		 
		 System.out.print("���ڸ� �� �� �Է��ϼ���: ");
		 int num = sc.nextInt();
		 
		 if(num > 0) {
			 System.out.println("���");
		 }
		 
		 if(num < 0) {
			 System.out.println("����");
		 }
		 
		 if(num == 0) {
			 System.out.println("0");
		 }
		 System.out.println("����");
	 }
	 
	 public void method2() {
		 //Ű����� �Է��� ���ڰ� ¦������ Ȧ������ ���
		 
		 //"���� �Ѱ� �Է��ϼ��� : " �ȳ����� ��� �� num������ ������ ����
		 
		 //¦���� "�Է��Ͻ� ���ڴ� ¦���Դϴ�", Ȧ���� "�Է��Ͻ� ���ڴ� Ȧ���Դϴ�" ���
		 //���α׷��� ���� �� "���α׷� ����"���� ��� �� ���α׷� ����
		 
		 System.out.println("���� �Ѱ� �Է��ϼ��� : ");
		 int num = sc.nextInt();
		 
		 if(num %2 == 0) {
			 System.out.println("�Է��Ͻ� ���ڴ� ¦���Դϴ�");
		 }else {
			 System.out.println("�Է��Ͻ� ���ڴ� Ȧ���Դϴ�");
		 }
		 System.out.println("����");
	 }
	 
	 public void method3() {
		 System.out.println("���� : ");
		 int kor = sc.nextInt();
		 System.out.println("���� : ");
		 int eng = sc.nextInt();
		 System.out.println("���� : ");
		 int mate = sc.nextInt();
		 
		 double aver = (kor+eng+mate)/3;
		 
		 if(kor >= 40 && eng >= 40 && mate >= 40 && aver >=60) {
			 System.out.println("���");
		 }else {
			 System.out.println("�����");
		 } 
	 }
	 
	 public void method4() {
		 System.out.println("�̸� : ");
		 
	 }
	
}

