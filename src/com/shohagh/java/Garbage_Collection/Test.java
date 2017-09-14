package com.shohagh.java.Garbage_Collection;
/***
 * An object is eligible to be garbage collected if its reference variable is lost from the program during execution.Sometimes they are also called unreachable objects.
 * src: http://www.geeksforgeeks.org/how-to-make-object-eligible-for-garbage-collection/
 * @author Md. Ahsan Kabir
 */
public class Test {
	private String s;
	public Test(String s) {
		this.s = s;
	}
	public static void main(String[] args) {
		createObjectInsideMethod();
		
		//explicitly call garbage collector
		System.gc();
		
		//Reassigning the reference variable
		Test test1 = new Test("test1");
		Test test2 = new Test("test2");
		test1 = test2;
		System.gc();
		
		//Nullifying the reference variable
		Test test3 = new Test("test3");
		test3 = null;
		System.gc();
		
		//Anonymous object
		new Test("test4");
		System.gc();
	}
	//Object created inside a method
	static void createObjectInsideMethod(){
		Test test = new Test("test");
	}
	//before destroying the garbage object gc calls finalize method
	@Override
	protected void finalize() throws Throwable {
		System.out.println(this.s + " successfully garbage collected");
	}
}
