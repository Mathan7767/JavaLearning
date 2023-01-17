package com.java.multithreading;

class Counter {
	
	private int count;
	
	public synchronized void increament() {
		count++;
	}
	
	int getCounter() {
		return count;
	}
}
public class SynchronizedKeyword {

	public static void main(String[] args) throws InterruptedException {
		
		Counter c=new Counter();
		Thread t1=new Thread(
				()->{
					for(int i=0;i<10000;i++)
						c.increament();
				}
			);
		
		Thread t2=new Thread(
				()->{
					for(int i=0;i<10000;i++)
						c.increament();
				}
			);
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Count: "+c.getCounter());
	}
}
