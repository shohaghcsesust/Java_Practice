package com.shohagh.java.Socket.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class DServer {

	public static void main(String[] args){
		int port = 3000;
		int length = 1024;
		try{
			DatagramSocket ds = new DatagramSocket(port);
			byte[] buf = new byte[length];
			DatagramPacket dp = new DatagramPacket(buf, length);
			ds.receive(dp);
			String msg = new String(dp.getData(),0,dp.getLength());
			System.out.println("Message:"+msg);
			ds.close();
		}
		catch(SocketException ex){
			ex.printStackTrace();
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
	}

}
