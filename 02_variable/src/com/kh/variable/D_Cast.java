package com.kh.variable;

public class D_Cast {
	public void rule1() {
		boolean flag = true;
		//boolean flag2 = 100;
		//boolean은 형변환 불가. 무조건 true & false
		
		int num = 'A';
		System.out.println("nun :" +num);
		
		char ch = 97;
		System.out.println("ch:"+ch);
		
		char ch2 = (char)num;
		//Type mismatch: cannot convert from int to char
		//97은 리터럴(값)이기 때문에 num은 변수이다. 변수의 값이 아닌 변수의 크기만 보여서 에러발생
		//num은 4바이트 char는 2바이트기 때문에 강제형변환이 이루어져 앞에 char로 바꾼다고 명시
		System.out.println("ch2:"+ch2);
		
		int num2=-97;
		char ch3=(char)num2;
		System.out.println("ch3:"+ch3);
		//char는 정수만 표현가능함. 넣는 수가 음수여서 char에서 찾을 수 없는 단어라고 ?가 나옴
	}
	public void rule2() {
		int iNum = 10;
		long lNum = 100;
		
	//	int result = iNum+lNum
	// to complete LocalVariableDeclarationStatement
	//iNum이 lNum으로 자동형변환되서 long형으로 연산되었는데 앞에 int값으로 결과를 낸다고 해서 오류뜸
	
    //iNum+lNumdmf int result에 저장할 수 있는 방법
	//방법1. 수행결과를 int로 강제형변환
		int result = (int)(iNum+lNum);
		
    //방법2. long형을 int로 강제 형변환
		int result2 = iNum+(int)lNum;
		
    //번외. 결과값을 저장하는 result를 long형으로 받음
		long result3 = iNum+lNum;
	}
	
	public void rule3() {
		int iNum = 290;
		
		byte bNum = (byte)iNum;
		
		System.out.println("bNum:"+bNum);
		// int 290이 byte안으로 들어갈 때 데이터 손실이 일어나 남은 데이터인 34로 값이 뜸
		
	}

}
