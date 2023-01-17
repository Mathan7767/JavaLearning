package com.java.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyRunnableThreadPool implements Runnable{
	
	private String threadName;
	MyRunnableThreadPool(String name){
		this.threadName=name;
	}
	
	@Override
	public void run() {
		System.out.println("Start Thread: "+ threadName);
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
			Thread.currentThread().interrupt();
		}
		System.out.println("End Thread :"+threadName);
	}
}
public class ThreadPoolExample {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		
		long startTime=System.currentTimeMillis();
		for(int i=1;i<=6;i++) {
			Runnable workerThread=new MyRunnableThreadPool("WorkedThread:"+i);
			executor.execute(workerThread);
		}
		long endTime=System.currentTimeMillis();
		executor.shutdown(); 
		while (!executor.isTerminated()) {   }  
		  
        System.out.println("Finished all threads. Time:"+(endTime-startTime));
        
		

	}
}
