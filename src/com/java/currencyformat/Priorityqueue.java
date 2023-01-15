package com.java.currencyformat;

import java.util.PriorityQueue;

public class Priorityqueue {

	public static void main(String[] args) {
		PriorityQueue<Integer> queue=new PriorityQueue<>();
		queue.add(5);
		queue.add(4);
	    queue.add(3);
	    queue.add(6);
	    queue.add(1);
	    
	    System.out.println(queue);
	}
}
