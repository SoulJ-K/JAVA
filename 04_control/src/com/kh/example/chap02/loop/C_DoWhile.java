package com.kh.example.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {
	public void method1() {
		//키보드로 문자열 값을 입력 받아 출력 반복 실행
		//단, exit가 들어오면 반복 종료
		/*
		 문자열 입력 : 안녕하세요
		 str : 안녕하세요
		 문자열 입력 : apple
		 str : apple
		 문자열 입력 : exit
		 str : exit
		 */
		
		Scanner sc = new Scanner(System.in);
		
		//1.while
//		String str = null;
		//null  아무것도 아닌 값
		//Exception in thread "main" java.lang.NullPointerException
		//null(아무것도 없는 값)인 상태에서 exit와 같지 않은지 비교하라고 명령내려서 나온 오류
//		String str = "";	
//		while(!str.equals("exit")) {
//		System.out.print(" 문자열 입력 : ");
//		str = sc.nextLine();
//		System.out.println("str : " + str);
//	}
		
		//2. do~ while
//		String str = "";
		String str = null;
		// do 문으로 인해 한번은 실행이 되서 str안에 입력한 값이 들어감
		//그래서 문제 없이 반복될 수 있음
		do {
			System.out.print("문자열 입력 : ");
			str=sc.nextLine();
			System.out.println("str : " + str);
		} while(!str.equals("exit"));
		
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		int menuNum = 0;
		do {
			System.out.println("1.테스트 1");
			System.out.println("2.테스트 2");
			System.out.println("3. 테스트 3");
			System.out.println("9. 종료");
			System.out.print("메뉴선택 : ");
			menuNum = sc.nextInt();
			
			switch(menuNum){
				case 1 : System.out.println(1); break;
				case 2 : System.out.println(2); break;
				case 3 : System.out.println(3); break;
				case 9 : System.out.println("종료합니다"); break;
				default : System.out.println("잘못 입력하셨습니다");
				}
		}while(menuNum != 9);
		
		} 
	
	}
