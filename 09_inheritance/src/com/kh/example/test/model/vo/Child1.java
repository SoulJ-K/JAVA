package com.kh.example.test.model.vo;

public class Child1 {
	private String str;
	private int num;
	
	public Child1() {//���� ��Ű���̳� Parent���� ��ӹ��� ����.
		Parent p = new Parent();
		
//		p.num = 10;   ---> Private�� �Ⱥ���
		p.dNum = 0.0; /* ����Ʈ���̶� ����(���� ��Ű��)*/
		p.bool = false; /* ������Ʈ(���� ��Ű��) ����*/
		p.ch = 'A';
	}
	
	//��ӹ��� �ʰ� �ҷ����� ���̹Ƿ� ��ü���� �ʼ�
	
	public void setStr(String str) {
		this.str = str;
	}
	
	public String getStr() {
		return str;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public int getNum(){
		return num;
	}
}
