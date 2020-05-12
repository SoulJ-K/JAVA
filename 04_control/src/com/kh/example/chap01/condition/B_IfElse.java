package com.kh.example.chap01.condition;

import java.util.Scanner;

public class B_IfElse {
	//if-else문
	//if(조건식){
	//실행할 문장1;
	//} else {
	//실행할 문장2;
	//}
	//둘 중 한개를 선택하는 조건문
	//조건식 결과 값이 참이면 if문 안에 있는 실행할 문장 1 수행
	//조건식 결과 값이 거짓이면 if문 빠져나와 else문 안에 있는 실행할 문장 2 수행
	
	
		
	public void method1() {
		//키보드로 입력한 숫자가 짝수인지 홀수인지 출력
		 
		 //"숫자 한개 입력하세요 : " 안내문구 출력 후 num변수에 데이터 저장
		 
		 //짝수면 "입력하신 숫자는 짝수입니다", 홀수면 "입력하신 숫자는 홀수입니다" 출력
		 //프로그램이 끝날 때 "프로그램 종료"까지 출력 후 프로그램 종료
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 한개 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("입력하신 숫자는 짝수입니다");
		} else {
			System.out.println("입력하신 숫자는 홀수입니다");
		}
		System.out.println("프로그램 종료");
		
		}
	
	public void method2() {
		//사용자에게 국어, 영어, 수학 점수를 입력 받아서 각각 kor, eng, mate 변수에 저장
		//각 과목 점수가 40점 이상이고 세 과목 평군점수가 60점 이상일 때 "시험통과"
		//하나라도 기준 미달일 때 "시험 불통과" 출력
		
		Scanner sca = new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요 : ");
		int kor = sca.nextInt();
		sca.nextLine();
		
		System.out.print("영어 점수를 입력하세요 : ");
		int eng = sca.nextInt();
		sca.nextLine();
		
		System.out.print("수학점수를 입력하세요 : ");
		int math = sca.nextInt();
		sca.nextLine();
		
		double avg = (kor + eng + math) / 3.0;
		
		if (kor >= 40 && eng >=40 && math >= 40 && avg >= 60) {
			System.out.println("시험통과");
			} else {
				System.out.println("시험불통과");
			}
		}
	public void method3() {
		//문자열 비교하기
		//사용자에게 이름을 받는데 내가 지정한 이름과 같으면 "본인입니다"
		//같지 않으면 "본인이 아닙니다" 출력
		//String에서는 ==으로 값을 비교할 수 없음
		//문자열 비교는 String class 안에 있는 equals() method 사용
		Scanner scr = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = scr.nextLine();
		
		if(name.contentEquals("박신우")) {
			System.out.println("본인입니다.");
		} else {
			System.out.println("본인이 아닙니다");
			}
		
		
		
	}
	

}
