package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("7. ����");
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		int num = sc.nextInt();
		switch(num) {
		case 1 :
			System.out.println("1. �Է�");
			break;
		case 2 : 
			System.out.println("2. ����");
			break;
		case 3 :
			System.out.println("3. ��ȸ");
			break;
		case 4 :
			System.out.println("4. ����");
			break;
		case 7 :
			System.out.println("���α׷��� ����˴ϴ�.");
			break;
			
		}
		System.out.println("��ȸ�޴��Դϴ�.");
	}
	
	public void practice2() {
		System.out.print("���ڸ� �� �� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		String i;
		if(num < 0 ) {
			i = "����� �Է����ּ���";
		}else if(num %2 == 0) {
			i = "¦����";
		}else {
			i = "Ȧ����";			
		}
		
		System.out.println(i);				
	}
	
	public void practice3() {
		System.out.print("�������� : ");
		int ko = sc.nextInt();
		
		System.out.print("�������� : ");
		int ma = sc.nextInt();
		System.out.print("�������� : ");
		int en = sc.nextInt();
		
		int pl = ko + ma + en;
		double ev = pl/3;
		
		
		if(ko>40 && ma>40 && en>40 && pl >= 60) {
			System.out.println("���� : " + ko);
			System.out.println("���� : " + ma);
			System.out.println("���� : " + en);
			System.out.println("�հ� : " + pl);
			System.out.println("��� : " + ev);
			System.out.println("�����մϴ�, �հ��Դϴ�!");	
		}else {
			System.out.println("���հ��Դϴ�.");
		}
	}
	
	public void practice4() {
		System.out.print("1~12 ������ ���� �Է� : ");
		int i = sc.nextInt();
		
		String k = null;
		switch(i) {
//		case 1  :
//			System.out.println(i + "���� �ܿ��Դϴ�.");
//			break;
//		case 2 :
//			System.out.println(i + "���� �ܿ��Դϴ�.");
//			break;
//		case 3 :
//			System.out.println(i + "���� ���Դϴ�.");
//			break;
//		case 4 : 
//			System.out.println(i + "���� ���Դϴ�.");
//			break;
//		case 5 : 
//			System.out.println(i + "���� ���Դϴ�.");
//			break;
//		case 6 :
//			System.out.println(i + "���� �����Դϴ�.");
//			break;
//		case 7 :
//			System.out.println(i + "���� �����Դϴ�.");
//			break;
//		case 8 :
//			System.out.println(i + "���� �����Դϴ�.");
//			break;
//		case 9 :
//			System.out.println(i + "���� �����Դϴ�.");
//			break;
//		case 10 :
//			System.out.println(i + "���� �����Դϴ�.");
//			break;
//		case 11 :
//			System.out.println(i + "���� �����Դϴ�.");
//			break;
//		case 12 :
//			System.out.println(i + "���� �ܿ��Դϴ�.");
//			break;
//			default :
//				System.out.println(i + "���� �߸� �Էµ� ���Դϴ�.");
		case 1 :
			k = "�ܿ�";
			break;
		case 2 :
			k = "�ܿ�";
			break;
		case 3 :
			k = "��"; break;
		case 4 :
			k = "��"; break;
		case 5 :
			k = "��"; break;
		case 6 :
			k = "����"; break;
		case 7 :
			k = "����"; break;
		case 8 :
			k = "����"; break;
		case 9 :
			k = "����"; break;
		case 10 :
			k = "����"; break;
		case 11 :
			k = "����"; break;
		case 12 :
			k = "�ܿ�"; break;
			
			default : 
				System.out.println(i + "���� �߸� �Էµ� ���Դϴ�.");
		}
		System.out.println(i + "���� " + k + "�Դϴ�.");
		
	}
	
	public void practice5(){ 
		
		System.out.print("���̵� : ");
		String idd = sc.nextLine();
		
		System.out.print("��й�ȣ : ");
		String pas = sc.nextLine();
		
		String id = "myId";
		String pa = "myPassword12";
		
		if(id.equals(idd) && pa.equals(pas) ) {
			System.out.println("�α��� ����");
		}else if(!id.equals(idd) && pa.equals(pas)){
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		}else if(id.equals(idd) && !pa.equals(pas)) {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}
		
	}
	
	public void practice6() {
		System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : ");
		String str = sc.nextLine();
		
		String k = null;
		
		switch(str) {
		case "������" : 
			k = "ȸ������, �Խñ� ����, �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�";
			break;
			
		case "ȸ��" :
			k = "�Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�";
			break;
			
		case "��ȸ��" :
			k = "�Խñ� ��ȸ";
			break;			
		}
		System.out.println(k);
				
	}
	
	public void practice7() {
		System.out.print("Ű(m)�� �Է��� �ּ��� : ");
		double m = sc.nextDouble();
		
		System.out.print("������(kg)�� �Է��� �ּ��� : ");
		double kg = sc.nextDouble();
		
		double mkg = kg/(m*m);
		System.out.println("BMI���� : " + mkg);
		
		if(mkg < 18.5) {
			System.out.println("��ü��");
		}else if(mkg>= 18.5 || mkg < 23) {
			System.out.println("����ü��");
		}else if(mkg>23 || mkg <25) {
			System.out.println("��ü��");
		}else if(mkg>25 || mkg >30) {
			System.out.println("��");
		}else if(mkg>30) {
			System.out.println("�� ��");
	}
	
	}
	
	public void practice8() {
		System.out.print("�ǿ�����1 �Է� : ");
		int p1 = sc.nextInt();
		
		System.out.print("�ǿ�����2 �Է� : ");
		int p2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�����ڸ� �Է�(+,_,*,/) : ");
		char pl = sc.nextLine().charAt(0);
		
		int re = 0;
		
		switch(pl) {
			case '+' :
				re = p1 + p2; break;
				
			case '-' :
				re = p1 - p2; break;
				
			case '*' :
				re = p1*p2; break;
				
			case '/' :
				re = p1/p2; break;
		}

		if(p1<0 && p2 < 0) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
		}else if(pl != '+' || pl != '-' || pl != '*' || pl != '/') {
			System.out.println("�߸� �Է��ϼ̽��ϴ�....... ���α׷��� �����մϴ�.");
		}
	}
	
	public void practice9() {
		System.out.print("�߰� ��� ���� : ");
		int mid = sc.nextInt(); 
		System.out.print("�⸻ ��� ���� : ");
		int fi = sc.nextInt();
		System.out.print("���� ���� : ");
		int ho = sc.nextInt();
		System.out.print("�⼮ ȸ�� : ");
		double ch = sc.nextDouble();
		
		double mid2 = mid * 0.2;
		double fi2 = fi * 0.3;
		double ho2 = ho * 0.3;
		double plu = mid2 + fi2 + ho2+ ch;
		
		System.out.println("================= ��� ================= ");
		System.out.println("�߰� ��� ����(20) : " + mid2);
		System.out.println("�⸻ ��� ����(30)  : " + fi2);
		System.out.println("���� ���� (30)  : " + ho2);
		System.out.println("�⼮ ���� (20) : " + ch);
		System.out.println("���� : " + plu);
		
		if(plu>70) {
			System.out.println("Pass");
		}else if(plu<70) {
			System.out.println("Fall[�⼮ ȸ�� ����("+ ch + "/20)]");
		}else if(ch<20*0.3) {
			System.out.println("Fall[���� �̴�]");
//			���� �̴��� ���� ���� ������� �ȶ߰� ���� �̴޸� �߰� �ϴ� �����????????????????
		}
		
	}
	
	public void practice10() {
		System.out.println("1. �޴� ���");
		System.out.println("2. ¦��/Ȧ��");
		System.out.println("3. �հ�/���հ�");
		System.out.println("4. ���� ");
		System.out.println("5. �α���");
		System.out.println("6. ���� Ȯ��");
		System.out.println("7. BMI");
		System.out.println("8. ����");
		System.out.println("9. P/F");
		
		System.out.print("���� : ");
		int i = sc.nextInt();
		
		switch(i) {
		case 1 :
			System.out.print("�ǽ����� 1 ����"); break;
		case 2 :
			System.out.println("�ǽ����� 2 ����"); break;
		case 3 :
			System.out.println("�ǽ����� 3 ����"); break;
		case 4 :
			System.out.println("�ǽ����� 4 ����"); break;
		case 5 :
			System.out.println("�ǽ����� 5 ����"); break;
		case 6 :
			System.out.println("�ǽ����� 6 ����"); break;
		case 7 :
			System.out.println("�ǽ����� 7 ����"); break;
		case 8 :
			System.out.println("�ǽ����� 8 ����"); break;
		case 9 :
			System.out.println("�ǽ����� 9 ����"); break;
		}				
	}
	
	public void practice11() {
		System.out.println("��й�ȣ �Է�(1000~9999) : ");
		String num = sc.nextLine();
		int numIn = Integer.parseInt(num);
		if(num.length() != 4) {
			System.out.println("�ڸ��� �ȸ���");
		
		} //else if()
	}
}
