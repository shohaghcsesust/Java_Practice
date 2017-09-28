package com.shohagh.java.Socket.TCP;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
	public static void main(String[] args) {
		int port = 6666;
		try {
			ServerSocket ss = new ServerSocket(port);
			Socket s = ss.accept();// establishes connection
			DataInputStream dis = new DataInputStream(s.getInputStream());
			String str = (String) dis.readUTF();
			System.out.println("message= " + str);
			ss.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
