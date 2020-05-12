package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.Employee;

public class Run {
	public static void main(String[] args) {
		Employee em = new Employee();
		
		em.setEmpNo(100);
		em.setEmpName("홍길동");
		em.setDept("영업부");
		em.setJob("과장");
		em.setAge(25);
		em.setGender('남');
		em.setSalary(2500000);
		em.setBonusPoint(0.05);
		em.setPhone("010-1234-5678");
		em.setAddress("서울시 강남구");
				
		
		
		System.out.println(em.getEmpNo());
		System.out.println(em.getEmpName());
		System.out.println(em.getDept());
		System.out.println(em.getJob());
		System.out.println(em.getAge());
		System.out.println(em.getGender());
		System.out.println(em.getSalary());
		System.out.println(em.getBonusPoint());
		System.out.println(em.getPhone());
		System.out.println(em.getAddress());
	}
	

}
