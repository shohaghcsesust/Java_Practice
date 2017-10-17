package com.shohagh.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/***
 * transient is a variables modifier used in serialization. At the time of serialization, 
 * if we don’t want to save value of a particular variable in a file, 
 * then we use transient keyword. When JVM comes across transient keyword, 
 * it ignores original value of the variable and save default value of that variable data type.
 * @author Md. Ahsan Kabir
 *
 */
public class TransientTest implements Serializable{

	// Normal variables
    int i = 10, j = 20;
 
    // Transient variables
    transient int k = 30;
 
    // Use of transient has no impact here
    transient static int l = 40;
    transient final int m = 50;
 
    public static void main(String[] args) throws Exception
    {
        TransientTest input = new TransientTest();
 
        // serialization
        FileOutputStream fos = new FileOutputStream("abc.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(input);
 
        // de-serialization
        FileInputStream fis = new FileInputStream("abc.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        TransientTest output = (TransientTest)ois.readObject();
        System.out.println("i = " + output.i);
        System.out.println("j = " + output.j);
        System.out.println("k = " + output.k);
        System.out.println("l = " + output.l);  
        System.out.println("m = " + output.m);
        
        TransientTest test = new TransientTest();
        test.testTransient(test);
        System.out.println("after creating transient Object :: k="+test.k);
    }
    public void testTransient(Object test){
    	TransientTest test2=(TransientTest)test;
    	System.out.println(test2.k);
    }
}
