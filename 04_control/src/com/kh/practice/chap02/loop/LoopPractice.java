package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	private static final String i = null;
	Scanner sc = new Scanner(System.in);
	
	public void  practice1(){
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int i = sc.nextInt();
		
		if(i>=1) {
			for(int j = 1; j<=i; j++) {
				System.out.print(j+" ");
			}
		}else {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		}
	}
	
	public void practice2() {
//		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");	
		int i = 0;
		
		while(i<1) {
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			i = sc.nextInt();
			
			if(i>=1) {
				for(int j = 1; j <=i; j++) {
					System.out.print(j+" ");
					}
				}else if(i < 1) {
					System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
					continue;
				}
			}
		}
	
	public void practice3() {
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int i = sc.nextInt();
		
		if(i>=1) {
			for(int j = 1; j<=i; i--) {
				System.out.print(i + " ");
			}
		}else {
			System.out.println("1�̻��� ���ڸ� �Է��ϼ��� : ");
		}
	}
	
	public void practice4() { 
		int i = 0;
		
		while(i<0) {
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			i = sc.nextInt();
			
			if(i>=1) {
				for(int j = 1; j<=i; i--) {
					System.out.print(i + " ");
				}
			}else if(i<1){
				System.out.println("1�̻��� ���ڸ� �Է��ϼ���.");
				continue;
			}	
		}
	}

	
	public void practice5() {
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
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
		//�̷��� ������ �ϴ� �����? 36�� ����
	}
	
	public void practice6() {
		System.out.print("ù ��° ���� :");
		int start = sc.nextInt();
		
		System.out.print("�� ��° ���� :");
		int end = sc.nextInt();
		
	
		if(start<=0 || end <= 0) {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			
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
			System.out.print("ù ��° ���� :");
			num1 = sc.nextInt();
			
			System.out.print("�� ��° ���� :");
			num2 = sc.nextInt();
			
			if(num1 == 0 || num2 == 0) {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
				
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
		 System.out.println("==== " + k + "�� =====");
		 
		 for(int j = 1; j <= k; j++) {
			 System.out.println(k + '*' + j + " = " + (k*j));
		 }
	 }
	 
	 public void practice9(){
		 System.out.print("���� : ");
		 int i = sc.nextInt();
		 
		 if(i<=9) {
			 for(int j = 1; j <=9; j++) {
				 System.out.println("====" + j + "��" + "=====");
			 for(int k = 1; k <=9; k++) {
				 System.out.printf("%d * %d = %d%n", j, k, (j*k));
			 }
			 System.out.println();
			 }
		 }else {
			 System.out.println("9 ������ ���ڸ� �Է����ּ���.");
		 }
	 }
	 
	 public void practice10() {
		 int k = 0;
		 
		 while(k > 9) {
			 System.out.println("���� : ");
			 k = sc.nextInt();
			 
		 if(k <= 9) {
			 for(int j = 1; j <= 9; j++) {
				 System.out.println("====" + j + "�� ====");
				 for(int d = 1; d <= 9; d++) {
					 System.out.println(k + " * " + d + " = " + (k*d));
				 }
				 }
		 }else {
			 System.out.println("9 ������ ���ڸ� �Է����ּ���.");
		 }continue;
		 		 }
	 }
		 
	 public void practice11(){
		 System.out.print("���� ���� : ");
		 int st = sc.nextInt();
		 System.out.print("���� : ");
		 int gg = sc.nextInt();
		 
		 for(int j = 0; j<10; j++) {
			 System.out.print(st + " ");
			 st += gg;
		
		 }
	 } 
	 
	 public void practice12(){
		 String str = null;
		while(true) {
		 System.out.print("������(+, -, *, /, %)  : ");
		 str = sc.nextLine();
		 if(str.equals("exit")) {
			 System.out.println("���α׷��� �����մϴ�."); break;
		 }
		 
		 System.out.print("����1 : ");
		 int first = sc.nextInt();
		 System.out.print("����2 : ");
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
				 System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.");
			 }break;
			 
		 case "%" :
			 get = first % se;
			 System.out.println(first + " " + str + se + " = " + get);
			 break;
			 
			 default : System.out.println("���� �������Դϴ�. �ٽ� �Է����ּ���.");
		 }
		} 
		
	 }
	 
	 public void practice13(){
		 System.out.print("���� �Է� : ");
		 int num = sc.nextInt();
		 for(int i = 1; i<=num; i++) {
			 for(int j = 1; j <= i; j++) {
				 System.out.print('*'); 
			 }
			 System.out.println();
			 }
	 }
	 
	 public void practice14(){
		 System.out.print("���� �Է� : ");
		 int num = sc.nextInt();
		 
		 for(int i = 1; i <= num; i++) {
			 for(int j = num; j >= i; j--) {
				 System.out.print('*');
			 }
			 System.out.println();
		 }
		 
	 }
	 
//	 public void practice15() {
//		 System.out.println("���� : ");
//		 int num = sc.nextInt();
//		 if(num < 2) {
//			 System.out.println("�߸� �Է��ϼ̽��ϴ�.");
//		 }else {
//			 for
//		 }
//	 }
	 
//	 public void practice16() {
//		 System.out.println("���� : ");
//	 }
	 
//	 public void practice17() {
//		 System.out.println("���� : ");
//		 int num = sc.nextInt();
//		 
//		 if(num < 2) {
//			 System.out.println("�߸� �Է��ϼ̾��ϴ�.");
//		 }else {
//			 for(int i = 2; i)
//		 }
//	 }
	 
}