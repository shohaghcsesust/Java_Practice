package com.shohagh.java.Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Persist {
	public static void main(String args[]) throws Exception {
		Student s1 = new Student(2011331003, "shohagh");

		FileOutputStream fout = new FileOutputStream("f.txt");
		@SuppressWarnings("resource")
		ObjectOutputStream out = new ObjectOutputStream(fout);

		out.writeObject(s1);
		out.flush();
		System.out.println("success");
	}
}
