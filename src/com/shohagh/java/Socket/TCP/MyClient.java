package com.shohagh.java.Socket.TCP;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class MyClient {
	public static void main(String[] args) {
		int port = 6666;
		String msg = "Hello TCP socket...";
		try {
			Socket s = new Socket("localhost", port);
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			dout.writeUTF(msg);
			dout.flush();
			dout.close();
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}