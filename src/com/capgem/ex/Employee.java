package com.capgem.ex;

public class Employee {
	
	int id;
	String name;
	String grade;
	Integer salary;
	public Employee(int id, String name, String grade,Integer salary) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.salary=salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	

}
