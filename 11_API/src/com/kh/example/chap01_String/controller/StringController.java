package com.kh.example.chap01_String.controller;

import java.util.StringTokenizer;

public class StringController {
	public void method1() {
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
		
		System.out.println("str1�� str2�� �ּҴ� ������?  : " + (str1 == str2));
		System.out.println("str1�� str3�� �ּҴ� ������?  : " + (str1 == str3));
		
		System.out.println("str1�� hashCode : " + str1.hashCode());
		System.out.println("str2�� hashCode : " + str2.hashCode());
		System.out.println("str3�� hashCode : " + str3.hashCode());
		
		System.out.println("str1�� ���ּҰ� : " + System.identityHashCode(str1));
		System.out.println("str2�� ���ּҰ� : " + System.identityHashCode(str2));
		
		
		//str1,str2�� String pool�� ����ǰ� ���� ���� �޾ƿͼ� �ּҰ��� ����
		//str3�� new������ ���� heap�� �� �ּҰ��� ����
		
		
		str2 += "oracle";
		System.out.println("str1�� str2�� �ּҴ� ������?" + (str1 == str2));
		System.out.println("str1�� ���ּҰ� : " + System.identityHashCode(str1));
		System.out.println("str2�� ���ּҰ� : " + System.identityHashCode(str2));
		System.out.println("str3�� ���ּҰ� : " + System.identityHashCode(str3));
	}
	
