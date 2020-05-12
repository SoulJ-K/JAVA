package com.kh.example.chap02.loop;

import java.util.Scanner;

public class B_While {
	/*
	  while(조건식){
	  	실행문장;
	  	[증감식 or 분기문;]
	  }
	  
	  	조건식 확인 -> (조건식 true일때) 실행 문장 수행 -> 조건식 확인 -> 반복
	  	조건식 결과가 false가 될 때 까지 반복
	  
	  */
	public void method1() {
		//1~5까지 출력
		
		int i = 1;
		while(i<6) {
			System.out.println(i + "번째 반복문 수행");
			i++;
			//i++이 프린트 문 위에 있으면 i++이 먼저 수행됨.
			}
		}
	
	public void method1_1() {
	//자기소개 5번 : 내 이름은 김솔지야
		int i = 1;
		while(i < 6) {
			System.out.println("내 이름은 김솔지야");
			i++;
		}
	}
	
	public void method2() {
//		5~1까지
		int i = 5;
		while(i>=1) {
			System.out.println(i);
			i--;
		}
	}
	
	public void method3( ) {
		//1~10사이에 홀수만 출력
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			i+=2;
		}
	}
	
	public void method4() {
		//정수 두 개를 입력받아 그 사이 숫자 출력
		
		//정수 두 개를 입력하세요.
		//단, 첫번째 숫자가 두번째 숫자보다 작게 입력해주세요.
		//첫번째 숫자:
		//두번째 숫자:
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 두 개를 입력하세요.");
		System.out.println("단, 첫번째 숫자가 두번째 숫자보다 작게 입력해주세요.");
		System.out.print("첫번째 숫자: ");
		int i = sc.nextInt();
		
		System.out.print("두번째 숫자: ");
		int j = sc.nextInt();		
		
		int max = 0;
		int min = 0;
		if(i>j) {
			max = i;
			min = j;
		}else {
			max = j;
			min = i;
		}
		
		while(min <= max) {
			System.out.println(min);
			min++;
		}
	}
	
	public void method4_1() {
		//정수 하나를 입력받아 그 수가 1~9 사이의 수 일때만 그 수의 구구단 출력
		//조건이 맞지 않으면 1~9사이의 양수를 입력하여야합니다. 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int i = sc.nextInt();
		
		if(i >= 1 && i<=9) {
			int j = 1;
			while(j<10) {
				System.out.printf("%d * %d = %d%n", i, j, (i*j));
				j++;
			}
		}else {
			System.out.println("1~9사이의 양수를 입력하여야합니다.");
			
			}
//if문으로만 만드는 방법은?
//		if(i<1 || i >9) {
//			S
//		}
			
		}
		
	public void method5() {
		//1부터 10사이의 임의의 난수를 정해 1부터 난수까지의 정수 합계 출력
		
		int random = (int)(Math.random() * 10 + 1);
		
		int sum = 0;
		int i = 1;
		
		while(i <=random) {
			sum += i;
			i++;
		}
		
		System.out.printf("1부터 %d까지의 정수 합계 : %d", random, sum);
	}
	
	public void method6() {
		//사용자에게 문자열을 입력받아 인덱스별로 문자 출력
		//문자열 입력 : apple
		//0: a
		//1 : p
		//2 : p
		//3 : l
		//4 : e
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력 : ");
		String word = sc.nextLine();
		
		int length = word.length();
		//문자열의 길이를 반환하는 메소드 : length()
		System.out.println(word + "의 길이 : " + length);
		
//		//for
//		for(int i = 0; i < length; i++) {
//			//for(int i = 0; i < word.length(); i++){
//			//똑같음
//			char ch = word.charAt(i);
//			System.out.println(i + " : " + ch);
//			//글자수를 5개로 정해놔서 5개밖에 출력이 안됨
//		}
		
		//while
		
		int i = 0;
		while(i <= word.length()) {
			char ch = word.charAt(i);
			System.out.println(i + " : " + ch);
			i++;
		}
	}
	
	public void method7() {
		//2단부터 9단까지 출력
		
//		for(int i = 2; i<10; i++) {
//			for(int j = 1; j<10; j++) {
//				System.out.printf("%d * %d = %d%n",i,j,(i*j));
//			}
//		}
		
		int i = 2;
		while(i<=9) {
			int j = 1;
			while(j <10) {
			System.out.printf("%d * %d = %d%n",i,j,(i*j));
			j++;
		}
			i++;
			System.out.println();			
		}
		
	}
	
	public void method8() {
		//아날로그 시계
		int i =0;
		while(i<24) {
			int j = 0;
			while(j<60) {
//				System.out.println(i + "시" + j + "분"); 
				System.out.printf("%d시 %d분%n",i,j); 
				//한자리 수와 두자리 수를 맞추고 싶을 때는 2d로 바꿈
				//%2d는 정수 2자리를 확보하겠다는 의미
				//오른쪽 정렬로 표시됨(기호를 넣지 않는 이상)
				//왼쪽 정렬은 - 를 넣으면 됨
				//printf("%2d시 %-2d분%n",i,j)
				j++;
			}
			i++;
			System.out.println();
		}
	}
	
	public void method9() {
		Scanner sc = new Scanner(System.in);
		
		int menuNum = 0;
		//while을 통해서 반복
		while(menuNum !=9) {
			System.out.println("1. 1~5까지 출력");
			System.out.println("2. 5~1까지 출력");
			System.out.println("3. 1~10사이 홀수 출력");
			System.out.println("9. 종료");
			System.out.print("메뉴선택 : ");
			menuNum = sc.nextInt();
			
			switch(menuNum) {
				case 1 : method1(); break;
				case 2 : method2(); break;
				case 3 : method3(); break;
				case 9 : System.out.println("종료합니다"); break;
				default : System.out.println("잘못입력하셨습니다.");
				}
			System.out.println();
		}
		
	}
	
	
	}

