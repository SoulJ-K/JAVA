package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.Employee;

public class Run {
	public static void main(String[] args) {
		Employee em = new Employee();
		
		em.setEmpNo(100);
		em.setEmpName("ȫ�浿");
		em.setDept("������");
		em.setJob("����");
		em.setAge(25);
		em.setGender('��');
		em.setSalary(2500000);
		em.setBonusPoint(0.05);
		em.setPhone("010-1234-5678");
		em.setAddress("����� ������");
				
		
		
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
