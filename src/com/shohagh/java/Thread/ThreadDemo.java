package com.shohagh.java.Thread;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using anonymous class
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				doWork();
			}
		});
		t1.start();
		
		//using lambda expression
		Thread t2 = new Thread( () -> {
			doWork();
		});
		t2.start();
	}

	private static void doWork() {
		System.out.println("Doing some important work!");
	}

}
