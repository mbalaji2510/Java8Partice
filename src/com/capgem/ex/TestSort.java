package com.capgem.ex;

import java.util.ArrayList;
import java.util.Collections;

public class TestSort {
	
	public static void main(String[] args) {
		
		ArrayList<Student> studata = new ArrayList<>();
		studata.add(new Student(120,"balaji",30));
		studata.add(new Student(121,"indira",32));
		studata.add(new Student(123,"add",34));
		studata.add(new Student(122,"bbb",35));
		studata.add(new Student(120,"balaji",30));
		studata.add(new Student(120,"balaji",30));
		
		Collections.sort(studata);
		
		for (Student student : studata) {
			
			System.out.println(student.rollNo+" "+student.name+" "+student.age);
			
		}
	}

}
