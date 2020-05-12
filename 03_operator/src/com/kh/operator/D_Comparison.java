package com.kh.operator;

public class D_Comparison {
	public void method() {
		int a = 10;
		int b = 25;
		
		boolean result1 = (a==b);//f
		boolean result2 = (a<=b);//t
		boolean result3 = (a>=b);//f
		boolean result4 = (a>b);//f
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		System.out.println("b가 짝수인가? " + (b  %2 == 0));
		System.out.println("b가 홀수인가? " + (b % 2 != 0));
		System.out.println("b가 홀수인가? " + !(b % 2 == 0));
		
	}
	

}
