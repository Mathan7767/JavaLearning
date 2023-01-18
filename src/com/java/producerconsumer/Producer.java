package com.java.producerconsumer;

public class Producer implements Runnable{

	private Buffer buffer;
	Producer(Buffer buffer){
		this.buffer=buffer;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=3;i++) {
			buffer.put(i);
		}
	}
}
