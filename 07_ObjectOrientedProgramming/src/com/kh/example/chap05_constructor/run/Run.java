package com.kh.example.chap05_constructor.run;

import com.kh.example.chap05_constructor.model.vo.User;

public class Run {
	public static void main(String[] args) {
		User u1 = new User();
		System.out.println(u1);
		// The constructor User() is undefined
		// �Ű����� �ִ� �����ڸ� ���� ���¿��� �⺻ �����ڸ� ������ �� ���� ����
		u1.inform();
		
		User u2 = new User( "id�Դϴ�", "pw�Դϴ�");
		u2.inform();
		
		User u3= new User("id�Դϴ�", "pw�Դϴ�", "�̸��Դϴ�");
		u3.inform();
	}

}
