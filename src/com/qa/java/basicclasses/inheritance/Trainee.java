package com.qa.java.basicclasses.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Trainee extends Person {
	private double bursary;
	private List<String> subjectsLearned = new ArrayList<>();

	public Trainee() {
		super();
		this.bursary = 0;
	}

	public Trainee(String name, double bursary) {
		super(name);
		this.bursary = bursary;
	}

	public void addSubject(String subject) {
		this.subjectsLearned.add(subject);
	}

	public double getBursary() {
		return bursary;
	}

	public void setBursary(double bursary) {
		this.bursary = bursary;
	}

	public List<String> getSubjectsLearned() {
		return subjectsLearned;
	}

	public void setSubjectsLearned(List<String> subjectsLearned) {
		this.subjectsLearned = subjectsLearned;
	}
	
	public void printSubects() {
		for(String subject : subjectsLearned) {
			System.out.println(subject);
		}
	}

}
