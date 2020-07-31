package com.hexa.java8;

import java.util.ArrayList;
import java.util.List;

public class ForEachListEx {
	public static void main(String[] args) {
		List<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");
		
		// using Lambda
		items.forEach(item->System.out.println(item));
		
		// Output for particular value
		items.forEach(item-> {
			if("C".equals(item)) {
				System.out.println(item);
			}
		});
		
		// method reference 
		System.out.println("Using the method reference");
		
		items.forEach(System.out::println);
		
		// using streams filter
		System.out.println("using streams filter");
		items.stream().filter(s->s.contains("B"))
		.forEach(System.out::println);
		
		
	}
	

}
