package com.kh.practice2.func;
import java.util.Scanner;

public class CastingPractice2 {
	public void average() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		double ko = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("���� : ");
		double en = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("���� : ");
		double ma = sc.nextDouble();
		
		int pl = (int)(ko + en + ma);
		System.out.println("���� : " + pl);
		
		int av = pl/3;
		//������ ���� 3���� �������� �ʰ� �ڵ����� �ٲٴ� ������?
		System.out.println("��� : " + av);
	}

}