package com.kh.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;

public class Client {
	public void fileUpload() {
		int port = 3000;
		String serverIP = "192.168.20.34";
		Socket socket;
		try {
			socket = new Socket(serverIP, port);
			
			if(socket != null) {
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("books.dat"));
				ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	public void fileSave() {
		try (FileOutputStream fos = new FileOutputStream("books.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);){
			
			ArrayList<Book> list = new ArrayList<Book>();
			list.add(new Book("자바를 잡아라", 30000));
			list.add(new Book("오라클 정복",35000));
			list.add(new Book("웹표준 2.0", 27500));
			list.add(new Book("자바 Servlet/JSP", 28000));
			list.add(new Book("ajax사용법", 15000));
			
			for(Book b : list) {
				oos.writeObject(b);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

