package com.java.multithreading;

class Thread1 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			
			System.out.println("Invoking Thread 1");
			
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				System.out.println(e.getMessage());
				Thread.currentThread().interrupt();
			}
		}
	}
}

class Thread2 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Invoking Thread 2");
			
			try {
				Thread.sleep(1000);
				
				System.out.println(
						Thread.currentThread().isInterrupted());
			}catch(Exception e) {
				System.out.println(e.getMessage());
				Thread.currentThread().interrupt();
			}
		}
	}
}
public class ExtendingThread  
{
	public static void main(String[] args) throws InterruptedException {
	
		Thread1 thread1=new Thread1();
		Thread2 thread2=new Thread2();
		
		thread1.start();
		thread2.start();
		Thread.sleep(500);
	}
}
