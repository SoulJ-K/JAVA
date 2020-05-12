package com.kh.example.chap01.condition;

import java.util.Scanner;

public class C_IfElseIf {
	//if-else if문
	//if(조건식1){
	//	실행할 문장1;
	//} else if(조건식2){
	//	실행할 문장2;
	//} else if(조건식3){
	//	실행할 문장3;
	//} else{
	//	실행하 문장4;
	//}
	//다중 조건을 줄 수 있는 조건문
	//조건식 1이 참이면 실행할 문장1 수행
	//조건식 2가 참이면 실행할 문장2 수행
	//조건식 3이 참이면 실행할 문장3 수행
	//아무조건도 참이 아니면 실행할 문장 4 수행
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		String result;
		if(num > 0) {
			result = "양수다";
		} else if(num == 0) {
			result = "0이다";
		} else {
			result = "음수다";
		}
		System.out.println(result);
	}
	public void method2() {
		//나이를 입력받아 13살 이하면 "어린이", 13살 초과 19살 이하면 "청소년", 19살 초과하면 "성인"
		Scanner scr = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = scr.nextInt();
		
		if(age <= 13) {
			System.out.println("어린이");
		} else if(age > 19) {
			System.out.println("성인");
		} else {
			System.out.println("청소년");
			
		}
		
		
	}

}
