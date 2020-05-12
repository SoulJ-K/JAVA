package com.kh.example.chap01_String.controller;

import java.util.StringTokenizer;

public class StringController {
	public void method1() {
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
		
		System.out.println("str1과 str2의 주소는 같은가?  : " + (str1 == str2));
		System.out.println("str1과 str3의 주소는 같은가?  : " + (str1 == str3));
		
		System.out.println("str1의 hashCode : " + str1.hashCode());
		System.out.println("str2의 hashCode : " + str2.hashCode());
		System.out.println("str3의 hashCode : " + str3.hashCode());
		
		System.out.println("str1의 실주소값 : " + System.identityHashCode(str1));
		System.out.println("str2의 실주소값 : " + System.identityHashCode(str2));
		
		
		//str1,str2는 String pool에 저장되고 같은 값을 받아와서 주소값이 같음
		//str3은 new연산자 통해 heap에 새 주소값이 생김
		
		
		str2 += "oracle";
		System.out.println("str1과 str2의 주소는 같은가?" + (str1 == str2));
		System.out.println("str1의 실주소값 : " + System.identityHashCode(str1));
		System.out.println("str2의 실주소값 : " + System.identityHashCode(str2));
		System.out.println("str3의 실주소값 : " + System.identityHashCode(str3));
	}
	
	public void method2() {
		//StringBuffer Test
		//계속해서 값을 변경해야할 때 String같은 경우 값이 새로 생기고 참조 위치만 바꿔주기 때문에
		//가비지 컬렉터가 계속 지워야하는 단점이 있음(불변이라는 특징 때문)
		//변경이 적고 읽기만 하는 경우에는 불변 클래스인 String클래스가 용이하겠지만
		//변경해야하는 값이 많은 경우 StringBuffer나 StringBuilder로 하는게 더 효율적임
		
		StringBuffer buffer1 = new StringBuffer();
		System.out.println("초기 buffer1의 수용량 : " + buffer1.capacity()); //수용량
		System.out.println("berffer1에 들어있는 실제 값의 길이 : " + buffer1.length());
		
		System.out.println();
		
		StringBuffer buffer2 = new StringBuffer(100);
		System.out.println("초기 buffer2의 수용량 : " + buffer2.capacity());
		System.out.println("buffer2에 들어있는 실제 값이 길이 : " + buffer2.length());
		
		System.out.println();
		
		StringBuffer buffer3 = new StringBuffer("abc");
		System.out.println("초기 buffer3의 수용량 : " + buffer3.capacity());
		System.out.println("buffer3에 들어있는 실제 값이 길이 : " + buffer3.length());
		
		System.out.println();
		
		StringBuilder builder = new StringBuilder("abc");
		System.out.println("초기 builder의 수용량 : " + builder.capacity());
		System.out.println("builder에 들어있는 실제 값의 길이 : " + builder.length());
		
		System.out.println();
		builder.append("abc");   //내가 직접 값을 넣겠다는 의미 append  //StringBuilder가 반환값
		System.out.println("abc 추가 후에 builder : " + builder);
		System.out.println("abc 추가 후에 builder 용량 : " + builder.capacity());
		System.out.println("abc 추가 후에 builder 길이 : " + builder.length());
		
		System.out.println();
		builder.append("def");   //내가 직접 값을 넣겠다는 의미 append
		System.out.println("def 추가 후에 builder : " + builder);
		System.out.println("def 추가 후에 builder 용량 : " + builder.capacity());
		System.out.println("def 추가 후에 builder 길이 : " + builder.length());
		
		//위의 두 단락을 한번에 추가하는 방법
//		builder.append("abc").append("def");
		//메소드 체이닝 메소드.메소드 이렇게 연결하는 것
		//builder.append("abc") 자체가 stringbuilder를 반환하는 stringbuilder가 되기때문에 메소드 체이닝이 가능해짐
		//append는 builder안에 있는 메소드. 앞에 builder.append("abc")가 스트링빌더 메소드가 되기때문에 연결 가능
		
//		builder.append("ghi").toString().equals("abcdefghi");
//		---------------------
//		StringBuilder
//		--------------------------------
//					String
//		앞의 메소드가 무엇인가에 따라 메소드 체이닝이 가능해짐.
//		builder.append("ghi")까지가 StringBuilder --> StringBuilder 안에 있는 tostring을 불러와서 String으로 바뀜
		
		System.out.println("abc, def 추가 후의 builder : " + builder);
		System.out.println("abc, def 추가 후의 builder의 용량 : " + builder.capacity());
		System.out.println("abc, def 추가 후의 builder의 길이 : " + builder.length());
		
		builder.insert(2, "zzz");
		System.out.println("인덱스 2에 zzz 추가 후의 builder : " + builder);
		
		System.out.println();
		
		builder.delete(2, 5); // start <= 인덱스 < end   //java한정
		System.out.println("인덱스 2부터 5까지 삭제 후의 builder : " + builder);
		
		System.out.println();
		
		builder.reverse();    //거꾸로 출력
		System.out.println("reverse 후의 builder : " + builder);
		
		System.out.println();
		
		StringBuilder sb = new StringBuilder("abc");
		sb = sb.append("zzz").insert(2, "yy").reverse().delete(1, 3);
//		---------------------
//		abczzz
//		------------------------------------
//								abyyczzz
//		------------------------------------------------
//											zzzcyyba
//		-------------------------------------------------------------
//															zcyyba
		
		System.out.println(sb);
		
	}
	
