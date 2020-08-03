package com.hexa.thread;

import java.util.concurrent.TimeUnit;

public class Task implements Runnable {
	
	private String name;
	
	

	public Task(String name) {
		super();
		this.name = name;
	}

	public String getName() {
        return name;
    }
 

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Long duration = (long) Math.random()*10;
		System.out.println("Executing : " +name);
		try {
			TimeUnit.SECONDS.sleep(duration);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
