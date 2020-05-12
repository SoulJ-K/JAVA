package dffdf;

import java.util.Scanner;

public class ddd {
	Scanner sc = new Scanner(System.in);
		
	 public void method1() {
		 //키보드로 입력한 숫자가 양수인지 음수인지 출력하시오
		 // "숫자를 한 개 입력하세요: " 안내멘트 띄운 후 num 변수에 입력한 정수 저장
		 
		 System.out.print("숫자를 한 개 입력하세요: ");
		 int num = sc.nextInt();
		 
		 if(num > 0) {
			 System.out.println("양수");
		 }
		 
		 if(num < 0) {
			 System.out.println("음수");
		 }
		 
		 if(num == 0) {
			 System.out.println("0");
		 }
		 System.out.println("종료");
	 }
	 
	 public void method2() {
		 //키보드로 입력한 숫자가 짝수인지 홀수인지 출력
		 
		 //"숫자 한개 입력하세요 : " 안내문구 출력 후 num변수에 데이터 저장
		 
		 //짝수면 "입력하신 숫자는 짝수입니다", 홀수면 "입력하신 숫자는 홀수입니다" 출력
		 //프로그램이 끝날 때 "프로그램 종료"까지 출력 후 프로그램 종료
		 
		 System.out.println("숫자 한개 입력하세요 : ");
		 int num = sc.nextInt();
		 
		 if(num %2 == 0) {
			 System.out.println("입력하신 숫자는 짝수입니다");
		 }else {
			 System.out.println("입력하신 숫자는 홀수입니다");
		 }
		 System.out.println("종료");
	 }
	 
	 public void method3() {
		 System.out.println("국어 : ");
		 int kor = sc.nextInt();
		 System.out.println("영어 : ");
		 int eng = sc.nextInt();
		 System.out.println("수학 : ");
		 int mate = sc.nextInt();
		 
		 double aver = (kor+eng+mate)/3;
		 
		 if(kor >= 40 && eng >= 40 && mate >= 40 && aver >=60) {
			 System.out.println("통과");
		 }else {
			 System.out.println("불통과");
		 } 
	 }
	 
	 public void method4() {
		 System.out.println("이름 : ");
		 
	 }
	
}

