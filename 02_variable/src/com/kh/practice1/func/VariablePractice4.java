package com.kh.practice1.func;
import java.util.Scanner;

public class VariablePractice4 {
	public void text( ) {
		Scanner sc = new Scanner(System.in);	
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		
		String word1 = sc.nextLine();
		char word2 = word1.charAt(0);
		System.out.println("ù ��° ���� : " + word2);
		
		char word3 = word1.charAt(1);
		System.out.println("�� ��° ���� : " + word3);
		
		char word4 = word1.charAt(2);
		System.out.println("�� ��° ���� : " + word4);
		
		
		
	}

}
