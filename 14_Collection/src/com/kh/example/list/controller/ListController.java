package com.kh.example.list.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.example.list.model.compare.StudentComparator;
import com.kh.example.list.model.vo.Student;

public class ListController {
	public void doList() {
		List list1 = new ArrayList();
//		list1.
		List<Student> list = new ArrayList<Student>(3);   //기본적으로 10개짜리가 만들어지는데 (3)을 넣음으로서 3개짜리가 만들어짐.
		//								   -------
		//									이 부분은 생략 가능하나 <>는 꼭 넣어야함
		
		//add(E e) : 리스트 끝에 데이터 e 추가
		list.add(new Student("테스트", 0));
		list.add(new Student("도대담", 60));
		
		System.out.println("list : " + list);
		
		//컬렉션 장점 1. 크기의 제약이 없다.
		list.add(new Student("남나눔", 90));
		list.add(new Student("하현호", 85));
		
		System.out.println("현재 list에 담긴  element 개수 : " + list.size());
		System.out.println("list : " + list);

		//컬렉션 장점2. 추가/삭제/정렬 등의 기능처리가 간단하다
		// add(int index, E e) : index번째 인덱스에 e 추가
		list.add(new Student("문미미", 66));
		System.out.println("현재 list에 담긴  element 개수 : " + list.size());
		System.out.println("list : " + list);
		
		list.add(0, new Student("류라라", 100));
		System.out.println("list : " + list);
		
		list.add(3, new Student("강건강", 40));
		System.out.println("list : " + list);

		//remove(int index) : 해당 index번째 객체 삭제
		list.remove(1);
		System.out.println("list : " + list);
		
		//remove(Object o) : 해당 object객체 삭제
		list.remove(new Student("강건강", 40));
		System.out.println("list : " + list);
		// new 연산자로 계속 student를 생성중. 그래서 위에 만든 강건강과 밑에 만든 강건강은 다른 객체임(다른 주소값을 가지고 있기 때문)
		//Object class에 있는 equlse method, hashcode method를 overriding해서 주소값이 아니라 필드값을 비교하게 재정의해야함.
		//재정의 방법 - 주소값을 비교하는게 아니라 안에 들어가는 필드값을 비교하는 것
		
		//정렬방법 1. collections 클래스 이용 - 컬렉션에서 사용하는 유용한 메소드 모아놓은 것
		Collections.sort(list);   //정렬기준이 없음
		System.out.println("이름 오름차순 : " + list);
		
		//정렬방법 2. List.sort() 메소드 이용
		list.add(new Student("박보배", 85));
		list.sort(new StudentComparator());
		System.out.println("점수 오름차순 : " + list);
		
//		ArrayList<String> strList = new ArrayList<String>();
//		strList.add("저녁시간");
//		strList.add("점심시간");
//		strList.add("퇴근시간");
//		strList.add("기상시간");
//		strList.add("출근시간");
//		strList.add("취침시간");
//		
//		System.out.println(strList);
//		Collections.sort(strList);
//
//		//string에 대한 정렬기준이 있으므로 자동으로 오름차순으로 정렬됨
//		System.out.println(strList);
		
		//set(int index, E e) : index번째 인덱스에 있는 요소를 e로 수정
		list.set(2, new Student("도대담", 31));
		System.out.println("list : " + list);
		
		//get(int indext) : index번째 인덱스에 있는 요소를 가지고 옴
		Student s = list.get(2);
		System.out.println(s);
		System.out.println("list : " + list);
		
		//subList(int index1, int index2) : index1번째 인덱스부터 index2번째 인덱스까지 리스트 반환
		System.out.println("list 추출 : " + list.subList(2, 5));
		
		//contains(Object o) : o가 리스트에 존재한다면  true반환 
		//indexOf(Object o) : o가 리스트에 위치하는 인덱스 번호 반환, 없다면 -1 반환
		System.out.println("남나눔, 90이 있는가? " + list.contains(new Student("남나눔", 90)));
		System.out.println("남나눔, 90의 인덱스 위치는? " + list.indexOf(new Student("남나눔", 90)));
		System.out.println("테스트, 0의 인덱스 위치는? " + list.indexOf(new Student("테스트", 0)));
		
		//clear() : 저장된 모든 객체 삭제
		//isEmpty() : 리스트가 비었을 때 true 반환
		list.clear();
		System.out.println("list : " + list);
		System.out.println("list가 비었나요? " + list.isEmpty());
		}

}

