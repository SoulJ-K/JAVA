package com.kh.practice2.func;
import java.util.Scanner;

public class CastingPractice1 {
	public void uni() {
		Scanner sc = new Scanner(System.in);		
		System.out.print("���� : ");
		String str = sc.nextLine();
		char str1 = str.charAt(0);
		//char�� ����Ϸ��� ������ �̹�����ΰ�?
		//�ٷ� char ch = sc.next(); �� �� �ȵǴ°ǰ�
		
		int num = str1;
		System.out.println(str1+" unicode : " + num);
		sc. nextLine();
		
		System.out.print("����: ");
		String st = sc.nextLine();
		char st1 = st.charAt(0);
		
		int num2 = st1;
		System.out.print(st1 + " unicode : " + num2);
		
	}
}