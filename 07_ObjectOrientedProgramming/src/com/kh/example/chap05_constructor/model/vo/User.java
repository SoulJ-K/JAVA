package com.kh.example.chap05_constructor.model.vo;

import java.util.Date;

//오버로딩 연습
public class User {
	// -userId : String
	// -userPwd : String
	// -userName : String
	// -enrollDate : Date(java.util)
	
//	private String userId;
//	private String userPwd;
//	private String userName;
//	private Date enrollDate;
//	
//	public void inform() {
//		System.out.println(userId + ", " + userPwd + ", " + userName + ", " + enrollDate);
//	}
	
	//초기화가 안되어있어서 JVM 기본값으로 만들어짐.
	
	private String userId;
	private String userPwd;
	private String userName;
	private Date enrollDate;
	
	//생성자 사용 목적
	//	1. 객체 생성 목적
	//	2. 매개변수(외부에서 받아오는 값을 받아오는 것)로 전달받은 값으로 필드 초기화
	
	//생성자 사용 규칙
	//	1. 생성자명은 class명과 동일해야한다.
	//	2. 반환형(리턴형)이 존재하지 않음
	
	
	public User() {} //기본 생성자. 메소드와 차이는 반환형이 없음 : 매개변수가 없는 생성자
	// JVM이 기본적으로 생성해줌
	// 매개변수 있는 생성자를 만들면 JVM이 자동으로 생성해주지 않기 때문에 반드시 명명해야함
	
//	public User() {}
	//Duplicate method User() in type User
	//같은 이름의 생성자(메소드)가 있을 때 오버로딩이 적용되지 않으면 에러 발생
	
	public User(String userId, String userPwd) {
//		System.out.println(id);
//		System.out.println(pwd);
		
		this.userId = userId;
		this.userPwd = userPwd;
		//메소드 안에서는 지역변수가 우선순위가 됨
		//같은 공간안에 같은 값을 넣고 있음
//		The assignment to variable userId has no effect
		//this.userId -> 전역변수의 userId인 나 자신을 부름
	}
	
	
	public User(String userId, String userPwd, String userName) {
//		this.userId = userId;
//		this.userPwd = userPwd;
		this(userId,userPwd);
		//this생성자를 통해 위에 있는 것을 불러옴(위에 있는 나의 생성자를 불러옴)
		this.userName = userName;
	}
	
	public User(String userId, String userPwd, String userName, Date enrollDate) {
		this(userId,userPwd,userName);
		this.enrollDate = enrollDate;
	}

	
//	public User(String id, String name) {
//		userId = id;
//		userName = name;
		//매개변수명이 다른것과는 상관 없다.
		//타입이 달라야 다르게 해석
//		
//	}
	public void inform() {
//		System.out.println(this);
		System.out.println(userId + ", " + userPwd + ", " + userName + ", " + enrollDate);
	}


}


















