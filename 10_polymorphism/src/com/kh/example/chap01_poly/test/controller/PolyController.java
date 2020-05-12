package com.kh.example.chap01_poly.test.controller;

import com.kh.example.chap01_poly.test.model.vo.Child1;
import com.kh.example.chap01_poly.test.model.vo.Child2;
import com.kh.example.chap01_poly.test.model.vo.Parent;

//������
public class PolyController {

	public void method() {
		//------------������ ������ �ٷ�
		System.out.println("1. �θ�Ÿ�� ���۷����� �θ� ��ü�� �ٷ�� ���");
		Parent p = new Parent();
//		�θ�Ÿ�� ���۷��� = �θ� ��ü
		p.printParent();
		//���� �� �ȿ� �ִ°� �θ��� �ֱ� ������ ���� ����
		System.out.println();
		
		System.out.println("2. �ڽ�Ÿ�� ���۷����� �ڽ� ��ü�� �ٷ�� ���");
		Child1 c1 = new Child1();
//		�ڽ�Ÿ�� ���۷��� = �ڽ� ��ü
		c1.printChild1();
		//���� �� �ȿ� �ִ°� �θ��� �ֱ� ������ ���� ����
		c1.printParent();
		//child1�� �ڽ�Ŭ�������� �θ𿡰� �ִ°� ������ �� �� ����
		
		System.out.println();
		
		
		//---------------���������� ������� �� �ִ� �� 
		System.out.println("3. �θ�Ÿ�� ���۷����� �ڽ� ��ü�� �ٷ�� ���");
		Parent p2 = new Child2();
		//�ڽİ�ü�� �θ��۷������� ���� ���� ��ĳ����
		//�θ�Ÿ���� ����������(���۷���)�� ��� �ڽİ�ü�� ���� �� �ִ� ��
		Parent p3 = new Child1();
		p2.printParent();
		//p2.printChild2�� �ҷ��� �� ����.
		//p2�� parent Ÿ������ ������� ��ü�̹Ƿ� child2�ȿ� �ִ� parent�� �ҷ��� �� ����
		
		((Child2)p2).printChild2();
		//child2�� p2�� ����ȯ���༭ ��ȯ ����
		//�θ� �ڽĿ��� ���� ���� �ٿ�ĳ����
		
		System.out.println();
		
		System.out.println("4. �ڽ�Ÿ�� ���۷����� �θ� ��ü�� �ٷ�� ���");
//		Child2 c2 = new Parent();
		//child�� �� ū ����
		//child2�� child2+parent�� ������ ����. �׷��� new�� parent�� �θ�
		//parent�� child2�� ����. �׷��� �ҷ����� ����.
		
		//---�θ�� �ڽ��� ���� �� ������ �ڽ��� �θ� ���� �� ����.
		
//		Child2 c2 = (Child2) new Parent();
		//��Ե� �ذ� �� �� ����
		
		System.out.println();
		System.out.println("=== ���� ���� ===");
		System.out.println();
		
		Parent[] pArr = new Parent[4];
		pArr[0] = new Child1();
		pArr[1] = new Child2();
		pArr[2] = new Child1();
		pArr[3] = new Child2();
		
		for(int i = 0; i <pArr.length; i++) {
			if(pArr[i] instanceof Child1) {
				((Child1)pArr[i]).printChild1();
			}else if(pArr[i] instanceof Child2) {
				((Child2)pArr[i]).printChild2();
			}
		}
		
		for(int i = 0; i < pArr.length; i++) {
			pArr[i].print();
			//���� ���ε��� ���� �ڽĵ��� ��µ�
			//parent pArr[i].print();
			//print�� �ҷ��°� parent�̱� ������ �θ��!!!�� ��µǾ�������
			//�������̵����� ���� �������ε��Ǿ� �ڽĵ��� ��µ�
		}
	
	}
	
	

}
