package com.kh.example.chap02_control.controller;

import java.util.Scanner;

import com.kh.example.chap02_control.thread.Thread4;

public class InterruptController {
	public void sleepInterrupt() {
		Thread4 th4 = new Thread4();
		Thread thread = new Thread(th4);
		thread.start();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("아무 값이나 입력하세요 : ");
		String input = sc.nextLine();
		System.out.println("입력한 값 : " + input);
		//10초 카운트 중 아무값이나 입력받으면 카운트 종료하기
		
		thread.interrupt();   //잠자던 스레드 깨움 -- interrupted익셉션 발생
		
		System.out.println("isInterrupted() : " + thread.isInterrupted());
				
		
	}

}
