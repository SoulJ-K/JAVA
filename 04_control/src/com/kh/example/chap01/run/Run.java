package com.kh.example.chap01.run;

import com.kh.example.chap01.condition.A_if;
import com.kh.example.chap01.condition.B_IfElse;
import com.kh.example.chap01.condition.C_IfElseIf;
import com.kh.example.chap01.condition.D_Switch;

public class Run {
	public static void main (String[] args) {
		A_if ai = new A_if();
		//ai.method1();
		//ai.method2();
		B_IfElse bi = new B_IfElse();
		//bi.method3();
		C_IfElseIf ci = new C_IfElseIf();
//		ci.method1();
		
		D_Switch ds = new D_Switch();
		//ds.method1();
		//ds.method2();
		ds.method3();
		
		
		
		
		
		
	}

}
