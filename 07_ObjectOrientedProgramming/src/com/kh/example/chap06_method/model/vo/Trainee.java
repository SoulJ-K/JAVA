package com.kh.example.chap06_method.model.vo;

public class Trainee {
	//필드 선언
	private String name;
	private final String ACADEMY = "KH";
	private char classRoom;
	private static double score;
	
	
	public Trainee() {}
	public Trainee(String name, char classRoom, double score) {
		this.name = name;
		this.classRoom = classRoom;
		Trainee.score = score;
	}
	
	public Trainee(String name) {
		this.name = name;
	}
	
	//필드에 있는 name을 받아온 매개변수를 통해 초기화 시키는 setter
	public void setName(String name) {
		this.name = name;
	}
	
	//필드에 있는 classroom을 받아온 매개변수를 통해 초기화 시키는 setter
	public void setClassRoom(char classRoom) {
		this.classRoom = classRoom;
	}
	
	//필드에 있는 score을 받아온 매개변수를 통해 초기화 시키는 setter
	public static void setScore(double score) {
		Trainee.score = score;
	}

	//필드에 있는 name을 반환하는 getter
	public String getName() {
		return name;
	}
	
	//필드에 있는 ACADEMY를 반환하는 getter
	public String getACADEMY() {
		return ACADEMY;
	}
	
	//필드에 있는 classroom을 반환하는 getter
	public char getClassRoom() {
		return classRoom;
	}
	
	//필드에 있는 score을 반환하는 getter
	public static double getScore() {
		return score;
	}
	
	public String inform( ) {
		return name + ", " + ACADEMY + ", " + classRoom + ", " + score;
	}
}
