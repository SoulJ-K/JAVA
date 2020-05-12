package com.kh.practice.charCheck.controller;

import java.util.StringTokenizer;

import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {
	
	public CharacterController() {}
	
	public int countAlpha(String s) throws CharCheckException{
//		char al[] = new char[26];
//		int count[] = new int[26];
//		
//		char Al[] = new char[26];
//		int co[] = new int[26];
//		
//		for(int i = 0; i<=al.length; i++) {
//			al[i] = (char)(i+97);
//		}
//		
//		for(int i = 0; i<=Al.length; i++) {
//			Al[i] = (char)(i+1);
//		}
//		
//		for(int i = 0; i<al.length; i++) {
//			for(int j = 0; j<s.length(); j++) {
//				if(al[i] == s.charAt(j)) {
//					count[i]++;
//				}
//			}
//		}
//		
//		for(int i = 0; i<Al.length; i++) {
//			for(int j = 0; j<s.length(); j++) {
//				if(Al[i] == s.charAt(j)) {
//					co[i]++;
//				}
//			}
//		}
//		
//		if(s.isEmpty()) {
//			
//		}else {
//			return 
//		}
		
		StringTokenizer st = new StringTokenizer(s, " ");
		
		if(st.countTokens()>=1) {
			throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
		} else {
			for(int i = 0; i < s.length(); i++) {
				
			}
			
		}
	}

}

