package com.capgem.ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java8BasicFun {
	
	public static void main(String[] args) {
		
		// create the list of items 
		
		List<String> items = Arrays.asList("A","B","D","E","F");
		
		// using iterate the list of items using java8
		// using lambda expression
		items.forEach(item-> System.out.println(item));
		
		// getting particular value
		items.forEach(item-> {
			if("D".equals(item)) {
				System.out.println(item);
			}
		});

		// using method reference 
		System.out.println("Method reference example");
		
		items.forEach(System.out::println);
		
		//using Streams filter API
		System.out.println("Streams filter API example"+items.stream().count());
		
		long size =items.stream().count();
		System.out.println(size);
		items.stream().filter(item-> item.contains("B")).forEach(System.out::println);
		
		// using map
		
		System.out.println("using map");
		
		items.stream().map(item->item.startsWith("A")).forEach(System.out::println);
		
}
}