package com.kh.example.test.model.vo;

import com.kh.example.test.model.vo.Parent;

public class Child3 extends Parent{
	public Child3() {
//		super.num = 10; ���������� private ������
//		super.dNum = 15.2;   ���������� defult�� ���� ��Ű���� �ѿ����� ����
		super.bool = false; /* ������Ʈ�� ��Ű���� ���� �ʾƵ� �ڽĿ��� ��� ����*/
		super.ch = 'd';
	}

}
