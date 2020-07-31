package com.hexa.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaEx {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("node", "java", "python", "ruby");
		list.forEach(str -> System.out.println(str)); // lambda expressions
		
		List<String> list2 = Arrays.asList("Bhavi","Kaushi","Siri");
		list2.forEach(new Consumer<String>() {   //  anonymous class

			@Override
			public void accept(String str) {
				// TODO Auto-generated method stub
				System.out.println(str);
				
			}
		});
		
		// method references
		
		List<String> list3 = Arrays.asList("Test1","Test222");
		list3.forEach(System.out::println);
	}
}
