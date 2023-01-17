package com.java.multithreading;

class RunThread1 implements Runnable{
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

class RunThread2 implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Invoking Thread 2");
			
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				System.out.println(e.getMessage());
				Thread.currentThread().interrupt();
			}
		}
	}
}
public class ImplemetingRunnable {

	public static void main(String[] args) {
		
		RunThread1 obj1=new RunThread1();
		RunThread2 obj2=new RunThread2();
		
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		
		t1.start();
		t2.start();
	}
}
