package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	String str = "양수입니다";
	
	//삼항연산자 문제였음
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
//		sc.nextLine();
		String re = num > 0 ? str : "양수가 아닙니다";
		System.out.println(re);
//		System.out.println(num > 0 ? "양수입니다" : "양수가 아닙니다");
	
		
	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int nu = sc.nextInt();
		String ree = nu > 0 ? str : (nu == 0 ? "0입니다" : "음수입니다");
		System.out.println(ree);		
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int two = sc.nextInt();
		String res = two %2 == 0 ?  "짝수입니다" : "홀수입니다";
		System.out.println(res);		
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수 : ");
		int pe = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		
		System.out.println("1인당 사탕 개수  : " + (candy/pe));
		System.out.println("남는 사탕 개수  : " + (candy%pe));
				
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년 (숫자만): ");
		int grade = sc.nextInt();
		sc.nextLine();
		
		System.out.print("반(숫자만) : ");
		int cl = sc.nextInt();
		sc.nextLine();
		
		System.out.print("번호(숫자만) : ");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.print("성별(M/F): ");
		String user = sc.nextLine();
		char ge = user.charAt(0);
		String gender = ge == 'M' ? "남학생" : "여학생";
		
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double gr = sc.nextDouble();
		sc.nextLine();
		
		//int & float 사용시 콘솔창에 빨간 경고 뜸
		//float & double 사용시 소수점 네자리까지 나옴
		System.out.printf("%d학년 %d반  %d번 %s %s의 성적은 %g이다.",grade,cl,number,name,gender,gr );		
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		String ag = age < 13 ? "어린이" : (age>13 && age <= 19 ? "청소년" : "성인");
		
		System.out.println(ag);		
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 :");
		int ko = sc.nextInt();
		
		System.out.print("영어 :");
		int en = sc.nextInt();
		
		System.out.print("수학 :");
		int ma = sc.nextInt();
		
		int pl = ko + en + ma;
		
		double ev = pl/3;
		
		System.out.println(pl);
		System.out.println(ev);
		
		String sr = ko >=40 && en >= 40 && ma >= 40 && ev >= 60 ? "합격" : "불합격";
		
		System.out.println(sr);	
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		String pe = sc.nextLine();
//		char rs = pe.charAt(6);
		String se = pe.charAt(7) == '2'? "여자" : "남자";
		System.out.println(se);
		
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력 : ");
		int num3 = sc.nextInt();
		
		boolean tr = (num3 <= num1 || num3 > num2);
		
		System.out.println(tr);
		
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();

		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
		boolean err = (num1 ==num2 && num3== num2 && num1== num3);
		System.out.println(err);
		
	}
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("A사원의 연봉 : ");
		int num1 = sc.nextInt();
		
//		System.out.print("B사원의 연봉 : ");
//		int num2 = sc.nextInt();
//		
//		System.out.print("C사원의 연봉 : ");
//		int num3 = sc.nextInt();
		
		double a = num1 * 0.4;
//		double b = num2 + 0;
//		double c = num3 * 0.15;
		
		
		String aa = a > 3000 ? "3000이상" : "3000미만";
//		String bb = b> 3000  ? "3000이상" : "3000미만";
//		String cc = c > 3000 ? "3000이상" : "3000미만";
//		
		System.out.printf("A사원의 연봉 / 연봉+a : %d/%g", num1 , (num1+a));
//		1. 3500.00으로 나옴. 소수점 한자리는 대체 어떻게 하는가...
		System.out.println();
		System.out.println(aa);
		
//		System.out.printf("B사원의 연봉 / 연봉+a : %d/%d.00", num2 , num2);
//		System.out.println(bb);
//		
//		System.out.printf("C사원의 연봉 / 연봉+a : %d/%g", num3 , (num3+c));
//		System.out.println(cc);
	
}
}