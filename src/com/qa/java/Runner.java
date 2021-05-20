package com.qa.java;

import com.qa.java.basicclasses.inheritance.Employee;
import com.qa.java.basicclasses.inheritance.Manager;
import com.qa.java.basicclasses.inheritance.Trainee;

public class Runner {

	public static void main(String[] args) {

		Employee employee = new Employee("John Myers", 232332);
		System.out.println(employee.getName());
		System.out.println(employee.getAnnualSalary());
		System.out.println(employee.getWeeklySalary());
		
		Trainee trainee = new Trainee("Amy Adams", 123);
		System.out.println(trainee.getName());	
		trainee.addSubject("Chemstry");
		trainee.addSubject("Calculus");
		trainee.addSubject("English");
		trainee.printSubects();
		
		Manager manager = new Manager("David Sobaska");
		manager.addEmployee(employee);
		manager.printAllEmployees();
	}

}
