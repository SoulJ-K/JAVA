package com.kh.variable;

public class D_Cast {
	public void rule1() {
		boolean flag = true;
		//boolean flag2 = 100;
		//boolean�� ����ȯ �Ұ�. ������ true & false
		
		int num = 'A';
		System.out.println("nun :" +num);
		
		char ch = 97;
		System.out.println("ch:"+ch);
		
		char ch2 = (char)num;
		//Type mismatch: cannot convert from int to char
		//97�� ���ͷ�(��)�̱� ������ num�� �����̴�. ������ ���� �ƴ� ������ ũ�⸸ ������ �����߻�
		//num�� 4����Ʈ char�� 2����Ʈ�� ������ ��������ȯ�� �̷���� �տ� char�� �ٲ۴ٰ� ���
		System.out.println("ch2:"+ch2);
		
		int num2=-97;
		char ch3=(char)num2;
		System.out.println("ch3:"+ch3);
		//char�� ������ ǥ��������. �ִ� ���� �������� char���� ã�� �� ���� �ܾ��� ?�� ����
	}
	public void rule2() {
		int iNum = 10;
		long lNum = 100;
		
	//	int result = iNum+lNum
	// to complete LocalVariableDeclarationStatement
	//iNum�� lNum���� �ڵ�����ȯ�Ǽ� long������ ����Ǿ��µ� �տ� int������ ����� ���ٰ� �ؼ� ������
	
    //iNum+lNumdmf int result�� ������ �� �ִ� ���
	//���1. �������� int�� ��������ȯ
		int result = (int)(iNum+lNum);
		
    //���2. long���� int�� ���� ����ȯ
		int result2 = iNum+(int)lNum;
		
    //����. ������� �����ϴ� result�� long������ ����
		long result3 = iNum+lNum;
	}
	
	public void rule3() {
		int iNum = 290;
		
		byte bNum = (byte)iNum;
		
		System.out.println("bNum:"+bNum);
		// int 290�� byte������ �� �� ������ �ս��� �Ͼ ���� �������� 34�� ���� ��
		
	}

}
