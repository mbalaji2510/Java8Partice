package com.capgem.ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountWords {

	public static void main(String[] args) {
		
		/*List<String> wdList = new ArrayList<>();
		
		wdList.add("welcome to CG and welcome to CG");
		*/
		
		String input = "welcome to CG and welcome to CG";
		
		// first convert string into list with split values
		
		List<String> list = Stream.of(input).map(s-> s.split(" ")).flatMap
				(Arrays::stream).collect(Collectors.toList());
		
		Map<String, Integer> wordCounter = list.stream().collect(Collectors.toMap(w->w.toLowerCase(), w->1,Integer::sum));
		
		System.out.println(wordCounter);
		 
	}
	
	
	
}
