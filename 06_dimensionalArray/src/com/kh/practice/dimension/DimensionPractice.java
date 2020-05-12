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
//		 System.out.print("행 크기 : ");
//		 int h = sc.nextInt();
//		 System.out.print("열 크기 : ");
//		 int y = sc.nextInt();
//		 
//		if(h<1 || h>10 || y<1 || y>10) {
//			 System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
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
		 String[][] strArr = new String[][] {{"이", "까", "왔", "앞", "힘"}, 
			 								{"차", "지", "습", "으", "냅"}, 
			 								{"원", "열", "니", "로", "시"}, 
			 								{"배", "심", "다", "좀", "다"}, 
			 								{"열", "히", "! ", "더", "!! "}};
			 								
	    for(int i = 0; i < strArr.length; i++) {
			for(int j = 0; j <strArr[i].length; j++) {
			 	System.out.print(strArr[j][i] + " ");
			 	}
			 	System.out.println();
			 	}
	 }
	 
	 public void practice7(){
//		 Scanner sc = new Scanner(System.in);
//		 System.out.print("행의 크기 : ");
//		 int hang = sc.nextInt();
//		 
//		 int i = hang-=1;
//		 while(i >= 0) {
//			 System.out.print(i + "행의 열 크기 : "); 
//			 i--;
//			 System.out.println();
//			 }
		 
	 }
	 
	 public void practice8(){
		 String[] name = new String[12];
		 name[0] = "강건강";
		 name[1] = "남나나";
		 name[2] = "도대담";
		 name[3] = "류라라";
		 name[4] = "문미미";
		 name[5] = "박보배";
		 name[6] = "송성실";
		 name[7] = "윤예의";
		 name[8] = "진재주";
		 name[9] = "차천출";
		 name[10] = "피풍표";
		 name[11] = "홍하하";
		 
		 String[][] gang = new String[2][3];
		 
		 int kk = 0;
		for(int i = 0; i < gang.length; i++) {
			for(int j = 0; j < gang[i].length; j++) {
				
				}
			}
	 }


}
