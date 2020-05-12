package com.kh.example.array;

import java.util.Arrays;

public class B_ArrayCopy {
	//얕은 복사 : 배열의 주소만 복사
	//깊은 복사 : 새로운 배열을 생성하며 내부 값을 복사
	//	1) for문 이용한 1:1 복사
	//	2) System.arraycopy() 이용한 복사
	//	3) Array.copyOf() 이용한 복사
	//	4) clone() 이용한 복사 ---> 되도록 사용하지 않음
	
	public void method1() {
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = originArr; // 얕은 복사
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
		
		//원본 배열의 0번째 인덱스를 99로 변경
		originArr[0] = 99;
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for(int i = 0; i <copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
		
		System.out.println("originArr의 주소값 : " + originArr);
		System.out.println("copyArr의 주소값 : " + copyArr);
	}
	
	public void method2() {
		//깊은 복사 1. for문 이용
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = new int[5];
		
		//이게 깊은 복사를 하는 for문
		for(int i = 0; i < originArr.length; i++) {
			copyArr[i] = originArr[i];
		}
//		======================================
		
		System.out.println("====복사 직후===");
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for(int i = 0; i <copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
		
		System.out.println("=====originArr의 0번째 인덱스를 99로 변경======");
		originArr[0] = 99;
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
			}
		System.out.println();
		for(int i = 0; i <copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
			
	}
	
	public void method3() {
		//깊은 복사 2. arraycopy() 이용
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = new int[10];
		
//		System.arraycopy(src, srcPos, dest, destPos, length);
//		src = 원본 배열			srcPos = 시작위치			dest = 복사배열
//		destPos = 복사배열 시작위치							length = 복사 길이
		//originArr배열의 모든 데이터를 copyArr배열에 복사를 하는데
		//copyArr의 3번째에서부터 붙여넣고싶음
		
		System.arraycopy(originArr, 0, copyArr, 3, originArr.length);
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for(int i =0; i<copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
		
		originArr[0] = 99;
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
			}
		System.out.println();
		for(int i = 0; i <copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
		
	}
	
	public void method4() {
		//깊은복사 3. Arrays.copyOf() 이용
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = new int[10];
		
		System.out.println("======처음 값======");
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
		
		System.out.println("====== copyOf()로 복사 후 =======");
//		Arrays.copyOf(original, newLength)
//		original = 원본 배열		newLength = 복사할 길이
		
		copyArr = Arrays.copyOf(originArr, originArr.length);
		//Arrays = 배열할 때 유용한 메소드를 모아놓은 class
		//컬렉션 = 컬렉션을 사용할 때 유용한 메소드를 모아놓은 class
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
		
	}
}
