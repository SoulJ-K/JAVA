package com.kh.example.list.model.compare;

import java.util.Comparator;

import com.kh.example.list.model.vo.Student;

public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		//점수 오름차순
		//비교 주체가 비교대상보다 크면 양수
		//비교 주체가 비교대상보다 작으면 음수
		//비교 주체가 비교대상과 같으면 0 반환
		
		int standard = o1.getScore();   //주체
		int object = o2.getScore();  	//대상
		
		String standardName = o1.getName();
		String objectdName = o2.getName();
		
		if(standard > object) {
			return 1;
		}else if (standard == object) {
			return standardName.compareTo(objectdName);
//			return 0;
		}else {
			return -1;
			}
		
	}

}
