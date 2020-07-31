package com.capgem.ex;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmpSort {
	
	public static void main(String[] args) {
		
		// add data into lost
		ArrayList<Employee> empData = new ArrayList<>();
		
		empData.add(new Employee(55,"Bala","dev",1200));
		
		empData.add(new Employee(103,"Althaf","Test",2000));
		empData.add(new Employee(102,"Indira","QA",12400));
		
		/*ArrayList<String> dummy = new ArrayList<>();
		dummy.add("Balaji");
		dummy.add("Althag");
		dummy.add("Gopi");
		dummy.add("Indira");
		dummy.add("Venkata");
		//Collections.sort(empData);
		
		Collections.sort(dummy);
		
		for (String data : dummy) {
			
			System.out.println(data);
			
		}*/
		
		// emp id comparator
		Collections.sort(empData, new EmpIdComparator());
		
		for (Employee employee : empData) {
			
			System.out.println(employee.id+" "+employee.name+" " +employee.grade);
			
		}
		
		// emp name comparator
		
		Collections.sort(empData, new EmpNameComparator());
		
		for (Employee employee1 : empData) {
			
			System.out.println(employee1.id+" "+employee1.name+" " +employee1.grade);
			
		}

	}
	
	
}
