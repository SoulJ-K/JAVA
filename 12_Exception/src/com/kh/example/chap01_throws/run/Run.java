package com.kh.example.chap01_throws.run;

import com.kh.example.chap01_throws.controller.ThrowsController;

public class Run {
	public static void main(String[] args) /* throws Exception */{
		// ���� �޼ҵ忡���� ���� ��Ȳ�� ȣ���� ��(JVM)���� ������ �� ������ ������ ���� ��.
		ThrowsController tc = new ThrowsController();
		try {
			tc.method1();
		} catch (Exception e) {
			e.printStackTrace();      //���� ����� ���� �߻� ��ġ�� �ֿܼ� ������ִ� �޼ҵ�
			System.out.println("���� ��Ȳ�� �߻��Ͽ����ϴ�.");
		}
		
		System.out.println("���������� �����...");
	}

}