	public void method2() {
		//StringBuffer Test
		//����ؼ� ���� �����ؾ��� �� String���� ��� ���� ���� ����� ���� ��ġ�� �ٲ��ֱ� ������
		//������ �÷��Ͱ� ��� �������ϴ� ������ ����(�Һ��̶�� Ư¡ ����)
		//������ ���� �б⸸ �ϴ� ��쿡�� �Һ� Ŭ������ StringŬ������ �����ϰ�����
		//�����ؾ��ϴ� ���� ���� ��� StringBuffer�� StringBuilder�� �ϴ°� �� ȿ������
		
		StringBuffer buffer1 = new StringBuffer();
		System.out.println("�ʱ� buffer1�� ���뷮 : " + buffer1.capacity()); //���뷮
		System.out.println("berffer1�� ����ִ� ���� ���� ���� : " + buffer1.length());
		
		System.out.println();
		
		StringBuffer buffer2 = new StringBuffer(100);
		System.out.println("�ʱ� buffer2�� ���뷮 : " + buffer2.capacity());
		System.out.println("buffer2�� ����ִ� ���� ���� ���� : " + buffer2.length());
		
		System.out.println();
		
		StringBuffer buffer3 = new StringBuffer("abc");
		System.out.println("�ʱ� buffer3�� ���뷮 : " + buffer3.capacity());
		System.out.println("buffer3�� ����ִ� ���� ���� ���� : " + buffer3.length());
		
		System.out.println();
		
		StringBuilder builder = new StringBuilder("abc");
		System.out.println("�ʱ� builder�� ���뷮 : " + builder.capacity());
		System.out.println("builder�� ����ִ� ���� ���� ���� : " + builder.length());
		
		System.out.println();
		builder.append("abc");   //���� ���� ���� �ְڴٴ� �ǹ� append  //StringBuilder�� ��ȯ��
		System.out.println("abc �߰� �Ŀ� builder : " + builder);
		System.out.println("abc �߰� �Ŀ� builder �뷮 : " + builder.capacity());
		System.out.println("abc �߰� �Ŀ� builder ���� : " + builder.length());
		
		System.out.println();
		builder.append("def");   //���� ���� ���� �ְڴٴ� �ǹ� append
		System.out.println("def �߰� �Ŀ� builder : " + builder);
		System.out.println("def �߰� �Ŀ� builder �뷮 : " + builder.capacity());
		System.out.println("def �߰� �Ŀ� builder ���� : " + builder.length());
		
		//���� �� �ܶ��� �ѹ��� �߰��ϴ� ���
//		builder.append("abc").append("def");
		//�޼ҵ� ü�̴� �޼ҵ�.�޼ҵ� �̷��� �����ϴ� ��
		//builder.append("abc") ��ü�� stringbuilder�� ��ȯ�ϴ� stringbuilder�� �Ǳ⶧���� �޼ҵ� ü�̴��� ��������
		//append�� builder�ȿ� �ִ� �޼ҵ�. �տ� builder.append("abc")�� ��Ʈ������ �޼ҵ尡 �Ǳ⶧���� ���� ����
		
//		builder.append("ghi").toString().equals("abcdefghi");
//		---------------------
//		StringBuilder
//		--------------------------------
//					String
//		���� �޼ҵ尡 �����ΰ��� ���� �޼ҵ� ü�̴��� ��������.
//		builder.append("ghi")������ StringBuilder --> StringBuilder �ȿ� �ִ� tostring�� �ҷ��ͼ� String���� �ٲ�
		
		System.out.println("abc, def �߰� ���� builder : " + builder);
		System.out.println("abc, def �߰� ���� builder�� �뷮 : " + builder.capacity());
		System.out.println("abc, def �߰� ���� builder�� ���� : " + builder.length());
		
		builder.insert(2, "zzz");
		System.out.println("�ε��� 2�� zzz �߰� ���� builder : " + builder);
		
		System.out.println();
		
		builder.delete(2, 5); // start <= �ε��� < end   //java����
		System.out.println("�ε��� 2���� 5���� ���� ���� builder : " + builder);
		
		System.out.println();
		
		builder.reverse();    //�Ųٷ� ���
		System.out.println("reverse ���� builder : " + builder);
		
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
		//	String�� index��° char��ȯ
		char ch = str.charAt(4);
		System.out.println(ch);
		
		//2. concat(String str):String
		//	�Ű������� ���� ���� ���� String�� ���� �̾���� ��(String)�� ��ȯ
		String concatStr = str.concat("!!!");
		System.out.println("concatStr : " + concatStr);
		
		str += "!!!";
		System.out.println(str);
		
		
		//3. equals():boolean
		System.out.println("concatStr.equals(str) : " + concatStr.equals(str));
		//!!! 3�� �ٿ��� 
		
		//4. substring(int beginIndex):String
		System.out.println("str.substring(6) : " + str.substring(6));
		// �ش� ���ں��� ������ ���
		
	    // subStirng(int beginIndex, int endIndex):String
		System.out.println("str.substring(0,5) : " + str.substring(0, 5));
		//substring = String�� �Ϻθ� ��ȯ
		//�Ű������� 1���� = �� �ε������� ������ ��ȯ
		//�Ű������� 2���� = �����ε������� <=  < �� �ε�������
		 
		//5. replace(char oldCahr, char newChar):String
		//	���� char�� ���ο� char�� ��ü�Ͽ� ��ȯ
		System.out.println("str.replace('l','e') : "+ str.replace('l', 'e'));
		
		//6. toUpperCase()/toLowerCase():String
		System.out.println("str.toUpperCase() : " + str.toUpperCase());
		System.out.println("str.toLowerCase() : " + str.toLowerCase());
		//��� �빮�� Ȥ�� �ҹ��ڷ� �ٲ� ��ȯ
		
		//7. equalsIgnoreCase():boolean
		String str2 = "Wonderful";
		String str3 = "wonderful";
		System.out.println("str2.equals(str3) : " + str2.equals(str3));
		System.out.println("str2.equalsIgnoreCase(str3) : " + str2.equalsIgnoreCase(str3));
		//equalsIgnoreCase - ��ҹ��� �������� �ʰ� ��
		
		//8. trim():String
		//	��/�ڿ� �ִ� ���� ������ ���ڿ� ��ȯ
		String str4 = "          java";
		String str5 = "java          ";
		String str6 = "    java      ";
		System.out.println(str4 + "| str4.trim() : " + str4.trim());
		System.out.println(str5 + "| str5.trim() : " + str5.trim());
		System.out.println(str6 + "| str6.trim() : " + str6.trim());
		
		//9. split(String str):String[]
		//		���ڿ��� �и��Ͽ� �迭�� ��� ��ȯ
		String splitStr = "Java, Oracle, JDBC, Front, Server, Framwork";
		String[] splitArr = splitStr.split(", ");
//		System.out.println("�и��� ���ڿ� ����(split) : " + splitArr.length);
		
//		for(int i = 0; i < splitArr.length; i++) {
//			System.out.println("�и��� ���ڿ� : " + splitArr[i]);
//		}
//		�и��� ���ڿ� : Java
//		�и��� ���ڿ� : Oracle
//		�и��� ���ڿ� : JDBC
//		�и��� ���ڿ� : Front
//		�и��� ���ڿ� : Server
//		�и��� ���ڿ� : Framwork
		
		//���� for��(for-each��)
		for(String s: splitArr) {
			System.out.println(s);
		}
		
		//for(�ް���� �ڷ����� �̸� : ������ ���� ��){}   
		//for���� ó������ ������ �ݺ�
		
	}
	
	public void method4() {
		String str = "Java, Oracle, JDBC, Front, Server, Framwork";
		StringTokenizer stObj = new StringTokenizer(str, ", ");
		System.out.println("�и��� ���ڿ� ���� : " + stObj.countTokens());
		while(stObj.hasMoreTokens()) {      //hasMoreTokens ������ ��ū �ִ��� ���°�
			System.out.println(stObj.nextToken());    //nextToken�� ������ �ִ°� �������� ��
		}
		
		System.out.println("���� ���� ���� ���ڿ� ���� : " + stObj.countTokens());
		
		System.out.println();
		
		String str2 = "Apple,Banana-Cream*Dessert#Egg Fruits";
		StringTokenizer stObj2 = new StringTokenizer(str2, ", -*#");
		System.out.println("�и��� ���ڿ� ���� : " + stObj2.countTokens());
		while(stObj2.hasMoreTokens()) {
			System.out.println(stObj2.nextToken());
		}
		//split()�� StringTokenizer�� ������
		//1. �и��� ���ڿ��� String[]�� ó���ϰ� ���� �� split()
		//   �и��� ���ڿ��� ��ü�� ó���ϰ� ���� �� StringTokenizerŬ����
		
		//2. split()�޼ҵ��� �����ڴ� 1��
		//	 StringTokenizer Ŭ������ �����ڴ� ������
		
		
	}
	 
}
