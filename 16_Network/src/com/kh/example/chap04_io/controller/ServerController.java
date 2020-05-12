package com.kh.example.chap04_io.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.kh.example.chap04_io.model.vo.Person;

public class ServerController {
	
	public void startServer() {
		//1.������ ��Ʈ��ȣ ����
		int port = 8500;
		
		try {
			//2. ������ ���� ���� �� ��Ʈ��ȣ �Ű������� �־���
			ServerSocket server = new ServerSocket(port);
			
			//3.���
			System.out.println("������Դϴ�.");
			
			//4.Ŭ���̾�Ʈ ��û accept()�� �³� �� Ŭ���̾�Ʈ�� ���� ���� ����
			Socket client = server.accept();
			
			//5.����½�Ʈ�� ����
			InputStream in = client.getInputStream();
			
			//6.������Ʈ�� �̿��ؼ� ���� �ø�
			ObjectInputStream ois = new ObjectInputStream(in);
			
			//7.��Ʈ������ �Է� ���
			Person message = null;
			while(true) {
				message = (Person)ois.readObject();
				
				if(message != null) {
					System.out.println(client.getInetAddress().getHostAddress() + "�� ���� �޼��� : " + message);
				} else {
					break;
				}
			}
			//8. �������
			ois.close();
			server.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();}
		
		
		
		
	}

}
