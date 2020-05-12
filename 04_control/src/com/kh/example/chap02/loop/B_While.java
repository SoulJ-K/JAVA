package com.kh.example.chap02.loop;

import java.util.Scanner;

public class B_While {
	/*
	  while(���ǽ�){
	  	���๮��;
	  	[������ or �б⹮;]
	  }
	  
	  	���ǽ� Ȯ�� -> (���ǽ� true�϶�) ���� ���� ���� -> ���ǽ� Ȯ�� -> �ݺ�
	  	���ǽ� ����� false�� �� �� ���� �ݺ�
	  
	  */
	public void method1() {
		//1~5���� ���
		
		int i = 1;
		while(i<6) {
			System.out.println(i + "��° �ݺ��� ����");
			i++;
			//i++�� ����Ʈ �� ���� ������ i++�� ���� �����.
			}
		}
	
	public void method1_1() {
	//�ڱ�Ұ� 5�� : �� �̸��� �������
		int i = 1;
		while(i < 6) {
			System.out.println("�� �̸��� �������");
			i++;
		}
	}
	
	public void method2() {
//		5~1����
		int i = 5;
		while(i>=1) {
			System.out.println(i);
			i--;
		}
	}
	
	public void method3( ) {
		//1~10���̿� Ȧ���� ���
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			i+=2;
		}
	}
	
	public void method4() {
		//���� �� ���� �Է¹޾� �� ���� ���� ���
		
		//���� �� ���� �Է��ϼ���.
		//��, ù��° ���ڰ� �ι�° ���ں��� �۰� �Է����ּ���.
		//ù��° ����:
		//�ι�° ����:
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �� ���� �Է��ϼ���.");
		System.out.println("��, ù��° ���ڰ� �ι�° ���ں��� �۰� �Է����ּ���.");
		System.out.print("ù��° ����: ");
		int i = sc.nextInt();
		
		System.out.print("�ι�° ����: ");
		int j = sc.nextInt();		
		
		int max = 0;
		int min = 0;
		if(i>j) {
			max = i;
			min = j;
		}else {
			max = j;
			min = i;
		}
		
		while(min <= max) {
			System.out.println(min);
			min++;
		}
	}
	
	public void method4_1() {
		//���� �ϳ��� �Է¹޾� �� ���� 1~9 ������ �� �϶��� �� ���� ������ ���
		//������ ���� ������ 1~9������ ����� �Է��Ͽ����մϴ�. ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		int i = sc.nextInt();
		
		if(i >= 1 && i<=9) {
			int j = 1;
			while(j<10) {
				System.out.printf("%d * %d = %d%n", i, j, (i*j));
				j++;
			}
		}else {
			System.out.println("1~9������ ����� �Է��Ͽ����մϴ�.");
			
			}
//if�����θ� ����� �����?
//		if(i<1 || i >9) {
//			S
//		}
			
		}
		
	public void method5() {
		//1���� 10������ ������ ������ ���� 1���� ���������� ���� �հ� ���
		
		int random = (int)(Math.random() * 10 + 1);
		
		int sum = 0;
		int i = 1;
		
		while(i <=random) {
			sum += i;
			i++;
		}
		
		System.out.printf("1���� %d������ ���� �հ� : %d", random, sum);
	}
	
	public void method6() {
		//����ڿ��� ���ڿ��� �Է¹޾� �ε������� ���� ���
		//���ڿ� �Է� : apple
		//0: a
		//1 : p
		//2 : p
		//3 : l
		//4 : e
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڿ� �Է� : ");
		String word = sc.nextLine();
		
		int length = word.length();
		//���ڿ��� ���̸� ��ȯ�ϴ� �޼ҵ� : length()
		System.out.println(word + "�� ���� : " + length);
		
//		//for
//		for(int i = 0; i < length; i++) {
//			//for(int i = 0; i < word.length(); i++){
//			//�Ȱ���
//			char ch = word.charAt(i);
//			System.out.println(i + " : " + ch);
//			//���ڼ��� 5���� ���س��� 5���ۿ� ����� �ȵ�
//		}
		
		//while
		
		int i = 0;
		while(i <= word.length()) {
			char ch = word.charAt(i);
			System.out.println(i + " : " + ch);
			i++;
		}
	}
	
	public void method7() {
		//2�ܺ��� 9�ܱ��� ���
		
//		for(int i = 2; i<10; i++) {
//			for(int j = 1; j<10; j++) {
//				System.out.printf("%d * %d = %d%n",i,j,(i*j));
//			}
//		}
		
		int i = 2;
		while(i<=9) {
			int j = 1;
			while(j <10) {
			System.out.printf("%d * %d = %d%n",i,j,(i*j));
			j++;
		}
			i++;
			System.out.println();			
		}
		
	}
	
	public void method8() {
		//�Ƴ��α� �ð�
		int i =0;
		while(i<24) {
			int j = 0;
			while(j<60) {
//				System.out.println(i + "��" + j + "��"); 
				System.out.printf("%d�� %d��%n",i,j); 
				//���ڸ� ���� ���ڸ� ���� ���߰� ���� ���� 2d�� �ٲ�
				//%2d�� ���� 2�ڸ��� Ȯ���ϰڴٴ� �ǹ�
				//������ ���ķ� ǥ�õ�(��ȣ�� ���� �ʴ� �̻�)
				//���� ������ - �� ������ ��
				//printf("%2d�� %-2d��%n",i,j)
				j++;
			}
			i++;
			System.out.println();
		}
	}
	
	public void method9() {
		Scanner sc = new Scanner(System.in);
		
		int menuNum = 0;
		//while�� ���ؼ� �ݺ�
		while(menuNum !=9) {
			System.out.println("1. 1~5���� ���");
			System.out.println("2. 5~1���� ���");
			System.out.println("3. 1~10���� Ȧ�� ���");
			System.out.println("9. ����");
			System.out.print("�޴����� : ");
			menuNum = sc.nextInt();
			
			switch(menuNum) {
				case 1 : method1(); break;
				case 2 : method2(); break;
				case 3 : method3(); break;
				case 9 : System.out.println("�����մϴ�"); break;
				default : System.out.println("�߸��Է��ϼ̽��ϴ�.");
				}
			System.out.println();
		}
		
	}
	
	
	}