	public void method3() {
		String str = "Hello World";
		
		//1. charAt(int index):char
		//	String의 index번째 char반환
		char ch = str.charAt(4);
		System.out.println(ch);
		
		//2. concat(String str):String
		//	매개변수로 들어온 값을 원래 String의 끝에 이어붙인 값(String)을 반환
		String concatStr = str.concat("!!!");
		System.out.println("concatStr : " + concatStr);
		
		str += "!!!";
		System.out.println(str);
		
		
		//3. equals():boolean
		System.out.println("concatStr.equals(str) : " + concatStr.equals(str));
		//!!! 3개 붙여서 
		
		//4. substring(int beginIndex):String
		System.out.println("str.substring(6) : " + str.substring(6));
		// 해당 숫자부터 끝까지 출력
		
	    // subStirng(int beginIndex, int endIndex):String
		System.out.println("str.substring(0,5) : " + str.substring(0, 5));
		//substring = String의 일부를 반환
		//매개변수가 1개면 = 그 인덱스부터 끝까지 반환
		//매개변수가 2개면 = 시작인덱스부터 <=  < 끝 인덱스까지
		 
		//5. replace(char oldCahr, char newChar):String
		//	지정 char를 새로운 char로 대체하여 반환
		System.out.println("str.replace('l','e') : "+ str.replace('l', 'e'));
		
		//6. toUpperCase()/toLowerCase():String
		System.out.println("str.toUpperCase() : " + str.toUpperCase());
		System.out.println("str.toLowerCase() : " + str.toLowerCase());
		//모두 대문자 혹은 소문자로 바꿔 반환
		
		//7. equalsIgnoreCase():boolean
		String str2 = "Wonderful";
		String str3 = "wonderful";
		System.out.println("str2.equals(str3) : " + str2.equals(str3));
		System.out.println("str2.equalsIgnoreCase(str3) : " + str2.equalsIgnoreCase(str3));
		//equalsIgnoreCase - 대소문자 구분하지 않고 비교
		
		//8. trim():String
		//	앞/뒤에 있는 공백 제거한 문자열 반환
		String str4 = "          java";
		String str5 = "java          ";
		String str6 = "    java      ";
		System.out.println(str4 + "| str4.trim() : " + str4.trim());
		System.out.println(str5 + "| str5.trim() : " + str5.trim());
		System.out.println(str6 + "| str6.trim() : " + str6.trim());
		
		//9. split(String str):String[]
		//		문자열을 분리하여 배열에 담아 반환
		String splitStr = "Java, Oracle, JDBC, Front, Server, Framwork";
		String[] splitArr = splitStr.split(", ");
//		System.out.println("분리된 문자열 개수(split) : " + splitArr.length);
		
//		for(int i = 0; i < splitArr.length; i++) {
//			System.out.println("분리된 문자열 : " + splitArr[i]);
//		}
//		분리된 문자열 : Java
//		분리된 문자열 : Oracle
//		분리된 문자열 : JDBC
//		분리된 문자열 : Front
//		분리된 문자열 : Server
//		분리된 문자열 : Framwork
		
		//향상된 for문(for-each문)
		for(String s: splitArr) {
			System.out.println(s);
		}
		
		//for(받고싶은 자료형과 이름 : 돌리고 싶은 것){}   
		//for문은 처음부터 끝까지 반복
		
	}
	
	public void method4() {
		String str = "Java, Oracle, JDBC, Front, Server, Framwork";
		StringTokenizer stObj = new StringTokenizer(str, ", ");
		System.out.println("분리된 문자열 개수 : " + stObj.countTokens());
		while(stObj.hasMoreTokens()) {      //hasMoreTokens 다음에 토큰 있는지 묻는것
			System.out.println(stObj.nextToken());    //nextToken은 다음에 있는걸 가져오는 것
		}
		
		System.out.println("값을 꺼낸 후의 문자열 개수 : " + stObj.countTokens());
		
		System.out.println();
		
		String str2 = "Apple,Banana-Cream*Dessert#Egg Fruits";
		StringTokenizer stObj2 = new StringTokenizer(str2, ", -*#");
		System.out.println("분리된 문자열 개수 : " + stObj2.countTokens());
		while(stObj2.hasMoreTokens()) {
			System.out.println(stObj2.nextToken());
		}
		//split()과 StringTokenizer의 차이점
		//1. 분리한 문자열을 String[]로 처리하고 싶을 때 split()
		//   분리한 문자열을 객체로 처리하고 싶을 때 StringTokenizer클래스
		
		//2. split()메소드의 구분자는 1개
		//	 StringTokenizer 클래스의 구분자는 여러개
		
		
	}
	 
}
