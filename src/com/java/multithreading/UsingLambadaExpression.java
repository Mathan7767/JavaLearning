package com.java.multithreading;

public class UsingLambadaExpression {

	public static void main(String[] args) {
		Runnable obj1=() -> {
				for(int i=0;i<5;i++) {
					
					System.out.println("Invoking "+Thread.currentThread().getName());
					
					try {
						Thread.sleep(500);
					}catch(Exception e) {
						System.out.println(e.getMessage());
						Thread.currentThread().interrupt();
					}
				}
		};
		
		Runnable obj2=()-> {
				for(int i=0;i<5;i++) {
					
					System.out.println("Invoking "+Thread.currentThread().getName());
					
					try {
						Thread.sleep(500);
					}catch(Exception e) {
						System.out.println(e.getMessage());
						Thread.currentThread().interrupt();
					}
				}
			};
		
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		
		t1.setName("Thread1");
		t2.setName("Thread2");

		System.out.println("Prints the "
				+ "status of Thread 1 before Start"+t1.isAlive()); //true
		t1.start();
		t2.start();
		System.out.println("Prints the "
				+ "status of Thread 1 after Start"+t1.isAlive()); //false
		
		try {
			t1.join(); // t2 and main Thread waits until t1 executed
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			Thread.currentThread().interrupt();
		}
		
		try {
			t2.join(); // main Thread waits until t1 & t2 executed
		}catch(Exception e) {
			System.out.println(e.getMessage());
			Thread.currentThread().interrupt();
		}
		
		System.out.println("Execution completed");
	}
}
