package com.kh.practice1.func;
import java.util.Scanner;

public class Variablepractice3 {
	public void square( ) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		double width = sc.nextDouble();
		
		System.out.print("���� : ");
		double length = sc.nextDouble();
		
		double area = width*length;
		System.out.println("���� : " + area);
		
		double circumference = (width+length)*2;
		System.out.println("�ѷ� : " + circumference);
		
	}

}
