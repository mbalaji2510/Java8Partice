package com.hexa.java8;
@FunctionalInterface
public interface InterFace1{
	
	void printdata();
	default void display1() {
		
		System.out.println("From Interface1");
		
	}

}
