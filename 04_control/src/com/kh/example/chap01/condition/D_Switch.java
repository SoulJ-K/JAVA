package com.kh.example.chap01.condition;

import java.util.Scanner;

public class D_Switch {
	//���ǽ��� ������� case���� ã�� ����� �����ϴ� ���ǹ�
	//�ش��ϴ� ���� case�� ���� ��쿡�� default�� ��ɹ� ����
	
	//case�� ���๮ ���̿��� �ݷ�(:)�� ����ϸ�
	//break�� ������ ������ �ʰ� ��� ������
	
	public void method1() {
		//���� �� ���� �����ȣ ���� 1����  �Է¹޾Ƽ� 
		//�����ȣ���ڿ� �ش��ϴ� ����� �����ϰ� ����ϼ���
		/*
		 ù ��°�� : 
		 �� ��°�� :
		 ������(+,-,*,/) :
		 	 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��°�� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��°�� : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("������(+,-,*,/) : ");
		char num3 = sc.nextLine().charAt(0);
//		java.lang.StringIndexOutOfBoundsException: String index out of range: 0
//		���� nextInt�� �ٹٲ��� �������� �ʾ� �ٹٲ��� �����ִ� ���¿��� ������ �����ڿ��� nextLine���� �ٹٲ��� ��� �����Դ�
//		�� ���¿��� charAt���� 0��° ���ڸ� �������� ����� �������� �ٹٲ޸� �ִ� �����̰� ������ ���� �����̱⿡ ������ ��
		
		int result = 0; //������ ����� ����
		
		switch(num3) {
		case '+' :
			result = num1 + num2;
			break;
			
		case '-':
			result = num1-num2;
			break;
			
		case '*':
			result = num1*num2;
			break;
			
		case '/':
			result = num1/num2;
	
		}
		
		System.out.println(num1 + " + " + num2 + " = " + result);
						
	}
	
	public void method2() {
		// ������ �Է��Ͽ� ����� 1000, �ٳ����� 3000, �����ƴ� 2000, Ű���� 5000
		// ���ϰ��Կ� ���� ������ �Է����� ���� "�߸��Է��Ͽ����ϴ�." ���
		// ���� �̸��� �Է��Ͻÿ� :
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �̸��� �Է��Ͻÿ� : ");
		String fu = sc.nextLine();
		
		int price = 0;
		switch(fu) {
		case "���" :
			price = 1000;
			break;
			
		case "�ٳ���" :
			price = 3000;
			break;
			
		case "������" :
			price = 2000;
			break;
			
		case "Ű��" :
			price = 5000;
			break;
			
			default :
				System.out.println("�߸��Է��Ͽ����ϴ�.");
				return;
				// break�� switch�� �ȿ��� ����
				// return�� ���� ȣ���� method���� ���ư��� ���
				// �� �� ���� ������ ���ư��ų� �ƹ��͵� ���� �� �� ����
				// �� ��쿡�� �ؿ� �ִ� ���� ������ ���� ȣ���� �޼ҵ忡�� ���ư�.
				
					
		}
		
		System.out.println(fu + "�� ������ " + price + "���Դϴ�.");
				
	}
	
	public void method3() {
		//����ڰ� �Է��� �޴� ��ȣ�� ���� �޴��� ��µǰ� �Ͻÿ�
		/*
		  1. ȸ�� ���
		  2. ȸ�� ����
		  3. ȸ�� ����
		  �޴� ��ȣ�� �Է��ϼ��� : 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("1. ȸ�� ���");		
	
		System.out.println("2. ȸ�� ����");
		
		
		System.out.println("3. ȸ�� ����");
		
		System.out.println("�޴� ��ȣ�� �Է��ϼ��� : ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1 :
			System.out.println("ȸ����� �޴��Դϴ�.");
			break;
		case 2 :
			System.out.println("ȸ�������޴��Դϴ�");
			break;
		case 3 :
			System.out.println("ȸ�������޴��Դϴ�");
			break;
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�");
		}
	}
		public void method4() {
			//1������ 12������ �Է� �޾� �ش��ϴ� ���� ������ ��¥�� ����ϼ���
			Scanner scr = new Scanner(System.in);
			System.out.print("1��~12������ �� �ϳ��� �Է��ϼ��� : ");
			int num = scr.nextInt();
			int date = 0;
			
			switch(num) {
				case 1 : case 3 : case 5 : case 7 : case 9 : case 11 : 
					System.out.println("�Է��Ͻ� ���� 31�ϱ��� �Դϴ�.");
					break;
				case 4 : case 6 : case 8 : case 10 : case 12 :
					System.out.println("�Է��Ͻ� ���� 30�ϱ��� �Դϴ�.");
					break;
					
				case 2 : 
					System.out.println("�Է��Ͻ� ���� 28�� Ȥ�� 29�ϱ��� �Դϴ�.");
					break;
					default :
						System.out.println("�ݵ�� 1~12 ������ ���ڸ� �Է����ּ���.");
			
			}
	
			
		}
}