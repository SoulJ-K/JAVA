package com.kh.example.chap03.branch;

public class B_Continue {
	//continue�� �ݺ��� �ȿ����� ��� ����
	//continue�� ������ �Ʒ� ������ �������� �ʰ� 
	//�ݺ����� �ٽ� ������
	//for���� ��� ������, while�� ��� ���ǽ����� ���ư�
	public void method1() {
		//1~100������ �������� �հ踦 ����ϵ� ��, 4�� ����� ���� ���
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 4 == 0) {
				continue;
				
			}
			System.out.print(i + " ");
			sum += i;
		}
		System.out.println();
		System.out.println("sum = " + sum);
	}
	
	public void method2() {
		//������ ��� : ¦����, ¦�� �� ���� ���
		
		for(int i = 2; i <= 9; i++) {
			System.out.println("=========" + i + "��=======");
//			if(i %2==0) {
//				continue;
//			}
			for(int j = 1; j <=9; j++) {
//				if(j %2==0) {
//					continue;
//				}
				if(i %2 == 0 || j %2==0) {
					continue;
				}
				System.out.println(i + "*" + j + "=" + (i*j));
			}
			System.out.println();
		}
	}
	

}
