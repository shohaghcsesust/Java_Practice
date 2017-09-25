package com.shohagh.java.Serialization;

import java.io.Serializable;

public class Student implements Serializable {
	/**
	 * Serialization in java is a mechanism of writing the state of an object into a byte stream.
	 * It is mainly used to travel object's state on the network (known as marshaling).
	 * */
	private static final long serialVersionUID = 5983110059910063522L;
	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
