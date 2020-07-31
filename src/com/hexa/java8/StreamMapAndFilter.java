package com.hexa.java8;

import java.util.ArrayList;
import java.util.List;

public class StreamMapAndFilter {
	
	public static void main(String[] args) {
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		
		//intermediate operations 
		
		memberNames.stream().filter((s) -> s.startsWith("A"))
        .forEach(System.out::println);
		
		// using map
		System.out.println("using Map");
		memberNames.stream().filter((x) -> x.startsWith("A"))
		.map(String:: toUpperCase).forEach(System.out::println);
		
		// Sorted 
		System.out.println("using sorted");
		memberNames.stream().sorted().map(String:: toUpperCase)
		.forEach(System.out::println);
		
		memberNames.stream().map(x-> x.startsWith("A")).forEach(System.out::println);
		
		System.out.println("finaly data");
		memberNames.stream().sorted().forEach(System.out::println);
	}

}
