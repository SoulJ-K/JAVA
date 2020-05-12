package com.kh.example.chap00_file.controller;

import java.io.File;
import java.io.IOException;

public class FileController {
	public void method1() {
		
		try {
		File f1 = new File("test.txt");
		f1.createNewFile();
		
		File f2 = new File("c:/test/test.txt");
		f2.createNewFile();
		//에러가 뜨는 이유는 c드라이브에 test 파일이 없어서. test파일을 만들어줘야함.
		
		File f3 = new File("c:\\temp3\\temp2");
		File f4 = new File("c:\\temp3\\temp2\\test.txt");
//		f4.createNewFile();
		f3.mkdirs();     //폴더를 자동으로 만들어주는것
		f4.createNewFile();
		f4.delete();
		
		System.out.println(f2.exists());     //exists : 존재하냐고 묻는것
		System.out.println(f3.exists());
		System.out.println(f3.isFile());     //isFile : 파일인지 아닌지
		
		//그 외 메소드들
		System.out.println("파일명 : " + f1.getName());
		System.out.println("저장 절대 경로 : " + f1.getAbsolutePath());
		System.out.println("저장 상대 경로 : " + f1.getPath());
		System.out.println("파일 용량 : " + f1.length());
		System.out.println("f1 상위 폴더 : " + f1.getParent());
		System.out.println("f4 상위 폴더 : " + f4.getParent());
		//저장 절대 경로 : 절대적인 경로. 부르는 위치가 어디에 있든 절대 바뀌지 않는 경로
		//저장 상대 경로 : 부르는 위치가 어디인지에 따라 달라지는 경로 ex. ㅁ ㅂ      정면에서 보면 ㅁ은 ㅂ 왼쪽에 있다. 반대로 돌아가서 보면 ㅁ 은 ㅂ 오른쪽에 있다.
		
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
