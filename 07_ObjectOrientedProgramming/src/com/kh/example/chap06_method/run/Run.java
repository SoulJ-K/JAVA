package com.kh.example.chap06_method.run;

import com.kh.example.chap05_constructor.model.vo.User;
import com.kh.example.chap06_method.controller.MethodTest;
import com.kh.example.chap06_method.model.vo.Trainee;

public class Run {
	public static void main(String[] args) {
		
		MethodTest mt = new MethodTest();
		
		mt.method1();
		
		int result = mt.method2();
		System.out.println(result);
		System.out.println(mt.method2());
		
		mt.method3(10, 20);
		
		int result2 = mt.method4(10, 30);
		System.out.println(result2);
		System.out.println(mt.method4(10, 30));
		
		//심화1
		int[] resultArr = mt.method5();
		System.out.println("Run resultArr : " + resultArr);
		
		//심화2
		User user = mt.method6();
		System.out.println("Run user : " + user);
		
		/////////////////////////////////////////////////
		
		Trainee tt = new Trainee("박신우");  //대기생
		System.out.println(tt.inform());
		
		//등록 확정
		//시험 --- 20점
		Trainee.setScore(20);
		System.out.println(tt.inform());
		double score = Trainee.getScore();
		System.out.println(score);
		
		//g반으로 등록 예정
		tt.setClassRoom('G');
		System.out.println(tt.inform());
		System.out.println(tt.getClassRoom());
	}

}
