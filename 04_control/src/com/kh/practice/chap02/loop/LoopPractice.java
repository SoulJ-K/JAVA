package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	private static final String i = null;
	Scanner sc = new Scanner(System.in);
	
	public void  practice1(){
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int i = sc.nextInt();
		
		if(i>=1) {
			for(int j = 1; j<=i; j++) {
				System.out.print(j+" ");
			}
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}
	
	public void practice2() {
//		System.out.print("1이상의 숫자를 입력하세요 : ");	
		int i = 0;
		
		while(i<1) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			i = sc.nextInt();
			
			if(i>=1) {
				for(int j = 1; j <=i; j++) {
					System.out.print(j+" ");
					}
				}else if(i < 1) {
					System.out.println("1 이상의 숫자를 입력해주세요.");
					continue;
				}
			}
		}
	
	public void practice3() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int i = sc.nextInt();
		
		if(i>=1) {
			for(int j = 1; j<=i; i--) {
				System.out.print(i + " ");
			}
		}else {
			System.out.println("1이상의 숫자를 입력하세요 : ");
		}
	}
	
	public void practice4() { 
		int i = 0;
		
		while(i<0) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			i = sc.nextInt();
			
			if(i>=1) {
				for(int j = 1; j<=i; i--) {
					System.out.print(i + " ");
				}
			}else if(i<1){
				System.out.println("1이상의 숫자를 입력하세요.");
				continue;
			}	
		}
	}

	
	public void practice5() {
		System.out.print("정수를 하나 입력하세요 : ");
		int i = sc.nextInt();
		int sum = 0;
		int j = 1;
		
//		for(int j = 1; j<=i; j++) {
//			System.out.print(sum+=j);
//		}
		while(j<=i) {
			sum+=j;
			j++;
		}
		System.out.print(sum);
		//1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36 
		//이렇게 나오게 하는 방법은? 36만 나옴
	}
	
	public void practice6() {
		System.out.print("첫 번째 숫자 :");
		int start = sc.nextInt();
		
		System.out.print("두 번째 숫자 :");
		int end = sc.nextInt();
		
	
		if(start<=0 || end <= 0) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			
		}else if(start > end){
			
			for(int i = end; i<= start; i++) {
				System.out.println(i + " ");
			}
			
		}else if(start < end){
			for(int i = start; i<= end; i++) {
				System.out.println(i + " ");
				}
			}
		}

	
	public void practice7() {
		
		int num1 = 0;
		int num2 = 0;
		while(num1 <= 0 || num2 <= 0) {
			System.out.print("첫 번째 숫자 :");
			num1 = sc.nextInt();
			
			System.out.print("두 번째 숫자 :");
			num2 = sc.nextInt();
			
			if(num1 == 0 || num2 == 0) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				
				}else if(num1>num2) {
						for(int k = num2; k<=num1; k++){
							System.out.print(k + " ");
						}	
				}else if(num1<num2) {
				for(int i = num1; i<=num2; i++) {
					System.out.print(i + " ");
				}
			}
	}
	}
	
	 public void practice8(){
		 int k = sc.nextInt();
		 System.out.println("==== " + k + "단 =====");
		 
		 for(int j = 1; j <= k; j++) {
			 System.out.println(k + '*' + j + " = " + (k*j));
		 }
	 }
	 
	 public void practice9(){
		 System.out.print("숫자 : ");
		 int i = sc.nextInt();
		 
		 if(i<=9) {
			 for(int j = 1; j <=9; j++) {
				 System.out.println("====" + j + "단" + "=====");
			 for(int k = 1; k <=9; k++) {
				 System.out.printf("%d * %d = %d%n", j, k, (j*k));
			 }
			 System.out.println();
			 }
		 }else {
			 System.out.println("9 이하의 숫자만 입력해주세요.");
		 }
	 }
	 
	 public void practice10() {
		 int k = 0;
		 
		 while(k > 9) {
			 System.out.println("숫자 : ");
			 k = sc.nextInt();
			 
		 if(k <= 9) {
			 for(int j = 1; j <= 9; j++) {
				 System.out.println("====" + j + "단 ====");
				 for(int d = 1; d <= 9; d++) {
					 System.out.println(k + " * " + d + " = " + (k*d));
				 }
				 }
		 }else {
			 System.out.println("9 이하의 숫자만 입력해주세요.");
		 }continue;
		 		 }
	 }
		 
	 public void practice11(){
		 System.out.print("시작 숫자 : ");
		 int st = sc.nextInt();
		 System.out.print("공차 : ");
		 int gg = sc.nextInt();
		 
		 for(int j = 0; j<10; j++) {
			 System.out.print(st + " ");
			 st += gg;
		
		 }
	 } 
	 
	 public void practice12(){
		 String str = null;
		while(true) {
		 System.out.print("연산자(+, -, *, /, %)  : ");
		 str = sc.nextLine();
		 if(str.equals("exit")) {
			 System.out.println("프로그램을 종료합니다."); break;
		 }
		 
		 System.out.print("정수1 : ");
		 int first = sc.nextInt();
		 System.out.print("정수2 : ");
		 int se = sc.nextInt();
		 sc.nextLine();
		 
		 int get = 0;
		 
		 switch(str) {
		 case "+" : 
			 get = first + se;
			 System.out.println(first + " " + str + se + " = " + get);
			 break;
			 
		 case "-" :
			 get = first - se;
			 System.out.println(first + " " + str + se + " = " + get);
			 break;
			 
		 case "*" :
			 get = first * se;
			 System.out.println(first + " " + str + se + " = " + get);
			 break;
			 
		 case "/" :
			 if(se != 0) {
				 get = first/se;
				 System.out.println(first + " " + str + se + " = " + get);
				 break;
			 }else {
				 System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
			 }break;
			 
		 case "%" :
			 get = first % se;
			 System.out.println(first + " " + str + se + " = " + get);
			 break;
			 
			 default : System.out.println("없는 연사자입니다. 다시 입력해주세요.");
		 }
		} 
		
	 }
	 
	 public void practice13(){
		 System.out.print("정수 입력 : ");
		 int num = sc.nextInt();
		 for(int i = 1; i<=num; i++) {
			 for(int j = 1; j <= i; j++) {
				 System.out.print('*'); 
			 }
			 System.out.println();
			 }
	 }
	 
	 public void practice14(){
		 System.out.print("정수 입력 : ");
		 int num = sc.nextInt();
		 
		 for(int i = 1; i <= num; i++) {
			 for(int j = num; j >= i; j--) {
				 System.out.print('*');
			 }
			 System.out.println();
		 }
		 
	 }
	 
//	 public void practice15() {
//		 System.out.println("숫자 : ");
//		 int num = sc.nextInt();
//		 if(num < 2) {
//			 System.out.println("잘못 입력하셨습니다.");
//		 }else {
//			 for
//		 }
//	 }
	 
//	 public void practice16() {
//		 System.out.println("숫자 : ");
//	 }
	 
//	 public void practice17() {
//		 System.out.println("숫자 : ");
//		 int num = sc.nextInt();
//		 
//		 if(num < 2) {
//			 System.out.println("잘못 입력하셨씁니다.");
//		 }else {
//			 for(int i = 2; i)
//		 }
//	 }
	 
}