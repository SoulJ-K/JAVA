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
		 System.out.print("���� ���� : ");
		 int num = sc.nextInt();
		 
		 int[] ran = new int[num+1]; 
		 for(int i = 1; i < ran.length; i++) {
			
			 System.out.print(i + " ");
		 }
		}
	 
	 public void practice4(){
		 String[] fr = new String[5];
		 
		 fr[0] = "���";
		 fr[1] = "��";
		 fr[2] = "����";
		 fr[3] = "������";
		 fr[4] = "����";
		 
		 System.out.println(fr[1]);
	 }
	 
//	 public void practice5(){
//		 System.out.print("���ڿ� : ");
//		 String word = sc.nextLine();
//		 char[] chArr = new char[word.length()]; 
//		 
//		 for(int i = 0; i <= word.length() ; i++) {
//			 chArr[i] = word.charAt(i);
//		 }
//			 System.out.println("���� : ");
//			 char ch = sc.nextLine().charAt(0);
//			 System.out.println(word + "�� " + ch + "�� �����ϴ� ��ġ(�ε���) : ");
//			 for(int i = 0; i < word.length(); i++) {
//				 if(chArr[i] == ch) {
//					 System.out.println((i) + " ");
//				 }
//		 }
//			 }
	 
	 public void practice6() {
		 System.out.print("0 ~ 6 ���� ���� �Է� : ");
		 int i = sc.nextInt();
		 
		 if(i<0 || i >=7) {
			 System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		 }else {
		 String[] day = new String[7];
		 
		 day[0] = "������";
		 day[1] = "ȭ����";
		 day[2] = "������";
		 day[3] = "�����";
		 day[4] = "�ݿ���";
		 day[5] = "�����";
		 day[6] = "�Ͽ���";
		
		 System.out.println(day[i]);
		 }
	 }
	 
//	 public void practice7(){
//		 System.out.print("���� : ");
//		 int num = sc.nextInt();
//		 
//		 int[] kk = new int[num];
//		 
//		 for(int i = 0; i<num; i++) {
//			 System.out.print("�迭" + i + "��° �ε����� ���� �� :");
//			 kk[i] = sc.nextInt();
//		 }
		 
//	//		
//		 int in = new int[a];
//		 System.out.print("�迭" + (i-(i) + "��° �ε����� ���� �� :");
//	 }
	 
//	 public void practice8(){
//		 while
//		 System.out.print("���� : ");
//		 int i = sc.nextInt();
//		 
//		 if(i %2 == 0 || i <3) {
//			 System.out.print("�ٽ� �Է��ϼ���.");
//		 }
//	 }
 }

