package com.kh.practice2.func;
import java.util.Scanner;

public class CastingPractice1 {
	public void uni() {
		Scanner sc = new Scanner(System.in);		
		System.out.print("문자 : ");
		String str = sc.nextLine();
		char str1 = str.charAt(0);
		//char를 사용하려면 무조건 이방법뿐인가?
		//바로 char ch = sc.next(); 는 왜 안되는건가
		
		int num = str1;
		System.out.println(str1+" unicode : " + num);
		sc. nextLine();
		
		System.out.print("문자: ");
		String st = sc.nextLine();
		char st1 = st.charAt(0);
		
		int num2 = st1;
		System.out.print(st1 + " unicode : " + num2);
		
	}
}