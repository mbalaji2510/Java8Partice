package com.capgem.ex;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamEx {
	
	// Parallel Stream exmaple for student data
	public static void main(String[] args) {
		long t1,t2;
		List<Employee> empList = new ArrayList<Employee>();
		List<Employee> empList1 = new ArrayList<Employee>();
		for(int i=0; i<100; i++) {
			empList.add(new Employee(101,"B","java",18000));
			empList.add(new Employee(102,"C","SAP",14000));
			empList.add(new Employee(104,"D","dotnet",12000));
			empList.add(new Employee(103,"E","test",14000));
			empList.add(new Employee(105,"D","AWS",20000));
		}
		
		// using sequential Strem 
		t1 = System.currentTimeMillis();
		System.out.println("Using Stream API"
		+empList.stream().filter(e->e.getSalary()>15000).count());
		t2 = System.currentTimeMillis();
        System.out.println("Sequential Stream Time Taken?= " + (t2-t1) + "\n");
		// using paralleler stream
		t1= System.currentTimeMillis();
		System.out.println("Using ParallerStream"+ empList.parallelStream().filter(e->e.getSalary()>15000).count());
		t2 = System.currentTimeMillis();
        System.out.println("Sequential Stream Time Taken?= " + (t2-t1) + "\n");
		
	}
	

}
