package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {
	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		System.out.println("�̸� : ");
		String name = sc.nextLine();
		System.out.println("���� : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("���� : ");
		char gender = sc.nextLine().charAt(0);
		
		Member mem = new Member(name, age, gender);
		
		
		
	}
	public void selectAll() {}
	public void searchBook() {}
	public void rentBook() {}
	

}
