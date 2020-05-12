package com.kh.variable;

import java.util.Scanner;

public class F_keyboardinput {
	public void inputScanner() {
		Scanner sc = new Scanner(System.in);
		//scanner만들고 난 뒤 임폴트!
		System.out.print("이름을 입력하세요: ");// 안내문구역할
		//안내문구는 꼭 필요
		String name = sc.nextLine();
		//sc.nextline으로 이름을 입력하세요가 사용자가 정보를 입력하기 전까지 활성화되어있음
		//그래서 출력 된 정보 옆에 이름을 입력하면 String name에 이름이 입력됨. 그래서 마지막엔 이름이 출력됨
		System.out.println(name);
		
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		
		System.out.print("키(소수점 첫째 자리까지 입력) :");
		double height = sc.nextDouble();
		System.out.println(name + "님은 " + age + "세이며, 키는 " + height + "cm입니다.");
		
}
	public void inputScanner2() {
		//사용자에게 이름과 나이를 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요: ");
		String name = sc.nextLine();
		System.out.print("나이를 입력하세요: ");
//		int age = sc.nextInt();
		int age = Integer.parseInt(sc.nextLine());
		System.out.print("주소를 입력하세요: ");
		String address = sc.nextLine();
		//System.out.println(name + "님은" + age + "세이며, 주소는 " + address + "입니다.");
		//이렇게 하면 주소 적는 곳이 나오지 않음
		//주소를 입력하세요: 김솔지님은20세이며, 주소는 입니다  라고 결과 나옴.
		//nextLine은 줄바꿈(엔터)을 인식하여 버퍼 안에 줄바꿈을 남기지 않고 모두 가지고 나오지만, 나머지는 줄바꿈을 인식하지 못하고 버퍼에 남김
		/*정보를 입력하면 buffer라는 임시공간에 들어감
		ex) 김솔지라는 정보를 입력 후 엔터 침. 컴퓨터에서 엔터는 줄바꿈 =n으로 표시됨
				숫자 10을 버퍼안에 넣었을때 nextInt()이 안으로 숫자 10만 들어오고 버퍼안에는 줄바꿈이 남아있음
				그 다음에 문자를 넣기 위해 nextLine()에 정보를 넣어야하는데 버퍼안에 남아있는 줄바꿈이 정보로 입력됨.*/
		
		//해결하는 방법
				//방법1. 줄바꿈을 가져갈 수 있는 nextLine() 추가
//				int age = sc.nextInt();
//				sc.nextLine();
//				//버퍼에 남아있는 줄바꿈을 빼주기 위한 용도 
//				System.out.print("주소를 입력하세요: ");
//				String address = sc.nextLine();
		//System.out.println(name + "님은" + age + "세이며, 주소는 " + address + "입니다.");
//				방법2. age를 받을 때도 nextLine()을 쓰되 int로 파싱하기
		//파싱 : 문자열을 기본자료형으로 바꿔주는 일
//		String userAge = sc.nextLine();
//		int age = Integer.parseInt(userAge);
		
		//방법3. next()로 주소를 받기
		//한계 : 띄어쓰기를 구분자로 인식해서 띄어쓰기가 있는 경우 처음값만 가져옴
//		int age = sc.nextInt();
//		String address = sc.next();
		
		//+추가 : char형을 받고 싶을때는?
		System.out.print("성별을 입력하세요 : ");
//		String  userGender = sc.nextLine();
//		char gender = userGender.charAt(0);
		char gender = sc.nextLine().charAt(0);
		//charAt(int index)은 문자열에서 index번째의 문자를 가져와주는 메소드
		//char의 집합을 String이라고 부름 
		//zero index기반으로 0부터 시작함. pig 중 g는 3번째가 아니라 2번째
		
		System.out.println(name + "님은" + age + "세이며, 주소는 " + address + "입니다.");
		System.out.println("gender :" + gender);
		
		
		
		
		

		
		
	}
}
