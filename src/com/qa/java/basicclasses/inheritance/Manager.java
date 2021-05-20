package com.qa.java.basicclasses.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Person {
	private List<Employee> employees = new ArrayList<>();
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void addEmployee(Employee e) {
		this.employees.add(e);
	}
	
	public void removeEmployee(int index) {
		employees.remove(index);
	}
	
	public void printAllEmployees() {
		for(Employee e : employees) {
			System.out.println(e.getName());
		}
	}
}
