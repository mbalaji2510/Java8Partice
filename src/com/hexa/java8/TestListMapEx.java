package com.hexa.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestListMapEx {
	public static void main(String[] args) {
		
		List<Hosting> hostList = new ArrayList<>();
		
		hostList.add(new Hosting(1, "liquidweb.com", 80000));
		hostList.add(new Hosting(2, "linode.com", 90000));
		hostList.add(new Hosting(3, "digitalocean.com", 120000));
		hostList.add(new Hosting(4, "aws.amazon.com", 879999));
		hostList.add(new Hosting(5, "mkyong.com", 1));
		//hostList.add(new Hosting(6, "linode.com", 100000));
		
		// key = id ,Value -websites
		
//		 Map<Integer, String> result1 = hostList.stream().collect(
//	                Collectors.toMap(Hosting::getId, Hosting::getName));
		
		Map<String, Long> result1 = hostList.stream().
				collect(Collectors.toMap(Hosting::getName, Hosting::getWebsites));
		
		System.out.println(result1);
		
		// key id , value - name;
		
		Map<Integer,String> result2Map = hostList.stream().
				collect(Collectors.toMap(Hosting::getId, Hosting::getName));
		
		System.out.println(result2Map);
		
		// using Lambda Expressions
		
		Map<Integer,String> result3 = hostList.stream().
				collect(Collectors.toMap(x->x.getId(), x->x.getName()));
		
		System.out.println(result3);
		
		// using map
		List<String> collectMap = hostList.stream().map(x -> x.getName().toUpperCase()).collect(Collectors.toList());
		System.out.println(collectMap);
		}

}
