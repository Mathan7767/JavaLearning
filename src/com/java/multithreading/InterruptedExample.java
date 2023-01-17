package com.java.multithreading;

/*
 * new thread is created and started,
 * and the main thread sleeps for 2 seconds.
 * After 2 seconds, the main thread interrupts the new thread, 
 * which causes the new thread to exit 
 * its infinite loop and terminate.
 */

public class InterruptedExample {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println("Running...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted!");
                Thread.currentThread().interrupt();
            }
        }
    }
}
