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
	
	// ������ ������ �����ϱ� ���� �޼ҵ�
	 public void fileUpload() {  
		 
	  try {  
	   // 2. ���� ��ü ���� : ������ ���ÿ� ������ ���� ��û��
		  //192.168.20.34
	   String serverIp = InetAddress.getLocalHost().getHostAddress();
	   Socket socket = new Socket(serverIp, 3000);
	   // ���� ���д� null ���ϵ�

	   if (socket != null) { // ������ ����Ǿ��ٸ�...
	    // 3. ������ �ش� Ŭ���̾�Ʈ ���� ��/��� ��Ʈ�� ����
	    BufferedReader br = new BufferedReader(
	      new InputStreamReader(socket.getInputStream()));
	    
	    ObjectOutputStream objOut = new ObjectOutputStream(
	      socket.getOutputStream());

	    // 4. ���Ͽ� ����� ������ �о ������ ����
	    //���� �б�� ��Ʈ���� �����Ѵ�.
	    ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("books.dat"));
	    
	    try {
	    	
	     while(true) {
	      Object obj = objIn.readObject();
	      objOut.writeObject(obj);
	     }
	     
	     //�Է��� ���߿� ������� ������ ����, �Ǵ� ������� ��Ʈ���� ���ᰡ �ִ� ���� ��Ÿ���� �ñ׳��Դϴ�.
	    } catch (EOFException e) {
	    	
	     objOut.writeObject(null);
	     objOut.flush();
	     String returnMessage = br.readLine();
	     
	     if(returnMessage.equals("exit")) {
	      // 5. ��Ʈ�� �ݳ�
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
	 
	 
	 // Book ��ü ���� ��¿�
	 public void fileSave() {  
		 
		 List <Book> bookList = new ArrayList<Book>();
		 
		  bookList.add(new Book("�ڹٸ� ��ƶ�", 30000));
		  bookList.add(new Book("����Ŭ ����", 35000));
		  bookList.add(new Book("��ǥ�� 2.0", 27500));
		  bookList.add(new Book("�ڹ� Servlet/JSP", 28000));
		  bookList.add(new Book("ajax ����", 15000));

		  System.out.println(bookList);
	   
	   try (ObjectOutputStream oOut = new ObjectOutputStream(new FileOutputStream("books.dat"));) {
		   
	    for (int i = 0; i < bookList.size(); i++) {
	     oOut.writeObject(bookList.get(i));
	     //���Ͽ� �ۼ�
	     oOut.flush();
	    }
	   } catch (Exception e) {
	    e.printStackTrace();
	   }
	  }		
	 
	 //Book ��ü ���� �Է¿�
	 public void fileOpen() {

		 List <Book>bookList = new ArrayList<Book>();
		 
		 //try-catch-resources
		 //AutoCloserable �������̽��� �����ϰ� �ִٸ�
		 //Stream�� ����ϰ� �� �� �ڵ����� clos()�޼��带 ȣ�����ش�.
		 
		 //ObjectInputStream ��Ʈ������ ���� ��ü ������ �б� ���� ���Ǵ� ���� ����Ʈ ��Ʈ��
		 //FileInputStream ���Ϸκ��� �����͸� �о� ���̱� ���� ����ϴ� �⺻ ����Ʈ ��Ʈ�� Ŭ����
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
