package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryController {
	private Member mem = null;
//	private Book[] bList = {CookBook("�������� ����", "������", "tvN", true),
//	AniBook("�ѹ� �� �ؿ�", "��Ƽ", "�����", 19), 
//	AniBook("������ ���ǽ�", "����", "japan", 12),
//	CookBook("�������� �󸶳� ���ְԿ�", "������", "����", false),
//	CookBook("������ �� �����غ�", "������", "�ұ�å", true)}
	
	
	
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
