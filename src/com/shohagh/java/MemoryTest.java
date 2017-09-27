package com.shohagh.java;

public class MemoryTest {

	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
	        int len = Integer.MAX_VALUE - i;
	        try {
	            char[] ch = new char[len];
	            System.out.println("len: " + len + " OK");
	        } catch (Error e) {
	            System.out.println("len: " + len + " " + e);
	        }
	    }
	}

}
