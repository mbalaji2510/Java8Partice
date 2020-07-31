package com.hexa.java8;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestDuplicatedKey {
	
	public static void main(String[] args) {
		
		List<Hosting> list = new ArrayList<>();
        list.add(new Hosting(1, "liquidweb.com", 80000));
        list.add(new Hosting(2, "linode.com", 90000));
        list.add(new Hosting(3, "digitalocean.com", 120000));
        list.add(new Hosting(4, "aws.amazon.com", 200000));
        list.add(new Hosting(5, "mkyong.com", 1));

        list.add(new Hosting(6, "linode.com", 100000));
        
        Map<String , Long> result = list.stream().
        		collect(Collectors.toMap(Hosting::getName, Hosting::getWebsites,
        				(oValue, nvalue)->oValue));
        // insertion order
        Map<String , Long> result1 = list.stream().
        		collect(Collectors.toMap(Hosting::getName, Hosting::getWebsites,
        				(oValue, nvalue)->oValue,LinkedHashMap::new));
        System.out.println(result);
        System.out.println(result1);
        
        // counting Example
        
        Map<String, Long> countMap = list.stream().
        		collect(Collectors.groupingBy(Hosting::getName,Collectors.counting()));
        System.out.println(countMap);
        //map retrive
        countMap.forEach((k,v)-> System.out.println("key"+k+"value"+v));
	}

}
