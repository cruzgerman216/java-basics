package com.qa.java.basicclasses;

public class Duck extends Bird{
	
	// Is-a relationship (inheritance)
	// Has-a relationship (compositional)
	
	protected boolean isSwimming;
	protected boolean canSwim;
	
	public Duck() {
		super();
		this.isSwimming = false;
		this.canSwim = true;
	}
	
	
	public Duck(String species, boolean canFly, int age, String featherColor, int numbEyes, boolean isFlying) {
		super(species, canFly, age, featherColor, numbEyes, isFlying);
		this.isSwimming = false;
		this.canSwim = true;
	}


	public Duck(String species, boolean canFly) {
		super(species, canFly);
		this.isSwimming = false;
		this.canSwim = true;
	}


	public void speak() {
		System.out.println("Quack");
	}
	
	public boolean isSwimming() {
		return isSwimming;
	}
	public void setSwimming(boolean isSwimming) {
		this.isSwimming = isSwimming;
	}
	
	public boolean canSwim() {
		return isSwimming;
	}
	public void canSwim(boolean canSwim) {
		this.canSwim = canSwim;
	}
}
