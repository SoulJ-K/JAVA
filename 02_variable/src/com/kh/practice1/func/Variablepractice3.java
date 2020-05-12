package com.kh.practice1.func;
import java.util.Scanner;

public class Variablepractice3 {
	public void square( ) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 : ");
		double width = sc.nextDouble();
		
		System.out.print("세로 : ");
		double length = sc.nextDouble();
		
		double area = width*length;
		System.out.println("면적 : " + area);
		
		double circumference = (width+length)*2;
		System.out.println("둘레 : " + circumference);
		
	}

}
