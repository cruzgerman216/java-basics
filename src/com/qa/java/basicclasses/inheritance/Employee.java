package com.qa.java.basicclasses.inheritance;

public class Employee extends Person {
	private double annualSalary;
	private double weeklySalary;

	public Employee() {
		super();
	}

	public Employee(String name, double annualSalary) {
		super(name);
		this.annualSalary = annualSalary;
		calculateWeeklySalary();
	}
	
	public Employee(double annualSalary) {
		this();
		this.annualSalary = annualSalary;
		calculateWeeklySalary();
	}
	

	public void calculateWeeklySalary() {
		this.weeklySalary = annualSalary / 52;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

}
