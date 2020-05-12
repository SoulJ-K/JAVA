package com.kh.example.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.kh.example.set.model.compare.DogComparator;
import com.kh.example.set.model.vo.Dog;

public class SetController {
	public void doSet() {
		Set<Dog> set = new HashSet<Dog>();     //다형성 적용됨
		
		set.add(new Dog("샤샤", 4.0));
		set.add(new Dog("호두", 4.5));
		set.add(new Dog("우유", 8.1));
		System.out.println(set);
		
		set.add(new Dog("샤샤", 4.0));
		System.out.println(set);
		
//		Set<String> test = new HashSet<String>();
//		//해쉬코드랑 이퀄스가 오버라이딩 되어있는 스트링의 경우 해줄 필요 없음
//		test.add("예시1");
//		test.add("예시2");
//		test.add("예시3");
//		System.out.println(test);
//		test.add("예시2");
//		System.out.println(test);
		
		Set<Dog> set2 = new LinkedHashSet<Dog>();
		set2.add(new Dog("초코", 2.1));
		set2.add(new Dog("콩이", 8.3));
		set2.add(new Dog("두부", 5.0));
		set2.add(new Dog("초코", 2.1));  //순서는 유지되고 중벅저장은 안되는 LinkedHashSet 
		System.out.println(set2);
		
		set2.add(new Dog("로이", 6.1));
		set2.add(new Dog("공주", 5.2));
		set2.add(new Dog("왕자", 9.5));
		set2.add(new Dog("조이", 12.5));
		System.out.println(set2);
		
		Set<Dog> set3 = new TreeSet<Dog>(set2);
		System.out.println(set3);
		//Exception in thread "main" java.lang.ClassCastException: com.kh.example.set.model.vo.Dog cannot be cast to java.lang.Comparable
//			정렬기준이 없는 상태에서 정렬 요구
		//comparable or comparator 사용해서 정렬
		
		//몸무게 정렬
		Set<Dog> set4 = new TreeSet<Dog>(new DogComparator());
		set4.add(new Dog("초코", 6.1));
		set4.add(new Dog("콩이", 8.3));
		set4.add(new Dog("두부", 5.0));
		set4.add(new Dog("초코", 2.1));
		set4.add(new Dog("로이", 6.1));      //초코와 몸무게 값이 같음. 먼저 들어온 초코와 같은 객체로 착각해서 중복제거됨
		set4.add(new Dog("공주", 5.2));
		set4.add(new Dog("왕자", 9.5));
		set4.add(new Dog("조이", 12.5));
		System.out.println(set4);
		
		//요소 뽑아내기
		//방법1. Set을 List화 시키기 : addAll()
		List<Dog> list = new ArrayList<Dog>();
		list.addAll(set4);
		System.out.println(list);
		System.out.println(list.get(3));
		
		//방법2. Iterator 활용하기 : iterator()
		Iterator<Dog> it = set4.iterator();
		while(it.hasNext()) {  //ㅇㅇ의 값이 있니?
			System.out.println(it.next());    //ㅇㅇ의 값이 있다면 출력해
		}
		while(it.hasNext()) {
			System.out.println("re : " + it.next());   //값이 찍히지 않음.   iterator는 1회성 단방향이기 때문
			
		}
	}

}
