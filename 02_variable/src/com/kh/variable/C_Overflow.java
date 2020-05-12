package com.kh.variable;

public class C_Overflow {
	public void overflow() {
		byte bNum = 127;
		bNum = (byte)(bNum+1);
	
		System.out.println("bNum : " +bNum);
		
	}
	
	public void calc() {
		int num1 = 1000000;
		int num2 = 700000;
		
		//int result = num1*num2;
		long result = (long)num1*num2;
		//위에서 (long)를 형변환이라고 부름.
		//자료형을 변환시키는 것
		//num1의 값이 long로 변했고, int인 num2는 큰 값인 long로 변함
		System.out.println("계산결과 :" +result);
		
	}
}
