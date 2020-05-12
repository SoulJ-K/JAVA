package com.kh.example.chap02_control.thread;

public class Thread4 implements Runnable{
	
	@Override
	public void run() {
		int count = 0;
		
		//count가 10미만 이면서 현재 스레드의 interrupted가 false인 경우 진행
		while(count < 10 && !Thread.currentThread().isInterrupted()) {
			//interrupted는 일시중지에서 실행대기로 옮기는 상태이므로 쓰레드는 깨어있는 상태
			try {
				Thread.sleep(1000);   //다시 재움
				System.out.println((++count) + "초");
			} catch (InterruptedException e) {    //InterruptedException 을 통해 스레드 다시 깨어남
				//1초동안 잠들었다 깼다 하는 작업 하다가 interrupt를 만나면 InterruptedException이 발생함.
				//그래서 카운트 종료가 출력됨. 그러나 남은 초들도 카운트되는 이유는
				//InterruptedException이 발생하면 이즈인터럽티드의 선택값이 중간에 트루로 바뀌어도 익셉션을 만나도 다시 false로 초기화됨
				//그래서 와일문의 조건에 부합해서(false로 초기화되서) 와일문을 10까지 계속 돔
				//catch문 안에서 다시 interrupt를 발생시키면 다시 InterruptedException이 발생하여 true로 바뀜
				Thread.currentThread().interrupt();
				System.out.println(count + "초에 카운트 종료");
			}
		}
		
	}

}
