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
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9. 끝내기");
			System.out.println("메뉴 번호 : ");
			me = sc.nextInt();
			
			switch(me) {
			case 1 : fileSave(); break;
			case 2 : fileOpen(); break;
			case 3 : fileEdit(); break;
			case 9 : System.out.println("프로그램을 종료합니다."); break;
			default : System.out.println("잘못입력하셨습니다. 다시  입력해주세요.");
//			continue;
			}
			if(me==9) break;
			}
		
		}
	
	public void fileSave() {
		StringBuilder sb = new StringBuilder();
	
			while(true) {
				System.out.println("파일에 저장할 내용을 입력하세요.");
				System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
				System.out.println("내용 : ");
				String te = sc.nextLine();
				
				if(te.equals("exit")) {
				System.out.println("저장할 파일 명을 입력헤주세요(ex.myFile.text) : ");
				String file = sc.nextLine();
				
				
			}
		}
		
	}
	
	public void fileOpen() {
		System.out.println("열 파일 명 : ");
		String name = sc.nextLine();
		
	}
	
	public void fileEdit() {
		System.out.println("수정할 파일 명 : ");
		
	}
	

}
