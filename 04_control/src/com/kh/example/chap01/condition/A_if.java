package com.kh.example.chap01.condition;

import java.util.Scanner;

public class A_if {
	/*
	 *  �ܵ� if��
	 *  if(���ǽ�){
	 *  ������ ����;}
	 *  
	 *  ���ǽ��� ������� ��(true)�̸� {} �ȿ� �ִ� �ڵ� ����
	 *  ���ǽ��� ������� ����(false)�̸� {}�ȿ� �ִ� �ڵ�� �����ϰ� �Ѿ	 *  
    */
 public void method1() {
	 //Ű����� �Է��� ���ڰ� ������� �������� ����Ͻÿ�
	 // "���ڸ� �� �� �Է��ϼ���: " �ȳ���Ʈ ��� �� num ������ �Է��� ���� ����
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("���ڸ� �� �� �Է��ϼ���: ");
	 int num = sc.nextInt();
	
	 if (num > 0) {
		 System.out.println("����Դϴ�");
	 }
	 
	 if (num == 0) {
		 System.out.println("0�Դϴ�.");
	 }
	 
	 if(num < 0) {
		 System.out.println("�����Դϴ�");
	 }
	 
	 System.out.println("���α׷� ����");
	 	 
 }
 public void method2() {
	 //Ű����� �Է��� ���ڰ� ¦������ Ȧ������ ���
	 
	 //"���� �Ѱ� �Է��ϼ��� : " �ȳ����� ��� �� num������ ������ ����
	 
	 //¦���� "�Է��Ͻ� ���ڴ� ¦���Դϴ�", Ȧ���� "�Է��Ͻ� ���ڴ� Ȧ���Դϴ�" ���
	 //���α׷��� ���� �� "���α׷� ����"���� ��� �� ���α׷� ����
	 
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("���� �Ѱ� �Է��ϼ��� : ");
	 int num = sc.nextInt();
	 
	 if(num % 2 == 0) {
		 System.out.println("¦���Դϴ�");
	 }
	 
	 if(num % 2 != 0) {
		 System.out.println("Ȧ���Դϴ�");
	 }
	 
	 System.out.println("���α׷� ����");
	 
	 }
 }
