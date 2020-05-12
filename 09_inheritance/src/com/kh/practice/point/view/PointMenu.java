package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {
	
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
	
	public void mainMenu() {
		while(true){
		System.out.println("===== �޴� =====");
		System.out.println("1. �� ");
		System.out.println("2. �簢��");
		System.out.println("9. ������");
		System.out.println("�޴���ȣ : ");
		
		int menunum = sc.nextInt();
		sc.nextLine();
		
		switch(menunum) {
		case 1 : circleMenu(); break;
		case 2 : rectangleMenu(); break;
		case 9 : System.out.println("���α׷��� �����մϴ�."); break;
		default : System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���."); break;
		}
		if(menunum == 9) {
			break;
		}
		
		}
	}
	
	public void circleMenu() {
		while(true){
			System.out.println("===== �� �޴� =====");
			System.out.println("1. �� �ѷ�");
			System.out.println("2. �� ����");
			System.out.println("9. ��������");
			System.out.println("�޴���ȣ : ");
			
			int menunum = sc.nextInt();
			
			switch(menunum) {
			case 1 : calcCircum(); break;
			case 2 : calcCircleArea(); break;
			case 9 : System.out.println("�������� ���ư��ϴ�."); break;
			default : System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���."); break;
			}
			if(menunum == 9) {
				break;
			}
			sc.nextLine();
			}
		
	}
	
	public void rectangleMenu() {
		while(true){
			System.out.println("===== �޴� =====");
			System.out.println("1. �簢���ѷ�");
			System.out.println("2. �簢�� ����");
			System.out.println("9. ��������");
			System.out.println("�޴���ȣ : ");
			
			int menunum = sc.nextInt();
			sc.nextLine();
			
			switch(menunum) {
			case 1 : calcPerimeter(); break;
			case 2 : calcRectArea(); break;
			case 9 : System.out.println("�������� ���ư��ϴ�."); break;
			default : System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���."); break;
			}
			if(menunum == 9) {
				break;			
			}
		}
		
	}
	
	public void calcCircum() {
		System.out.println("x ��ǥ : ");
		int x = sc.nextInt();
		System.out.println("y ��ǥ : ");
		int y = sc.nextInt();
		System.out.println("������ : ");
		int xy = sc.nextInt();
		sc.nextLine();
		
		System.out.println(cc.calcCircum(x, y, xy));
		
	}
	
	public void calcCircleArea() {
		System.out.println("x ��ǥ : ");
		int x = sc.nextInt();
		System.out.println("y ��ǥ : ");
		int y = sc.nextInt();
		System.out.println("������ : ");
		int xy = sc.nextInt();
		sc.nextLine();
		
		System.out.println(cc.calcArea(x, y, xy));
		
	}
	
	public void calcPerimeter() {
		System.out.println("x ��ǥ : ");
		int x = sc.nextInt();
		System.out.println("y ��ǥ : ");
		int y = sc.nextInt();
		System.out.println("���� : ");
		int h = sc.nextInt();
		System.out.println("�ʺ� : ");
		int w = sc.nextInt();
		sc.nextLine();
		
		System.out.println(rc.calcPerimeter(x, y, h, w));
		
	}
	
	public void calcRectArea() {
		System.out.println("x ��ǥ : ");
		int x = sc.nextInt();
		System.out.println("y ��ǥ : ");
		int y = sc.nextInt();
		System.out.println("���� : ");
		int h = sc.nextInt();
		System.out.println("�ʺ� : ");
		int w = sc.nextInt();
		sc.nextLine();
		
		System.out.println(rc.calcArea(x, y, h, w));
		
	}

}
