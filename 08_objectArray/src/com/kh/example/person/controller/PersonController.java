package com.kh.example.person.controller;

import com.kh.example.person.model.vo.Person;

public class PersonController {
	public void method1() {
		// person 객체가 들어갈 수 있는 5개의 공간 생성
		Person[] pArr = new Person[5];
		
		System.out.println("pArr : " + pArr);
//		pArr : [Lcom.kh.example.person.model.vo.Person;@15db9742
		
		for(int i = 0; i < pArr.length; i++) {
			System.out.println("pArr[" + i + "] : " + pArr[i]);
		}
//		pArr[0] : null
//		pArr[1] : null
//		pArr[2] : null
//		pArr[3] : null
//		pArr[4] : null
		
		//각 인덱스별로 객체를 생성하여 대입하기
		pArr[0] = new Person("강건강", 20, '남', 175.8, 66.9);
		pArr[1] = new Person("남나눔", 34, '남', 179.5, 96.1);
		pArr[2] = new Person("도대담", 14, '남', 190.0, 77.3);
		pArr[3] = new Person("류라라", 27, '여', 161.4, 56.8);
		pArr[4] = new Person("문미미", 53, '여', 157.9, 58.3);
		
		for(int i = 0; i < pArr.length; i++) {
			System.out.println("pArr[" + i + "] : " + pArr[i]);
//			pArr[0] : com.kh.example.person.model.vo.Person@6d06d69c
//			pArr[1] : com.kh.example.person.model.vo.Person@7852e922
//			pArr[2] : com.kh.example.person.model.vo.Person@4e25154f
//			pArr[3] : com.kh.example.person.model.vo.Person@70dea4e
//			pArr[4] : com.kh.example.person.model.vo.Person@5c647e05
		}
		
		for(int i = 0; i < pArr.length; i++) {
			System.out.println("pArr[" + i + "] : " + pArr[i].personInfo());
//			pArr[0] : 강건강, 20, 남, 175.8, 66.9
//			pArr[1] : 남나눔, 34, 남, 179.5, 96.1
//			pArr[2] : 도대담, 14, 남, 190.0, 77.3
//			pArr[3] : 류라라, 27, 여, 161.4, 56.8
//			pArr[4] : 문미미, 53, 여, 157.9, 58.3

			//.personInfo()
			//다른 클래스에 있지만 public 메소드이고, 같은 프로젝트 안에 있으므로 불러올 수 있음.
			// '.' ----> 들어가서 불러온다... 호출의 의미...?
			}

	}
	
	public void method2() {
//		pArr[0] = new Person("강건강", 20, '남', 175.8, 66.9);
//		pArr[1] = new Person("남나눔", 34, '남', 179.5, 96.1);
//		pArr[2] = new Person("도대담", 14, '남', 190.0, 77.3);
//		pArr[3] = new Person("류라라", 27, '여', 161.4, 56.8);
//		pArr[4] = new Person("문미미", 53, '여', 157.9, 58.3);
		
		Person[] pArr = {new Person("강건강", 20, '남', 175.8, 66.9),
						new Person("남나눔", 34, '남', 179.5, 96.1),
						new Person("도대담", 14, '남', 190.0, 77.3),
						new Person("류라라", 27, '여', 161.4, 56.8),
						new Person("문미미", 53, '여', 157.9, 58.3)};
		
		for(int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i].getName() + "님의 정보 : " + pArr[i].personInfo());
		}
	}

}
