package com.kh.practice.file.view;

import java.util.Scanner;

import com.kh.example.chap00_file.controller.FileController;

public class FileMenu {
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();
	
	public void mainMenu() {
		int me = 0;
		while (me != 9){
			System.out.println("***** My Note *****");
			System.out.println("1. ��Ʈ ���� �����");
			System.out.println("2. ��Ʈ ����");
			System.out.println("3. ��Ʈ ��� �����ϱ�");
			System.out.println("9. ������");
			System.out.println("�޴� ��ȣ : ");
			me = sc.nextInt();
			
			switch(me) {
			case 1 : fileSave(); break;
			case 2 : fileOpen(); break;
			case 3 : fileEdit(); break;
			case 9 : System.out.println("���α׷��� �����մϴ�."); break;
			default : System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ�  �Է����ּ���.");
//			continue;
			}
			if(me==9) break;
			}
		
		}
	
	public void fileSave() {
		StringBuilder sb = new StringBuilder();
	
			while(true) {
				System.out.println("���Ͽ� ������ ������ �Է��ϼ���.");
				System.out.println("ex��it �̶�� �Է��ϸ� ����˴ϴ�.");
				System.out.println("���� : ");
				String te = sc.nextLine();
				
				if(te.equals("exit")) {
				System.out.println("������ ���� ���� �Է����ּ���(ex.myFile.text) : ");
				String file = sc.nextLine();
				
				
			}
		}
		
	}
	
	public void fileOpen() {
		System.out.println("�� ���� �� : ");
		String name = sc.nextLine();
		
	}
	
	public void fileEdit() {
		System.out.println("������ ���� �� : ");
		
	}
	

}
