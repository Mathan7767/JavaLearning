package com.java.multithreading.volatilekeyword;

/*
    Without Volatile
    Thread-2 old Value 0
	Thread-0 old Value 0
	Thread-0 new Value 2
	Thread-1 old Value 0
	Thread-1 new Value 3
	Thread-3 old Value 0
	Thread-4 old Value 1
	Thread-4 new Value 5
	Thread-2 new Value 1
	Thread-3 new Value 4
 */
 
  /*
 	With Volatile
 	Thread-1 old Value 0
	Thread-1 new Value 1
	Thread-3 old Value 0
	Thread-3 new Value 2
	Thread-0 old Value 0
	Thread-0 new Value 3
	Thread-2 old Value 0
	Thread-2 new Value 4
	Thread-4 old Value 1
	Thread-4 new Value 5
 */
public class VolatileMain {

	private final static int noOfThreads=5;
	
	public static void main(String[] args) throws InterruptedException {
		
		DataHolder data=new DataHolder();
		Thread[] threads = new Thread[noOfThreads];
		
		for(int i=0;i<noOfThreads;i++)
			threads[i]=new VolatileThread(data);
		
		for(int i=0;i<noOfThreads;i++) {
			threads[i].start();
//			threads[i].join();
		}
	}
}
