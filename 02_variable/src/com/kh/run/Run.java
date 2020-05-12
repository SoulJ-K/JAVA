package com.kh.run;

import com.kh.variable.A_Variable;
import com.kh.variable.B_Constant;
import com.kh.variable.C_Overflow;
import com.kh.variable.D_Cast;
import com.kh.variable.E_PrintMethod;
import com.kh.variable.F_keyboardinput;

public class Run {
public static void main(String[] args) {
	A_Variable av = new A_Variable();
//	av.declareVariable();
	//av.initVariable();
	B_Constant bc = new B_Constant();
	//bc.finalConstant();
	C_Overflow co = new C_Overflow();
	//co.overflow();
	//co.calc();
	D_Cast dc = new D_Cast();
	//dc.rule1();
	//dc.rule3();
	E_PrintMethod ep = new E_PrintMethod();
	//ep.printExample();
	//ep.printInExample();
	//ep.printfExample();
	F_keyboardinput fk = new F_keyboardinput();
	//fk.inputScanner();
	fk.inputScanner2();
	
	
	
	
	
	
}
}
