package com.java.producerconsumer;

public class Consumer implements Runnable{

	private Buffer buffer;
	
	Consumer(Buffer buffer){
		this.buffer=buffer;
	}
	
	@Override
	public void run() {
		
		try {
			Thread.sleep(300);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			Thread.currentThread().interrupt();
		}
		
		buffer.get();
	}
}
