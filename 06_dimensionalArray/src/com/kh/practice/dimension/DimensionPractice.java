package com.kh.practice.dimension;

import java.util.Scanner;

public class DimensionPractice {
	
	public void practice1(){
		int[][] ia = {{0,1,2}, {0,1,2}};
		
		for(int i = 0; i< ia.length; i++) {
			for(int j = 0; j < ia[i].length; j++) {
				
			}
		}
		for(int i = 0; i < ia.length; i++) {
			for(int j = 0; j <ia[i].length; j++) {
				System.out.printf("%2d ", ia[i][j]);
			}
		}System.out.println();
	
	}
	
	 public void practice2(){
		 int[][] ia = new int[4][4];
		 
		 int kk = 1;
		for(int i = 0; i < ia.length; i++) {
			for(int j = 0; j < ia[i].length; j++) {
				ia[i][j] = kk++;
				}
			}
		for(int i = 0; i < ia.length; i++) {
			for(int j = 0; j < ia[i].length; j++) {
				System.out.printf("%2d ", ia[i][j]);
				
				}System.out.println();
			}
		 
	 }
	 
	 public void practice3(){
		 int[][] ia = new int[4][4];
		 
		 int kk = 16;
		for(int i = 0; i < ia.length; i++) {
			for(int j = 0; j < ia[i].length; j++) {
				ia[i][j] = kk--;
				}
			}
		for(int i = 0; i < ia.length; i++) {
			for(int j = 0; j < ia[i].length; j++) {
				System.out.printf("%2d ", ia[i][j]);
				
				}System.out.println();
			}
	 }
	 
	 public void practice4(){
//		 int[][] ia = new int[4][4];
//		 
//		 int kk = (int) (Math.random() * 10+1);
//		 
//		 for(int i = 0; i < ia.length; i++) {
//			 for(int j = 0; j < ia.length; j++) {
//				 ia[i][j] = kk;
//				 
//				 if(i==4 && j==4) {
//					 int sum1 = ia[i][j]++;
//					 ia[i][j] = sum1;
//				 }
//			 }
//		 }
//		 
//		 for(int i = 0; i < ia.length; i++) {
//				for(int j = 0; j < ia[i].length; j++) {
//					System.out.printf("%2d ", ia[i][j]);
//					
//					}System.out.println();
//				}
	 }
	 
	 public void practice5(){
//		 Scanner sc = new Scanner(System.in);
//		 
//		 while(true) {
//		 System.out.print("�� ũ�� : ");
//		 int h = sc.nextInt();
//		 System.out.print("�� ũ�� : ");
//		 int y = sc.nextInt();
//		 
//		if(h<1 || h>10 || y<1 || y>10) {
//			 System.out.println("�ݵ�� 1~10 ������ ������ �Է��ؾ� �մϴ�.");
//		 }
//		
//		int[][] ia = new int[h][y];
//		
//		char kk = (char) (Math.random() * 10+1);
//		 for(int i = 0; i < ia.length; i++) {
//			 for(int j = 0; j < ia.length; j++) {
//				 ia[i][j] = kk;
//				 }	
//			}
//		 
//		 for(int i = 0; i < ia.length; i++) {
//				for(int j = 0; j < ia[i].length; j++) {
//					System.out.printf("%2d ", ia[i][j]);
//					
//					}
//				System.out.println();
//				}
//		 
//		continue;
//		}
	 }
	 
	 public void practice6(){
		 String[][] strArr = new String[][] {{"��", "��", "��", "��", "��"}, 
			 								{"��", "��", "��", "��", "��"}, 
			 								{"��", "��", "��", "��", "��"}, 
			 								{"��", "��", "��", "��", "��"}, 
			 								{"��", "��", "! ", "��", "!! "}};
			 								
	    for(int i = 0; i < strArr.length; i++) {
			for(int j = 0; j <strArr[i].length; j++) {
			 	System.out.print(strArr[j][i] + " ");
			 	}
			 	System.out.println();
			 	}
	 }
	 
	 public void practice7(){
//		 Scanner sc = new Scanner(System.in);
//		 System.out.print("���� ũ�� : ");
//		 int hang = sc.nextInt();
//		 
//		 int i = hang-=1;
//		 while(i >= 0) {
//			 System.out.print(i + "���� �� ũ�� : "); 
//			 i--;
//			 System.out.println();
//			 }
		 
	 }
	 
	 public void practice8(){
		 String[] name = new String[12];
		 name[0] = "���ǰ�";
		 name[1] = "������";
		 name[2] = "�����";
		 name[3] = "�����";
		 name[4] = "���̹�";
		 name[5] = "�ں���";
		 name[6] = "�ۼ���";
		 name[7] = "������";
		 name[8] = "������";
		 name[9] = "��õ��";
		 name[10] = "��ǳǥ";
		 name[11] = "ȫ����";
		 
		 String[][] gang = new String[2][3];
		 
		 int kk = 0;
		for(int i = 0; i < gang.length; i++) {
			for(int j = 0; j < gang[i].length; j++) {
				
				}
			}
	 }


}
