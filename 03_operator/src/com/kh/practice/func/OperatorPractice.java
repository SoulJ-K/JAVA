package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	String str = "����Դϴ�";
	
	//���׿����� ��������
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
//		sc.nextLine();
		String re = num > 0 ? str : "����� �ƴմϴ�";
		System.out.println(re);
//		System.out.println(num > 0 ? "����Դϴ�" : "����� �ƴմϴ�");
	
		
	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int nu = sc.nextInt();
		String ree = nu > 0 ? str : (nu == 0 ? "0�Դϴ�" : "�����Դϴ�");
		System.out.println(ree);		
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int two = sc.nextInt();
		String res = two %2 == 0 ?  "¦���Դϴ�" : "Ȧ���Դϴ�";
		System.out.println(res);		
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ο� �� : ");
		int pe = sc.nextInt();
		
		System.out.print("���� ���� : ");
		int candy = sc.nextInt();
		
		System.out.println("1�δ� ���� ����  : " + (candy/pe));
		System.out.println("���� ���� ����  : " + (candy%pe));
				
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("�г� (���ڸ�): ");
		int grade = sc.nextInt();
		sc.nextLine();
		
		System.out.print("��(���ڸ�) : ");
		int cl = sc.nextInt();
		sc.nextLine();
		
		System.out.print("��ȣ(���ڸ�) : ");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.print("����(M/F): ");
		String user = sc.nextLine();
		char ge = user.charAt(0);
		String gender = ge == 'M' ? "���л�" : "���л�";
		
		System.out.print("����(�Ҽ��� �Ʒ� ��°�ڸ�����) : ");
		double gr = sc.nextDouble();
		sc.nextLine();
		
		//int & float ���� �ܼ�â�� ���� ��� ��
		//float & double ���� �Ҽ��� ���ڸ����� ����
		System.out.printf("%d�г� %d��  %d�� %s %s�� ������ %g�̴�.",grade,cl,number,name,gender,gr );		
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int age = sc.nextInt();
		String ag = age < 13 ? "���" : (age>13 && age <= 19 ? "û�ҳ�" : "����");
		
		System.out.println(ag);		
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� :");
		int ko = sc.nextInt();
		
		System.out.print("���� :");
		int en = sc.nextInt();
		
		System.out.print("���� :");
		int ma = sc.nextInt();
		
		int pl = ko + en + ma;
		
		double ev = pl/3;
		
		System.out.println(pl);
		System.out.println(ev);
		
		String sr = ko >=40 && en >= 40 && ma >= 40 && ev >= 60 ? "�հ�" : "���հ�";
		
		System.out.println(sr);	
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ֹι�ȣ�� �Է��ϼ���(- ����) : ");
		String pe = sc.nextLine();
//		char rs = pe.charAt(6);
		String se = pe.charAt(7) == '2'? "����" : "����";
		System.out.println(se);
		
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("����2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("�Է� : ");
		int num3 = sc.nextInt();
		
		boolean tr = (num3 <= num1 || num3 > num2);
		
		System.out.println(tr);
		
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է�1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("�Է�2 : ");
		int num2 = sc.nextInt();

		System.out.print("�Է�3 : ");
		int num3 = sc.nextInt();
		
		boolean err = (num1 ==num2 && num3== num2 && num1== num3);
		System.out.println(err);
		
	}
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("A����� ���� : ");
		int num1 = sc.nextInt();
		
//		System.out.print("B����� ���� : ");
//		int num2 = sc.nextInt();
//		
//		System.out.print("C����� ���� : ");
//		int num3 = sc.nextInt();
		
		double a = num1 * 0.4;
//		double b = num2 + 0;
//		double c = num3 * 0.15;
		
		
		String aa = a > 3000 ? "3000�̻�" : "3000�̸�";
//		String bb = b> 3000  ? "3000�̻�" : "3000�̸�";
//		String cc = c > 3000 ? "3000�̻�" : "3000�̸�";
//		
		System.out.printf("A����� ���� / ����+a : %d/%g", num1 , (num1+a));
//		1. 3500.00���� ����. �Ҽ��� ���ڸ��� ��ü ��� �ϴ°�...
		System.out.println();
		System.out.println(aa);
		
//		System.out.printf("B����� ���� / ����+a : %d/%d.00", num2 , num2);
//		System.out.println(bb);
//		
//		System.out.printf("C����� ���� / ����+a : %d/%g", num3 , (num3+c));
//		System.out.println(cc);
	
}
}