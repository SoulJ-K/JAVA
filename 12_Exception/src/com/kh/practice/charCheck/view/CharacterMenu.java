package com.kh.practice.charCheck.view;

import java.util.Scanner;

import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterMenu {
	public void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요 : ");
		String s = sc.nextLine();
		
		
		    CharacterController ct = new CharacterController();
		
		
		try {
			ct.countAlpha(s);
		} catch (CharCheckException e) {
			e.printStackTrace();
		}
	
		
	}


}
