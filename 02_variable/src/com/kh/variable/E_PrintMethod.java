package com.kh.variable;

public class E_PrintMethod {
	
	String str1 = "�ȳ��ϼ���";
	String str2 = "�ݰ����ϴ�";
	//class�����ȿ� �� ���̶� ���� �޼ҵ忡�� �ּ�ó���ؼ� ���ֵ� ��밡����.
	//class�� ��翵���ȿ� �� �� �ִ� ���� ��������
	
	public void printExample() {
		//String str1 = "�ȳ��ϼ���";
		//String str2 = "�ݰ����ϴ�";
	//printExample �ȿ����� ����� �� �ִ� ������
		//�� �޼ҵ� �ȿ����� ����� �� �ִ� ������ ����������� ���
				
		System.out.print(str1);
		System.out.print(str2);	
		
	}
public void printInExample() {
	//String srt1 = "�ȳ��ϼ���";
	//String srt2 = "�ݰ����ϴ�";
	
	System.out.println(str1);
	System.out.println(str2);
	System.out.println("�����");
}
public void printfExample() {
	//�ȳ��ϼ���, ������Դϴ�. �ݰ����ϴ�.�� ����Ϸ���
	//-------             -------
	//str1                 str2
	System.out.printf("%s,������Դϴ�.%s.",str1,str2);
	//����""�� ���� ����ϰ� ���� ����� ���°� , �ڿ��� ���� ������ ������� ������ ��.
	
	//�ݰ����ϴ�, ���ϰ� ������.
	System.out.printf("%s, ģ�ϰ� ������.", str2);
	
	System.out.println();
	//�ڿ� �ƹ��͵� ���� �ܵ���� ����. �ٹٲ� �ϰڴٴ� �ǹ̷� ���
	//�̴Ϲ���
	//�ȳ��ϼ���, ���� 20�� ����� �л��Դϴ�. ������ �ݰ����ϴ�.
	int age =20;
	String name = "�����";
	String job = "�л�";
	
	System.out.printf("%s, ���� %d�� %s %s�Դϴ�. ������ %s.", str1,age,name,job,str2);
	
	
}
}
