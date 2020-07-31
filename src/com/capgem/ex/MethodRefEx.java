package com.capgem.ex;

import java.util.ArrayList;

public class MethodRefEx {
	public static void main(String[] args) {
		
		ArrayList<Employee> empData = new ArrayList<>();
		
		empData.add(new Employee(105,"Bala","dev",1200));
		
		empData.add(new Employee(103,"Althaf","Test",69));
		empData.add(new Employee(102,"Indira","QA",12400));
		
		ComparatorProvider provider = new ComparatorProvider();
		
		empData.sort(provider::compareBySalary);
		
		empData.forEach(e->System.out.println(e.id+"  "+e.salary));
		
	}
	

}
