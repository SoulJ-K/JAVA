package com.kh.test;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerManager {
	public ServerManager() {}
	public void serverStart() {
		int port = 3000;
		try {
			ServerSocket server = new ServerSocket(port);
			
			while(true) {
				Socket client = server.accept();
				InputStream in = client.getInputStream();
				
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
