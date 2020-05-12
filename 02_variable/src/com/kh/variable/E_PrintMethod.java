package com.kh.variable;

public class E_PrintMethod {
	
	String str1 = "안녕하세요";
	String str2 = "반갑습니다";
	//class영역안에 들어간 값이라 밑의 메소드에서 주석처리해서 없애도 사용가능함.
	//class의 모든영역안에 들어갈 수 있는 값을 전역변수
	
	public void printExample() {
		//String str1 = "안녕하세요";
		//String str2 = "반갑습니다";
	//printExample 안에서만 사용할 수 있는 변수들
		//각 메소드 안에서만 사용할 수 있는 변수를 지역변수라고 명명
				
		System.out.print(str1);
		System.out.print(str2);	
		
	}
public void printInExample() {
	//String srt1 = "안녕하세요";
	//String srt2 = "반갑습니다";
	
	System.out.println(str1);
	System.out.println(str2);
	System.out.println("김솔지");
}
public void printfExample() {
	//안녕하세요, 김솔지입니다. 반갑습니다.를 출력하려함
	//-------             -------
	//str1                 str2
	System.out.printf("%s,김솔지입니다.%s.",str1,str2);
	//앞의""은 내가 출력하고 싶은 모양을 적는것 , 뒤에는 넣을 내용을 순서대로 넣으면 됨.
	
	//반갑습니다, 진하게 지내요.
	System.out.printf("%s, 친하게 지내요.", str2);
	
	System.out.println();
	//뒤에 아무것도 없이 단독사용 가능. 줄바꿈 하겠다는 의미로 사용
	//미니문제
	//안녕하세요, 저는 20살 김솔지 학생입니다. 만나서 반갑습니다.
	int age =20;
	String name = "김솔지";
	String job = "학생";
	
	System.out.printf("%s, 저는 %d살 %s %s입니다. 만나서 %s.", str1,age,name,job,str2);
	
	
}
}
