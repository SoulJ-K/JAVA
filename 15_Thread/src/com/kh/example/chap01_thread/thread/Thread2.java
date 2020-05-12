package com.kh.example.chap01_thread.thread;

//스레드 생성방법 2 : Runnable implements하기
public class Thread2 implements Runnable{
	
	public void run() {
		for(int i = 0; i<10; i++) {
			System.out.println(Thread.currentThread().getName() + " ON....");
			//러너블은 상속받고 있지 않아서
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	};

}
