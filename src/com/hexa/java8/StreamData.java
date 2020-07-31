package com.hexa.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamData {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list = Arrays.asList(3,5,6,3,2);
		
		Stream<Integer> streamEx = list.stream();
		
		streamEx.forEach(p-> System.out.println(p*2));
		
		List<Integer> list2 = new ArrayList<>();
		
		list2 = Arrays.asList(3,5,6,3,2);
		
		list2.stream().forEach(x-> System.out.println(x*3));
		
		//using
		
		List<Integer> list3 = new ArrayList<>();
		list3= Arrays.asList(4,5,6,3,2);
		
		list3.stream().forEach(y-> {
			if(y.equals(4)) {
				y=y*4;
				System.out.println(y);
			}
		});
		
		
		
	}
}
