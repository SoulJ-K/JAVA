package com.kh.example.chap05_constructor.model.vo;

import java.util.Date;

//�����ε� ����
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
	
	//�ʱ�ȭ�� �ȵǾ��־ JVM �⺻������ �������.
	
	private String userId;
	private String userPwd;
	private String userName;
	private Date enrollDate;
	
	//������ ��� ����
	//	1. ��ü ���� ����
	//	2. �Ű�����(�ܺο��� �޾ƿ��� ���� �޾ƿ��� ��)�� ���޹��� ������ �ʵ� �ʱ�ȭ
	
	//������ ��� ��Ģ
	//	1. �����ڸ��� class��� �����ؾ��Ѵ�.
	//	2. ��ȯ��(������)�� �������� ����
	
	
	public User() {} //�⺻ ������. �޼ҵ�� ���̴� ��ȯ���� ���� : �Ű������� ���� ������
	// JVM�� �⺻������ ��������
	// �Ű����� �ִ� �����ڸ� ����� JVM�� �ڵ����� ���������� �ʱ� ������ �ݵ�� ����ؾ���
	
//	public User() {}
	//Duplicate method User() in type User
	//���� �̸��� ������(�޼ҵ�)�� ���� �� �����ε��� ������� ������ ���� �߻�
	
	public User(String userId, String userPwd) {
//		System.out.println(id);
//		System.out.println(pwd);
		
		this.userId = userId;
		this.userPwd = userPwd;
		//�޼ҵ� �ȿ����� ���������� �켱������ ��
		//���� �����ȿ� ���� ���� �ְ� ����
//		The assignment to variable userId has no effect
		//this.userId -> ���������� userId�� �� �ڽ��� �θ�
	}
	
	
	public User(String userId, String userPwd, String userName) {
//		this.userId = userId;
//		this.userPwd = userPwd;
		this(userId,userPwd);
		//this�����ڸ� ���� ���� �ִ� ���� �ҷ���(���� �ִ� ���� �����ڸ� �ҷ���)
		this.userName = userName;
	}
	
	public User(String userId, String userPwd, String userName, Date enrollDate) {
		this(userId,userPwd,userName);
		this.enrollDate = enrollDate;
	}

	
//	public User(String id, String name) {
//		userId = id;
//		userName = name;
		//�Ű��������� �ٸ��Ͱ��� ��� ����.
		//Ÿ���� �޶�� �ٸ��� �ؼ�
//		
//	}
	public void inform() {
//		System.out.println(this);
		System.out.println(userId + ", " + userPwd + ", " + userName + ", " + enrollDate);
	}


}


















