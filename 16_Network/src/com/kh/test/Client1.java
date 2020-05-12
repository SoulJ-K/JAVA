package com.client;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import com.model.vo.Book;

public class Client {
	
	// 서버로 파일을 전송하기 위한 메소드
	 public void fileUpload() {  
		 
	  try {  
	   // 2. 소켓 객체 생성 : 생성과 동시에 서버에 연결 요청됨
		  //192.168.20.34
	   String serverIp = InetAddress.getLocalHost().getHostAddress();
	   Socket socket = new Socket(serverIp, 3000);
	   // 연결 실패는 null 리턴됨

	   if (socket != null) { // 서버와 연결되었다면...
	    // 3. 서버와 해당 클라이언트 간의 입/출력 스트림 생성
	    BufferedReader br = new BufferedReader(
	      new InputStreamReader(socket.getInputStream()));
	    
	    ObjectOutputStream objOut = new ObjectOutputStream(
	      socket.getOutputStream());

	    // 4. 파일에 저장된 데이터 읽어서 서버로 보냄
	    //파일 읽기용 스트림을 생성한다.
	    ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("books.dat"));
	    
	    try {
	    	
	     while(true) {
	      Object obj = objIn.readObject();
	      objOut.writeObject(obj);
	     }
	     
	     //입력의 도중에 예상외의 파일의 종료, 또는 예상외의 스트림의 종료가 있던 것을 나타내는 시그널입니다.
	    } catch (EOFException e) {
	    	
	     objOut.writeObject(null);
	     objOut.flush();
	     String returnMessage = br.readLine();
	     
	     if(returnMessage.equals("exit")) {
	      // 5. 스트림 반납
	      objIn.close();
	      objOut.close();
	      br.close();
	      socket.close();
	      
	     }  
	     
	     //if close
	    }  //catch close
	   } //if close
	  } catch (Exception e) {   
	   e.printStackTrace();
	  }  
	 }  //fileUpload() close
	 
	 
	 // Book 객체 파일 출력용
	 public void fileSave() {  
		 
		 List <Book> bookList = new ArrayList<Book>();
		 
		  bookList.add(new Book("자바를 잡아라", 30000));
		  bookList.add(new Book("오라클 정복", 35000));
		  bookList.add(new Book("웹표준 2.0", 27500));
		  bookList.add(new Book("자바 Servlet/JSP", 28000));
		  bookList.add(new Book("ajax 사용법", 15000));

		  System.out.println(bookList);
	   
	   try (ObjectOutputStream oOut = new ObjectOutputStream(new FileOutputStream("books.dat"));) {
		   
	    for (int i = 0; i < bookList.size(); i++) {
	     oOut.writeObject(bookList.get(i));
	     //파일에 작성
	     oOut.flush();
	    }
	   } catch (Exception e) {
	    e.printStackTrace();
	   }
	  }		
	 
	 //Book 객체 파일 입력용
	 public void fileOpen() {

		 List <Book>bookList = new ArrayList<Book>();
		 
		 //try-catch-resources
		 //AutoCloserable 인터페이스를 구현하고 있다면
		 //Stream을 사용하고 난 후 자동으로 clos()메서드를 호출해준다.
		 
		 //ObjectInputStream 스트림으로 부터 객체 단위로 읽기 위해 사용되는 보조 바이트 스트림
		 //FileInputStream 파일로부터 데이터를 읽어 들이기 위해 사용하는 기본 바이트 스트림 클래스
		 try (ObjectInputStream oIn = new ObjectInputStream(new FileInputStream("books.dat"));) {

			 while (true) {
				 bookList.add((Book) oIn.readObject());
			 }

		 } catch (EOFException e) {

			 for (Book b : bookList) {
				 System.out.println(b);
			 }

		 } catch (Exception e) {
			 e.printStackTrace();
		 }

	 }

}
