package com.hexa.thread;

public class ThreadEx {
	
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			Thread thread1 = new Thread(new Task());
			//thread1.start();
			//thread1.start(); // java.lang.IllegalThreadStateException
			//thread1.run(); we can run but its will invoke main thread
			thread1.start();
		}
		
		System.out.println("Thread Name:After Task completed "+Thread.currentThread().getName());
		
	}
	
	static class Task implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Thread Name:"+Thread.currentThread().getName());
			
		}
		
	}

}

