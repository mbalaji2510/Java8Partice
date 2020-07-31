package com.hexa.java8;

import java.util.HashMap;
import java.util.Map;

public class ForEachMapEx {
	
	public static void main(String[] args) {
		
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);
		
		for(Map.Entry<String, Integer> entry : items.entrySet()) {
			
			System.out.println("Item: " + entry.getKey() + "Count: "+ entry.getValue());
		}
		
		// using Java 8
		System.out.println("============using Java8============");
		
		items.forEach((k,v)->System.out.println("items:"+k + " Count "+v));
		
		items.forEach((k,v)-> {
			System.out.println("Item : " +k + " Count "+ v);
			if("E".equals(k)) {
				// do something here
				System.out.println("Hello E");
			}
		});
		
	}
	
	
}
