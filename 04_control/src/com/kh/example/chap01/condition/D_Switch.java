package com.kh.example.chap01.condition;

import java.util.Scanner;

public class D_Switch {
	//조건식의 결과값을 case에서 찾아 명령을 수행하는 조건문
	//해당하는 값이 case에 없을 경우에는 default의 명령문 수행
	
	//case와 수행문 사이에는 콜론(:)을 써야하며
	//break가 없으면 멈추지 않고 계속 수행함
	
	public void method1() {
		//정수 두 개와 연산기호 문자 1개를  입력받아서 
		//연산기호문자에 해당하는 계산을 수행하고 출력하세요
		/*
		 첫 번째값 : 
		 두 번째값 :
		 연산자(+,-,*,/) :
		 	 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째값 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째값 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("연산자(+,-,*,/) : ");
		char num3 = sc.nextLine().charAt(0);
//		java.lang.StringIndexOutOfBoundsException: String index out of range: 0
//		위에 nextInt로 줄바꿈을 가져오지 않아 줄바꿈이 남아있는 상태에서 마지막 연산자에서 nextLine에서 줄바꿈을 모두 가져왔다
//		그 상태에서 charAt으로 0번째 글자를 가져오는 명령을 내리지만 줄바꿈만 있는 상태이고 정보가 없는 상태이기에 오류가 뜸
		
		int result = 0; //연산결과 저장용 변수
		
		switch(num3) {
		case '+' :
			result = num1 + num2;
			break;
			
		case '-':
			result = num1-num2;
			break;
			
		case '*':
			result = num1*num2;
			break;
			
		case '/':
			result = num1/num2;
	
		}
		
		System.out.println(num1 + " + " + num2 + " = " + result);
						
	}
	
	public void method2() {
		// 과일을 입력하여 사과는 1000, 바나나는 3000, 복숭아는 2000, 키위는 5000
		// 과일가게에 없는 고일을 입력했을 때는 "잘못입력하였습니다." 출력
		// 과일 이름을 입력하시오 :
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("과일 이름을 입력하시오 : ");
		String fu = sc.nextLine();
		
		int price = 0;
		switch(fu) {
		case "사과" :
			price = 1000;
			break;
			
		case "바나나" :
			price = 3000;
			break;
			
		case "복숭아" :
			price = 2000;
			break;
			
		case "키위" :
			price = 5000;
			break;
			
			default :
				System.out.println("잘못입력하였습니다.");
				return;
				// break는 switch문 안에서 나감
				// return은 나를 호출한 method에게 돌아가는 기능
				// 이 때 값을 가지고 돌아가거나 아무것도 없이 갈 수 있음
				// 이 경우에는 밑에 있는 값을 버리고 나를 호출한 메소드에게 돌아감.
				
					
		}
		
		System.out.println(fu + "의 가격은 " + price + "원입니다.");
				
	}
	
	public void method3() {
		//사용자가 입력한 메뉴 번호에 따라서 메뉴가 출력되게 하시오
		/*
		  1. 회원 등록
		  2. 회원 수정
		  3. 회원 삭제
		  메뉴 번호를 입력하세요 : 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 회원 등록");		
	
		System.out.println("2. 회원 수정");
		
		
		System.out.println("3. 회원 삭제");
		
		System.out.println("메뉴 번호를 입력하세요 : ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1 :
			System.out.println("회원등록 메뉴입니다.");
			break;
		case 2 :
			System.out.println("회원수정메뉴입니다");
			break;
		case 3 :
			System.out.println("회원삭제메뉴입니다");
			break;
			default:
				System.out.println("잘못입력하셨습니다");
		}
	}
		public void method4() {
			//1월부터 12월까지 입력 받아 해당하는 달의 마지막 날짜를 출력하세요
			Scanner scr = new Scanner(System.in);
			System.out.print("1월~12월까지 중 하나를 입력하세요 : ");
			int num = scr.nextInt();
			int date = 0;
			
			switch(num) {
				case 1 : case 3 : case 5 : case 7 : case 9 : case 11 : 
					System.out.println("입력하신 달은 31일까지 입니다.");
					break;
				case 4 : case 6 : case 8 : case 10 : case 12 :
					System.out.println("입력하신 달은 30일까지 입니다.");
					break;
					
				case 2 : 
					System.out.println("입력하신 달은 28일 혹은 29일까지 입니다.");
					break;
					default :
						System.out.println("반드시 1~12 사이의 숫자를 입력해주세요.");
			
			}
	
			
		}
}