package com.kh.example.chap02.loop;

import java.util.Scanner;

public class A_for {
	/*
	  for(�ʱ��; ���ǽ�; ������){
	      ���๮��;
	      }
	      
	       �ʱ�� -> ���ǽ� -> (���ǽ��� true�� ��)���๮�� -> ������ -> ���ǽ� ->(�ݺ�)
	       ���ǽ� ����� false�� �� ���� �ݺ�
	       �������� for���� ������ ���� ����
	       
	       for�� �ȿ� �ִ� �ʱ��, ���ǽ�, ������ ��� ���� ����
	       ������ ��� �������� �� �ݺ����� �������� ���� ������
	       for�� ���̳� �ۿ��ٰ� �ʱ���� ��������, ������ ��������, ������ �󸶳� �ɰ��� ��� ǥ���ؾ���.
	       ��, for() �ȿ����� ������ �� ��� �ʿ��� �����.
	*/
	
	public void method1() {
		// 1���� 5���� ����غ���
		for(int i = 1 ; i <= 5 ; i++) {
			System.out.println(i + "��° �ݺ��� ����");
		}
	}
	
	public void method1_1() {
			//�ڱ�Ұ� �ټ���
			
		for(int i = 1 ; i<=5 ; i++) {
			System.out.println("�� �̸��� �������");
			}

}
	public void method2(){
		//5���� 1���� ���
		
		for(int i = 5 ; i > 0 ; i--) {
			System.out.println(i);
		}
	}
	public void method2_1() {
		//8->3
		for(int i = 8 ; i>= 3 ; i--) {
			System.out.println(i);
		}
	}
	
	public void method3() {
		//1~10 Ȧ���� ���
		for(int i = 1 ; i<10 ; i+=2) {
			System.out.println(i);
		}
		
		for(int i = 1; i<10 ; i++) {
			if(i % 2 !=0) {
				System.out.println(i);
			}
		}
	}
	public void method4() {
		//���� �ΰ��� �Է¹޾� �� ���� ���� ���
		/*
		  ���� �� ���� �Է��ϼ���.
		  ��, ù ��° ���ڰ� �� ��° ���ں��� �۰� �Է����ּ���.
		  ù ��° ���� : 1
		  �� ��° ���� : 5
		  1 2 3 4 5
		  */
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �� ���� �Է��ϼ���.");
		System.out.println("��, ù ��° ���ڰ� �� ��° ���ں��� �۰� �Է����ּ���.");
		System.out.print("ù ��° ���� :");
		int start = sc.nextInt();
		
		System.out.print("�� ��° ���� :");
		int end = sc.nextInt();
		
		int max = 0;
		int min = 0;
		
		if(start > end) {
			max = start;
			min = end;
		}else {
			max = end;
			min = start;
		}
					
		
		for(int i = start; i <= max; i++) {
			System.out.println(i);
		}
		
//		for(;min<=max; min++) {
//			System.out.print(min+" ");
		}
	
	
public void method4_1() {
	//���� �ϳ��� �Է¹޾� �� ���� 1~9 ������ ���϶��� �� ���� ������ ���
	// ������ ���� ������ "1~9 ������ ����� �Է��ؾ� �մϴ�" ���
	
	Scanner sc = new Scanner(System.in);
	System.out.print("���� �Է� : ");
	int dan = sc.nextInt();
	
	if(dan >=1 && dan <= 9) {
		for(int i = 1; i <=9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan*i));
		}
	} else {
		System.out.println("1~9 ������ ����� �Է��ؾ� �մϴ�");
	}
		
}
public void method5() {
	//1���� 10������ ������ ����(������)�� ���� 1���� ���������� ���� �հ�
	//Math.random(); //������ ����(�Ǽ�)�� ��ȯ�ϴ� �޼ҵ�
	//���� ���� : 0 <= Math.random(); < 1
	//10���� ����� ���� *10 : 0 <= math.random() * 10 < 10
	//10�� �����ϱ� ���� 1 ���ϱ� : 1 <= math.random() * 10 + 1 < 11
	//������ ����� ���� int����ȯ : 1 <=(int)(math.random() * 10+1) <11 
	int random = (int)(Math.random() * 10 + 1);
	
	int sum = 0;
	
	for(int i =1; i <=random ; i++) {
		sum +=i;
	}
	System.out.printf("1���� %d���� ���� �հ� : %d",random,sum);
	
}

public void method6() {
	//��ø�ݺ���  - 
	//2�ܺ��� 9�ܱ��� ���
	for(int dan = 2; dan <=9; dan++) {
		for(int su = 1; su <=9; su++) {
			System.out.printf("%d * %d = %d%n", dan, su, (dan*su));
		}
		System.out.println();
	}
}

public void method7() {
	//�Ƴ��α� �ð� ��� : 0�� 0��~ 23�� 59��
	for(int hour = 0; hour < 24; hour++) {
		for(int min = 0; min <= 59; min++) {
			System.out.println(hour + "�� " + min + "��");
//			System.out.printf("%d�� %d��%n", hour, min);
		}
	}

}

public void method8() {
	//�� �ٿ� ��(*)ǥ�� 5�� ��µǴµ�
	//�� ���� ����ڰ� �Է��� �� ��ŭ ���
	/*
	  ����� �� �� : 3
	  *****
	  *****
	  *****
	  */
	Scanner sc = new Scanner(System.in);
	System.out.print("����� �� �� : ");
	int row = sc.nextInt();
	
	for(int i = 1; i<=row; i++) {
		for(int j = 1; j <=5; j++) {
			System.out.print('*');
		}
		System.out.println();
	}
	
}

public void method9() {
	//�� �ٿ� ��ǥ ���ڸ� �Էµ� �� ���� ĭ �� ��ŭ �Է�
	//��, �� ���� ĭ ���� ��ġ�ϴ� ��ġ���� �� ��ȣ�� ���� ������ ���
	/*
	  �� �� : 6	 �� �� : 5
	  ĭ �� : 6	 ĭ �� : 4
	  1*****	1***
	  *2****	*2**
	  **3***	**3*
	  ***4**	***4
	  ****5*	
	  *****6
	  */
	Scanner sc = new Scanner(System.in);
	System.out.print("�� �� : ");
	int num1 = sc.nextInt();
	
	System.out.print("ĭ �� : ");
	int num2 = sc.nextInt();
	
	for(int i = 1; i<=num1; i++) {
		for(int j = 1; j <=num2; j++) {
			if(i==j) {
				System.out.print(i);
			}else {
				System.out.print('*');
			}
		}
		System.out.println();
	}
	
}

	
}