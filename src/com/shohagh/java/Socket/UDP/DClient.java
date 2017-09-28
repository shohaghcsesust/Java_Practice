package com.shohagh.java.Socket.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DClient {

	public static void main(String[] args) {
		String host = "127.0.0.1";
		int port = 3000;
		String message = "Welcome to java datagram socket programming...";
		try{
			DatagramSocket ds = new DatagramSocket();
			InetAddress ip = InetAddress.getByName(host);
			DatagramPacket dp = new DatagramPacket(message.getBytes(), message.length(), ip, port);
			ds.send(dp);
			ds.close();
		} catch(IOException io){
			io.printStackTrace();
		}
	}

}
