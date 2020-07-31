package com.capgem.ex;

import java.util.Comparator;

public class EmpIdComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.id==o2.id)
		return 0;
		else if(o1.id > o2.id) 
		return 1;
		else
		return -1;
		
	}

}
