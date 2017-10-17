package com.shohagh.java.Exception;

public class ExceptionTest {
	public static void main(String[] args) {
		String name=null;
		try{
			int msg = Integer.parseInt(name); 
			System.out.println(msg);
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}
