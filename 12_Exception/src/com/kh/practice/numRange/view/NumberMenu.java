package com.kh.practice.numRange.view;

import java.util.Scanner;

import com.kh.practice.numRange.controller.NumberController;
import com.kh.practice.numRange.exception.NumRangeException;

public class NumberMenu {
	public void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� 1 : ");
		int num1 = sc.nextInt();
		
		
		System.out.println("���� 2 : ");
		int num2 = sc.nextInt();
		
		System.out.println(num1 + "��(��) " + num2 + "�� ����ΰ�?");
		
		NumberController nc = new NumberController();
		
		try {
			nc.checkDouble(num1, num2);
		} catch (NumRangeException e) {
			e.printStackTrace();
		}
		
	}
	

}
