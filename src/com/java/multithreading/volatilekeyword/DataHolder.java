package com.java.multithreading.volatilekeyword;

public class DataHolder {

	private volatile int counter=0;
	
	public int getCounter() {
		return counter;
	}
	
	public void incrementCounter() {
		counter++;
	}
}
