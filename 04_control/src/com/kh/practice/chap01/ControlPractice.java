package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		switch(num) {
		case 1 :
			System.out.println("1. 입력");
			break;
		case 2 : 
			System.out.println("2. 수정");
			break;
		case 3 :
			System.out.println("3. 조회");
			break;
		case 4 :
			System.out.println("4. 삭제");
			break;
		case 7 :
			System.out.println("프로그램이 종료됩니다.");
			break;
			
		}
		System.out.println("조회메뉴입니다.");
	}
	
	public void practice2() {
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		String i;
		if(num < 0 ) {
			i = "양수만 입력해주세요";
		}else if(num %2 == 0) {
			i = "짝수다";
		}else {
			i = "홀수다";			
		}
		
		System.out.println(i);				
	}
	
	public void practice3() {
		System.out.print("국어점수 : ");
		int ko = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int ma = sc.nextInt();
		System.out.print("영어점수 : ");
		int en = sc.nextInt();
		
		int pl = ko + ma + en;
		double ev = pl/3;
		
		
		if(ko>40 && ma>40 && en>40 && pl >= 60) {
			System.out.println("국어 : " + ko);
			System.out.println("수학 : " + ma);
			System.out.println("영어 : " + en);
			System.out.println("합계 : " + pl);
			System.out.println("평균 : " + ev);
			System.out.println("축하합니다, 합격입니다!");	
		}else {
			System.out.println("불합격입니다.");
		}
	}
	
	public void practice4() {
		System.out.print("1~12 사이의 정수 입력 : ");
		int i = sc.nextInt();
		
		String k = null;
		switch(i) {
//		case 1  :
//			System.out.println(i + "월은 겨울입니다.");
//			break;
//		case 2 :
//			System.out.println(i + "월은 겨울입니다.");
//			break;
//		case 3 :
//			System.out.println(i + "월은 봄입니다.");
//			break;
//		case 4 : 
//			System.out.println(i + "월은 봄입니다.");
//			break;
//		case 5 : 
//			System.out.println(i + "월은 봄입니다.");
//			break;
//		case 6 :
//			System.out.println(i + "월은 여름입니다.");
//			break;
//		case 7 :
//			System.out.println(i + "월은 여름입니다.");
//			break;
//		case 8 :
//			System.out.println(i + "월은 여름입니다.");
//			break;
//		case 9 :
//			System.out.println(i + "월은 가을입니다.");
//			break;
//		case 10 :
//			System.out.println(i + "월은 가을입니다.");
//			break;
//		case 11 :
//			System.out.println(i + "월은 가을입니다.");
//			break;
//		case 12 :
//			System.out.println(i + "월은 겨울입니다.");
//			break;
//			default :
//				System.out.println(i + "월은 잘못 입력된 달입니다.");
		case 1 :
			k = "겨울";
			break;
		case 2 :
			k = "겨울";
			break;
		case 3 :
			k = "봄"; break;
		case 4 :
			k = "봄"; break;
		case 5 :
			k = "봄"; break;
		case 6 :
			k = "여름"; break;
		case 7 :
			k = "여름"; break;
		case 8 :
			k = "여름"; break;
		case 9 :
			k = "가을"; break;
		case 10 :
			k = "가을"; break;
		case 11 :
			k = "가을"; break;
		case 12 :
			k = "겨울"; break;
			
			default : 
				System.out.println(i + "월은 잘못 입력된 달입니다.");
		}
		System.out.println(i + "월은 " + k + "입니다.");
		
	}
	
	public void practice5(){ 
		
		System.out.print("아이디 : ");
		String idd = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String pas = sc.nextLine();
		
		String id = "myId";
		String pa = "myPassword12";
		
		if(id.equals(idd) && pa.equals(pas) ) {
			System.out.println("로그인 성공");
		}else if(!id.equals(idd) && pa.equals(pas)){
			System.out.println("아이디가 틀렸습니다.");
		}else if(id.equals(idd) && !pa.equals(pas)) {
			System.out.println("비밀번호가 틀렸습니다.");
		}
		
	}
	
	public void practice6() {
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String str = sc.nextLine();
		
		String k = null;
		
		switch(str) {
		case "관리자" : 
			k = "회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성";
			break;
			
		case "회원" :
			k = "게시글 작성, 게시글 조회, 댓글 작성";
			break;
			
		case "비회원" :
			k = "게시글 조회";
			break;			
		}
		System.out.println(k);
				
	}
	
	public void practice7() {
		System.out.print("키(m)를 입력해 주세요 : ");
		double m = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double kg = sc.nextDouble();
		
		double mkg = kg/(m*m);
		System.out.println("BMI지수 : " + mkg);
		
		if(mkg < 18.5) {
			System.out.println("저체중");
		}else if(mkg>= 18.5 || mkg < 23) {
			System.out.println("정상체중");
		}else if(mkg>23 || mkg <25) {
			System.out.println("과체중");
		}else if(mkg>25 || mkg >30) {
			System.out.println("비만");
		}else if(mkg>30) {
			System.out.println("고도 비만");
	}
	
	}
	
	public void practice8() {
		System.out.print("피연산자1 입력 : ");
		int p1 = sc.nextInt();
		
		System.out.print("피연산자2 입력 : ");
		int p2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("연산자를 입력(+,_,*,/) : ");
		char pl = sc.nextLine().charAt(0);
		
		int re = 0;
		
		switch(pl) {
			case '+' :
				re = p1 + p2; break;
				
			case '-' :
				re = p1 - p2; break;
				
			case '*' :
				re = p1*p2; break;
				
			case '/' :
				re = p1/p2; break;
		}

		if(p1<0 && p2 < 0) {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}else if(pl != '+' || pl != '-' || pl != '*' || pl != '/') {
			System.out.println("잘못 입력하셨습니다....... 프로그램을 종료합니다.");
		}
	}
	
	public void practice9() {
		System.out.print("중간 고사 점수 : ");
		int mid = sc.nextInt(); 
		System.out.print("기말 고사 점수 : ");
		int fi = sc.nextInt();
		System.out.print("과제 점수 : ");
		int ho = sc.nextInt();
		System.out.print("출석 회수 : ");
		double ch = sc.nextDouble();
		
		double mid2 = mid * 0.2;
		double fi2 = fi * 0.3;
		double ho2 = ho * 0.3;
		double plu = mid2 + fi2 + ho2+ ch;
		
		System.out.println("================= 결과 ================= ");
		System.out.println("중간 고사 점수(20) : " + mid2);
		System.out.println("기말 고사 점수(30)  : " + fi2);
		System.out.println("과제 점수 (30)  : " + ho2);
		System.out.println("출석 점수 (20) : " + ch);
		System.out.println("총점 : " + plu);
		
		if(plu>70) {
			System.out.println("Pass");
		}else if(plu<70) {
			System.out.println("Fall[출석 회수 부족("+ ch + "/20)]");
		}else if(ch<20*0.3) {
			System.out.println("Fall[점수 미달]");
//			점수 미달일 때는 위의 결과값이 안뜨고 점수 미달만 뜨게 하는 방법은????????????????
		}
		
	}
	
	public void practice10() {
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절 ");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		
		System.out.print("선택 : ");
		int i = sc.nextInt();
		
		switch(i) {
		case 1 :
			System.out.print("실습문제 1 실행"); break;
		case 2 :
			System.out.println("실습문제 2 실행"); break;
		case 3 :
			System.out.println("실습문제 3 실행"); break;
		case 4 :
			System.out.println("실습문제 4 실행"); break;
		case 5 :
			System.out.println("실습문제 5 실행"); break;
		case 6 :
			System.out.println("실습문제 6 실행"); break;
		case 7 :
			System.out.println("실습문제 7 실행"); break;
		case 8 :
			System.out.println("실습문제 8 실행"); break;
		case 9 :
			System.out.println("실습문제 9 실행"); break;
		}				
	}
	
	public void practice11() {
		System.out.println("비밀번호 입력(1000~9999) : ");
		String num = sc.nextLine();
		int numIn = Integer.parseInt(num);
		if(num.length() != 4) {
			System.out.println("자리수 안맞음");
		
		} //else if()
	}
}
