package com.java.producerconsumer;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Buffer {

	private Queue<Integer> buffer=
			new ConcurrentLinkedQueue<>();
	
	
	void put(int i) {
		buffer.add(i);
		System.out.println("Producer Produced :"+i);
	}
	
	void get() {
		System.out.println("Consumer received:"+buffer.poll());
	}
}
