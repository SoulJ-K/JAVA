package com.kh.example.chap01_thread.run;

import com.kh.example.chap01_thread.thread.Thread1;
import com.kh.example.chap01_thread.thread.Thread2;
import com.kh.example.chap01_thread.thread.Thread3;

public class Run {
	public static void main(String[] args) {
		
		Thread1 thread1 = new Thread1();
//		thread1.start();
		//메인이 끝났음에도 계속해서 나머지 스레드가 돌아서 출력됨
		
		Thread2 t2 = new Thread2();
		Thread thread2 = new Thread(t2);
//		thread2.start();
		
		Thread3 thread3 = new Thread3();
//		thread3.start();
		
//		thread1.start();
		//java.lang.IllegalThreadStateException
		//한번 종료된 스레드는 다시 호출 불가
		
		System.out.println("t1 우선순위 : " + thread1.getPriority());
		System.out.println("t2 우선순위 : " + thread2.getPriority());
		System.out.println("t3 우선순위 : " + thread3.getPriority());
//		귀여운 스레드 ON... 
//		Thread-1 ON....
//		t1 우선순위 : 5
//		t2 우선순위 : 5
//		t3 우선순위 : 5
		
		thread1.setPriority(3);
		thread2.setPriority(Thread.MAX_PRIORITY);
		thread3.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println("t1 우선순위 : " + thread1.getPriority());
		System.out.println("t2 우선순위 : " + thread2.getPriority());
		System.out.println("t3 우선순위 : " + thread3.getPriority());
//		t1 우선순위 : 3
//		t2 우선순위 : 10
//		t3 우선순위 : 1
		
		thread1.start();
		thread2.start();
		thread3.start();
		//우선순위 부여해도 프로세스 돌아가는데는 큰 영향 없음
		
		try {
			thread1.join();
			thread2.join();
			thread3.join();
			//자신(main thread)이 하던 작업을 잠시 멈추고 다른 스레드가(thread1, thread2, thread3) 지정된 시간동안 실행되도록 함
			//실행된 위치에 따라 달라짐.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("------------------ main end!");
	}

}
