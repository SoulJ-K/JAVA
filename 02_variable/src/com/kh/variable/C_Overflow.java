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
		//������ (long)�� ����ȯ�̶�� �θ�.
		//�ڷ����� ��ȯ��Ű�� ��
		//num1�� ���� long�� ���߰�, int�� num2�� ū ���� long�� ����
		System.out.println("����� :" +result);
		
	}
}
