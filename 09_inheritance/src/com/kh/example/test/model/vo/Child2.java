package com.kh.example.test.model.vo;

public class Child2 extends Parent{
	//��ӹ޾� Ȯ��
	private String str;
	
	public Child2() {
//		super.num = 10; ���� ������ private�� �Ұ���
		super.dNum = 2.3; /*����Ʈ - ���� ��Ű���� ����*/
		super.bool = false; /*������Ʈ - ���� ��Ű���̸� �ļ��̶� ����*/
		super.ch = 'a'; /*���ٹ����� public�̶�*/
	}
	
	public void setStr(String str) {
		this.str = str;
	}
	
	public String getStr() {
		return str;
	}

}
