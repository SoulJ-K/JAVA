package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	public void method1() {
		//&& : 연산자가 모두 true일 때 true라고 결과가 나옴. (그리고, ~서 의 and의 뜻)
		//|| : 연산자 중에서 하나라도 true 일 때 true라고 결과가 나옴 (또는, ~거나의 or의 뜻)
		
		//입력한 값이 1~100 사이의 숫자인지 확인하자
		//정수 하나 입력 ;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 :");
		int num = sc.nextInt();
		
		//1~100사이의 숫자
		//숫자가 1	보다 크거나 같고 100보다 작거나 같다
		
		System.out.println("1부터 100사이의 숫자인지 확인 : " + (num>=1 && num<=100));
		
	}
	public void method2() {
		//입력한 문자 값이 대문자인지 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 하나 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		boolean isCap = (ch >= 'A' && ch <= 'Z');
		System.out.println("영어 대문자가 맞습니까? " + isCap);
		
		//계속 하시려면 y 혹은 Y를 입력하세요 : 
		//계속 하시겠다고 하셨습니까?
		
		System.out.print("계속 하시려면 y 혹은 Y를 입력하세요 : ");
		char ch2 = sc.nextLine().charAt(0);
		System.out.println("계속 하겠다고 하셨습니까? " + (ch2=='y' || ch2=='Y'));

	}

}
