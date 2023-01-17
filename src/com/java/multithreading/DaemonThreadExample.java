package com.java.multithreading;

/*
 * Daemon Thread continues to execute even after main thread executed 
 * but once Main thread is completed printing 'Exiting Main Thread'
 * JVM terminates the daemon thread as well. 
 * 
 */
public class DaemonThreadExample {
    public static void main(String[] args) {
        Thread daemonThread = new Thread(new MyDaemonThread());
        daemonThread.setDaemon(true);
        daemonThread.start();
        System.out.println("Exiting Main Thread");
    }
}

class MyDaemonThread implements Runnable {
    @Override
    public void run() {
        while(true) {
            try {
                System.out.println("Daemon Thread Running");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

