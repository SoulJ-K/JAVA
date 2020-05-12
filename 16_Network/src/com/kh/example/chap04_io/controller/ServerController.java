package com.kh.example.chap04_io.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.kh.example.chap04_io.model.vo.Person;

public class ServerController {
	
	public void startServer() {
		//1.서버용 포트번호 생성
		int port = 8500;
		
		try {
			//2. 서버용 소켓 생성 후 포트번호 매개변수로 넣어줌
			ServerSocket server = new ServerSocket(port);
			
			//3.대기
			System.out.println("대기중입니다.");
			
			//4.클라이언트 요청 accept()로 승낙 후 클라이언트에 대한 소켓 생성
			Socket client = server.accept();
			
			//5.입출력스트림 생성
			InputStream in = client.getInputStream();
			
			//6.보조스트림 이용해서 성능 올림
			ObjectInputStream ois = new ObjectInputStream(in);
			
			//7.스트림으로 입력 출력
			Person message = null;
			while(true) {
				message = (Person)ois.readObject();
				
				if(message != null) {
					System.out.println(client.getInetAddress().getHostAddress() + "가 보낸 메세지 : " + message);
				} else {
					break;
				}
			}
			//8. 통신종료
			ois.close();
			server.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();}
		
		
		
		
	}

}
