package com.java.producerconsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Worker {

	public static void main(String[] args) { 

		Buffer buffer = new Buffer ();
	ExecutorService executorservice = Executors.newFixedThreadPool(2);
	// Calling one producer

	executorservice.execute (new Producer (buffer) ) ;
	executorservice.execute (new Consumer (buffer) ) ;

	executorservice.execute (new Consumer (buffer) ) ;

	executorservice.execute (new Consumer (buffer) ) ;
	
	executorservice.shutdown();


}
}
