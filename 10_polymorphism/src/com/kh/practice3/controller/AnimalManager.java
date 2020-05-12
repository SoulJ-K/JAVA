package com.kh.practice3.controller;

import com.kh.practice3.model.vo.Animal;
import com.kh.practice3.model.vo.Cat;
import com.kh.practice3.model.vo.Dog;

public class AnimalManager {
	public static void main(String[] args) {
		Animal[] a = new Animal[5];
		a[0] = new Cat("�Ϲ�", "����ũ��", "��", "white");
		a[1] = new Dog("ġ��", "�ݸ�", '5');
		a[2] = new Dog("����", "��Ƽ��", '3');
		a[3] = new Cat("�Ҹ�", "���", "��", "brown");
		a[4] = new Dog("����", "��Ʈ����", '7');
		
		for(int i = 0; i <= a.length; i++) {
			if( a[i] instanceof Dog){
				((Dog)a[i]).speak();
			}else if(a[i] instanceof Cat) {
				((Cat)a[i]).speak();
			}
		}
				
	}

}
