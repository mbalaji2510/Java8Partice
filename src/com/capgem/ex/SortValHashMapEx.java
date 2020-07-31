package com.capgem.ex;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SortValHashMapEx {
	
	public static void main(String[] args) {
		
		Map<String, Integer> mapData = new HashMap<>();
		
		mapData.put("clothes", 120);
		mapData.put("grocery", 150);
		mapData.put("transportation", 100);
		mapData.put("utility", 130);
		mapData.put("rent", 1150);
		mapData.put("miscellneous", 90);
		
		System.out.println("Before sorting ::"+ mapData);
		
		Map<String, Integer> sorted = mapData .entrySet() .stream() .
				sorted(Map.Entry.<String, Integer>comparingByValue()) .
				collect( Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2, LinkedHashMap::new));

		System.out.println(sorted);
				
	}

	

}
