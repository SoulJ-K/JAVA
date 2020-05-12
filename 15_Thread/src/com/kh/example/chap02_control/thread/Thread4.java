package com.kh.example.chap02_control.thread;

public class Thread4 implements Runnable{
	
	@Override
	public void run() {
		int count = 0;
		
		//count�� 10�̸� �̸鼭 ���� �������� interrupted�� false�� ��� ����
		while(count < 10 && !Thread.currentThread().isInterrupted()) {
			//interrupted�� �Ͻ��������� ������� �ű�� �����̹Ƿ� ������� �����ִ� ����
			try {
				Thread.sleep(1000);   //�ٽ� ���
				System.out.println((++count) + "��");
			} catch (InterruptedException e) {    //InterruptedException �� ���� ������ �ٽ� ���
				//1�ʵ��� ������ ���� �ϴ� �۾� �ϴٰ� interrupt�� ������ InterruptedException�� �߻���.
				//�׷��� ī��Ʈ ���ᰡ ��µ�. �׷��� ���� �ʵ鵵 ī��Ʈ�Ǵ� ������
				//InterruptedException�� �߻��ϸ� �������ͷ�Ƽ���� ���ð��� �߰��� Ʈ��� �ٲ� �ͼ����� ������ �ٽ� false�� �ʱ�ȭ��
				//�׷��� ���Ϲ��� ���ǿ� �����ؼ�(false�� �ʱ�ȭ�Ǽ�) ���Ϲ��� 10���� ��� ��
				//catch�� �ȿ��� �ٽ� interrupt�� �߻���Ű�� �ٽ� InterruptedException�� �߻��Ͽ� true�� �ٲ�
				Thread.currentThread().interrupt();
				System.out.println(count + "�ʿ� ī��Ʈ ����");
			}
		}
		
	}

}
