package com.shohagh.java;

public class MemoryTestDemo {
	// Java code illustrating gc(), freeMemory()
	// and totalMemory() methods
	public static void main(String arg[]) {
		Runtime rm = Runtime.getRuntime();
		long memory1, memory2;
		Integer integer[] = new Integer[1000];

		// checking the total memeory
		System.out.println("Total memory is: " + rm.totalMemory());

		// checking free memory
		memory1 = rm.freeMemory();
		System.out.println("Initial free memory: " + memory1);

		// calling the garbage collector on demand
		rm.gc();

		memory1 = rm.freeMemory();

		System.out.println("Free memory after garbage " + "collection: "
				+ memory1);

		// allocating integers
		for (int i = 0; i < 1000; i++)
			integer[i] = new Integer(i);

		memory2 = rm.freeMemory();
		System.out.println("Free memory after allocation: " + memory2);

		System.out.println("Memeory used by allocation: " + (memory1 - memory2));

		// discard integers
		for (int i = 0; i < 1000; i++)
			integer[i] = null;

		rm.gc();

		memory2 = rm.freeMemory();
		System.out.println("Free memeory after  "+ "collecting discarded Integers: " + memory2);
	}
}