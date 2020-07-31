package com.hexa.java8;
@FunctionalInterface
public interface Interface2 {
void data();
default void display() {
		
		System.out.println("From Interface2");
		
	}


}
