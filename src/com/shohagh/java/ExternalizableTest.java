package com.shohagh.java;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
/**
 * The Externalizable interface provides the facility of writing the state of an object into a byte stream in compress format. It is not a marker interface.
 * */
public class ExternalizableTest implements Externalizable{
	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		String test = (String)in.readObject();
		System.out.println(test);
		in.close();
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject("test");
        out.close();
	}
	
	public static void main(String[] arg) throws IOException, ClassNotFoundException {
		ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutput out = new ObjectOutputStream(buffer);
        Externalizable test = new ExternalizableTest();
		test.writeExternal(out);

        ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
		test.readExternal(in);
	}
}
