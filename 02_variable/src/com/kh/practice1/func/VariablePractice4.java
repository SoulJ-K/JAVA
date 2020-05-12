package com.kh.practice1.func;
import java.util.Scanner;

public class VariablePractice4 {
	public void text( ) {
		Scanner sc = new Scanner(System.in);	
		System.out.print("문자열을 입력하세요 : ");
		
		String word1 = sc.nextLine();
		char word2 = word1.charAt(0);
		System.out.println("첫 번째 문자 : " + word2);
		
		char word3 = word1.charAt(1);
		System.out.println("두 번째 문자 : " + word3);
		
		char word4 = word1.charAt(2);
		System.out.println("세 번째 문자 : " + word4);
		
		
		
	}

}
