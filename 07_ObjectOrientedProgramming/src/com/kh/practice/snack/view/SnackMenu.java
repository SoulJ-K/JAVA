package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {
	Scanner sc = new Scanner(System.in);
	
	SnackController scr = new SnackController() ;
	
	public void menu() {
		System.out.println("�������� �Է��ϼ���.");
		System.out.print("���� : ");
		String kind = sc.nextLine();
//		scr.
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("�� : ");
		String flavor = sc.nextLine();
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		System.out.print("���� : ");
		int price = sc.nextInt();
		
		sc.nextLine();
		
		String result = scr.saveData(kind, name, flavor, num, price);
		System.out.println(result);
		
		System.out.print("������ ������ Ȯ���Ͻðڽ��ϱ�? (y/n) : ");
		char answer = sc.nextLine().charAt(0);
		
		String re = scr.confirmData();
		if(answer == 'y') {
			System.out.println(re);
		}
	}
}