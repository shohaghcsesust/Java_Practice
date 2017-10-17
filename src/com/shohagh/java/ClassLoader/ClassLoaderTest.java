package com.shohagh.java.ClassLoader;

public class ClassLoaderTest {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		ClassLoaderTest ct = new ClassLoaderTest();
		ct.doSomething();
	}
	public void doSomething() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
//		B b = new B();
//		B b = (B) ClassLoaderTest.class.getClassLoader().loadClass("B").newInstance();
		B b = B.class.newInstance();
		b.doSomethingElse();
	}
}
