package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {
	Scanner sc = new Scanner(System.in);
	
	 public void practice1(){
		 int[] num = new int[10];
		 for(int i = 0; i<10; i++) {
			num[i] = i+1; 
		 }

		 for(int i =0; i < num.length; i++) {
			 System.out.print(num[i] + " ");
			 
		 }System.out.println();
	 }

	 
	 public void practice2() {
		 int num[] = new int[10];
		 
		 for(int i = 0; i < 10; i++) {
			 num[i] = 10-i;
		 }
		 for(int i = 0; i < num.length; i++) {
			 System.out.print(num[i] + " ");
			 
		 }System.out.println();
	 
	 }
	 
	 public void practice3(){
		 System.out.print("양의 정수 : ");
		 int num = sc.nextInt();
		 
		 int[] ran = new int[num+1]; 
		 for(int i = 1; i < ran.length; i++) {
			
			 System.out.print(i + " ");
		 }
		}
	 
	 public void practice4(){
		 String[] fr = new String[5];
		 
		 fr[0] = "사과";
		 fr[1] = "귤";
		 fr[2] = "포도";
		 fr[3] = "복숭아";
		 fr[4] = "참외";
		 
		 System.out.println(fr[1]);
	 }
	 
//	 public void practice5(){
//		 System.out.print("문자열 : ");
//		 String word = sc.nextLine();
//		 char[] chArr = new char[word.length()]; 
//		 
//		 for(int i = 0; i <= word.length() ; i++) {
//			 chArr[i] = word.charAt(i);
//		 }
//			 System.out.println("문자 : ");
//			 char ch = sc.nextLine().charAt(0);
//			 System.out.println(word + "에 " + ch + "가 존재하는 위치(인덱스) : ");
//			 for(int i = 0; i < word.length(); i++) {
//				 if(chArr[i] == ch) {
//					 System.out.println((i) + " ");
//				 }
//		 }
//			 }
	 
	 public void practice6() {
		 System.out.print("0 ~ 6 사이 숫자 입력 : ");
		 int i = sc.nextInt();
		 
		 if(i<0 || i >=7) {
			 System.out.println("잘못 입력하셨습니다.");
		 }else {
		 String[] day = new String[7];
		 
		 day[0] = "월요일";
		 day[1] = "화요일";
		 day[2] = "수요일";
		 day[3] = "목요일";
		 day[4] = "금요일";
		 day[5] = "토요일";
		 day[6] = "일요일";
		
		 System.out.println(day[i]);
		 }
	 }
	 
//	 public void practice7(){
//		 System.out.print("정수 : ");
//		 int num = sc.nextInt();
//		 
//		 int[] kk = new int[num];
//		 
//		 for(int i = 0; i<num; i++) {
//			 System.out.print("배열" + i + "번째 인덱스에 넣을 값 :");
//			 kk[i] = sc.nextInt();
//		 }
		 
//	//		
//		 int in = new int[a];
//		 System.out.print("배열" + (i-(i) + "번째 인덱스에 넣을 값 :");
//	 }
	 
//	 public void practice8(){
//		 while
//		 System.out.print("정수 : ");
//		 int i = sc.nextInt();
//		 
//		 if(i %2 == 0 || i <3) {
//			 System.out.print("다시 입력하세요.");
//		 }
//	 }
 }

