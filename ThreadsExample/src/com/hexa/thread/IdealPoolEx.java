package com.hexa.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class IdealPoolEx {
	
	public static void main(String[] args) {
		//get the count of available cores
		int coreCount = Runtime.getRuntime().availableProcessors();
		// create thread pool
		ExecutorService service = Executors.newFixedThreadPool(coreCount);
		// for submit tasks for executions
		for(int i=0; i<100; i++) {
			service.execute(new CpuIntensiveTask());
		}
		System.out.println(Thread.currentThread().getName());
	}
	static class CpuIntensiveTask implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println(Thread.currentThread().getName());
		}
		
	}
}
