package com.java.multithreading.volatilekeyword;

public class VolatileThread extends Thread{

	private final DataHolder data;
	public VolatileThread(DataHolder data) {
		this.data=data;
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName()
				+" old Value "+data.getCounter() );
		data.incrementCounter();
		System.out.println(Thread.currentThread().getName()
				+" new Value "+data.getCounter() );
	}
}
