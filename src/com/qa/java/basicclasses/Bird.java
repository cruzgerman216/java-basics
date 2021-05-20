package com.qa.java.basicclasses;

public class Bird {

	protected String species;
	protected boolean canFly;
	protected int age;
	protected String featherColor;
	protected int numbEyes;
	protected boolean isFlying;

	public Bird() {
		this.species = "??";
		this.canFly = false;
		this.age = 0;
		this.isFlying = false;
		this.numbEyes = 0;
		this.featherColor = "black";
	}

	public Bird(String species, boolean canFly) {
		this();
		this.species = species;
		this.canFly = canFly;
	}

	public Bird(String species, boolean canFly, int age, String featherColor, int numbEyes, boolean isFlying) {
		this(species, canFly);
		this.age = age;
		this.featherColor = featherColor;
		this.numbEyes = numbEyes;
		this.isFlying = isFlying;
	}

	public void eat(int food) {

	}

	public void fly() {
		this.isFlying = true;
	}

	public void speak() {
		System.out.println("Chirp");
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
