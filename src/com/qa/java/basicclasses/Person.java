package com.qa.java.basicclasses;

public class Person {
	public String name;
	public int age;
	public String gender;
	public boolean isBreathing;

	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public void read(Book b) {
		System.out.println(this.name + " is reading the book titled: " + b.title);
	}

	public boolean isStillBreathing() {
		return isBreathing;
	}

	public String speak(String msg) {
		return this.name + " says: " + msg;
	}

}