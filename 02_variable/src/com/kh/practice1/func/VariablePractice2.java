package com.kh.practice1.func;
import java.util.Scanner;

public class VariablePractice2 {
	public void plus() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° ���� : ");
		//sc.nextLine();
		int num2 = sc.nextInt();
		
		int num3 = num1+num2;
		System.out.println("���ϱ� ��� : " + num3);
	
		int num4 = num1-num2;
		System.out.println("���� ��� : " + num4);
		
		int num5 = num1*num2;
		System.out.println("���ϱ� ��� :" + num5);
		
		int num6 = num1/num2;
		System.out.println("������ ��� :" + num6);
		
	}

}
