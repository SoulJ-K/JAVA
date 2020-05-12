package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryController {
	private Member mem = null;
//	private Book[] bList = {CookBook("백종원의 집밥", "백종원", "tvN", true),
//	AniBook("한번 더 해요", "미티", "원모어", 19), 
//	AniBook("루피의 원피스", "루피", "japan", 12),
//	CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false),
//	CookBook("최현석 날 따라해봐", "최현석", "소금책", true)}
	
	
	
	public void insertMember(Member mem) {
		this.mem = mem;
	}
	
	public Member myInfo() {
		return mem;
	}
	
//	public Book[] selectAll() {
////		return bList;
//	}
	
//	public Book[] searchBook(String keyword) {
//		
//	}
//	
//	public int rentBook(int index) {
//		this.rentBook(index);
//	}

}
