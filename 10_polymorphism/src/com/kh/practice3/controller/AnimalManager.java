package com.kh.practice3.controller;

import com.kh.practice3.model.vo.Animal;
import com.kh.practice3.model.vo.Cat;
import com.kh.practice3.model.vo.Dog;

public class AnimalManager {
	public static void main(String[] args) {
		Animal[] a = new Animal[5];
		a[0] = new Cat("일번", "스핑크스", "집", "white");
		a[1] = new Dog("치즈", "콜리", '5');
		a[2] = new Dog("고구마", "말티즈", '3');
		a[3] = new Cat("할매", "삼색", "길", "brown");
		a[4] = new Dog("뚱이", "리트리버", '7');
		
		for(int i = 0; i <= a.length; i++) {
			if( a[i] instanceof Dog){
				((Dog)a[i]).speak();
			}else if(a[i] instanceof Cat) {
				((Cat)a[i]).speak();
			}
		}
				
	}

}
