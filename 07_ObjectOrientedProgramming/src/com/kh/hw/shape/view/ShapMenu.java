package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapMenu {
	private Scanner sc = new Scanner(System. in);
	
	private SquareController scr = new SquareController();
	
	private TriangleController tc = new TriangleController();
	
	public void inputMenu() {
		int mN = 0;
		 while(mN !=9) {
			 System.out.println("===== ���� ���α׷� =====");
			 System.out.println("3. �ﰢ��");
			 System.out.println("4. �簢��");
			 System.out.println("9. ���α׷� ����");
			 System.out.print("�޴� ��ȣ : ");
			 mN = sc.nextInt();
		
		 	switch(mN) {
		 	case 3 : triangleMenu(); break;
		 	case 4 : squareMenu(); break;
		 	case 9 : System.out.println("���α׷� �����մϴ�"); break;
		 	default : System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ�  �Է����ּ���.");
		 	continue;
		 	}
		}
	}
	
	public void triangleMenu() {
		int mm = 0;
		while(mm != 9) {
			System.out.println("===== �ﰢ�� =====");
			System.out.println("1. �ﰢ�� ����");
			System.out.println("2. �ﰢ�� ��ĥ");
			System.out.println("3. �ﰢ�� ����");
			System.out.println("9. ��������");
			System.out.print("�޴���ȣ : ");
			mm = sc.nextInt();
			
			switch(mm) {
			case 1 : inputSize(3, 1); break;
			case 2 : inputSize(3, 2); break;
			case 3 : printlnformation(3); break;
			case 9 : System.out.println("�������� ���ư��ϴ�.");
			         inputMenu(); break;
			         default : System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ�  �Է����ּ���.");
			         continue;
			}
		}
	}
	
	public void squareMenu() {
		int nn = 0;
		while(nn != 9){
		System.out.println("===== �簢�� =====");
		System.out.println("1. �簢�� �ѷ�");
		System.out.println("2. ����� ����");
		System.out.println("3. �簢�� ��ĥ");
		System.out.println("4. �簢�� ����");
		System.out.println("9. ��������");
		System.out.println("�޴� ��ȣ : ");
		nn = sc.nextInt();
		
		switch(nn) {
		case 1 : inputSize(4, 1); break;
		case 2 : inputSize(4, 2); break;
		case 3 : inputSize(4, 3); break;
		case 4 : printlnformation(4); break;
		case 9 : System.out.println("�������� ���ư��ϴ�.");
				inputMenu(); break;
				default : System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���");
				continue;
				}
			}
		}
	
	public void inputSize(int type, int menuNum) {
		if(type == 3 && menuNum == 1) {
			System.out.print("���� : ");
			int h = sc.nextInt();
			System.out.print("�ʺ� : ");
			int w = sc.nextInt();
			System.out.println("�ﰢ�� ���� : " + tc.calcArea(h, w));
			}
		if(type == 3 && menuNum == 2) {
			sc.nextLine();
			System.out.print("������ �Է��ϼ��� : ");
			String color = sc.nextLine();
			tc.paintColor(color);
			System.out.println("���� �����Ǿ����ϴ�.");
			}
		if(type == 4 && (menuNum == 1 || menuNum == 2)) {
			System.out.println("���� : ");
			int hi = sc.nextInt();
			System.out.println("�ʺ� : ");
			int we = sc.nextInt();
			
			if(menuNum == 1) {
				scr.calcPerimeter(hi, we);
			}else if(menuNum == 2) {
				scr.calcArea(hi, we);
			}
		}
		if(type == 4 && menuNum == 3) {
			sc.nextLine();
			System.out.print("������ �Է��ϼ��� : ");
			String color = sc.nextLine();
			scr.paintColor(color);
			System.out.println("���� �����Ǿ����ϴ�.");
		}
			}
	
	public void printlnformation(int type){
		if(type == 3) {
			System.out.println(tc.print());
		}else if(type == 4) {
			System.out.println(scr.print());
		}
		
	}
	

}
