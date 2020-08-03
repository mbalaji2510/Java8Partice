package com.hexa.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.hexa.thread.ThreadEx.Task;

public class ExecutorThreadEx {

	public static void main(String[] args) {
		// Create Thread pool
		ExecutorService service = Executors.newFixedThreadPool(10);
		// submit the tasks for execution
		for (int i = 0; i < 10; i++) {
			
			service.execute(new Task());
			//Thread thread1 = new Thread(new Task());
			//thread1.start();
		}

		System.out.println("Thread Name:After Task completed " + Thread.currentThread().getName());

	}

	static class Task implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Thread Name:" + Thread.currentThread().getName());

		}

	}
}
