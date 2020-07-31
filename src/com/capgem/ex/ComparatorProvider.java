package com.capgem.ex;

public class ComparatorProvider {
	
	public int compareBySalary(Employee e1, Employee e2) {
		return e1.getSalary().compareTo(e2.getSalary());
	}
	
	public int compareByName(Employee e1, Employee e2) {
		return e1.getName().compareTo(e2.getName());
	}

}
