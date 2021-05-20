package com.qa.java.basicclasses;

public class House {

	private Door frontDoor;
//	private ArrayList<Window> windows;
//	Private Yard backyard;
//	Private Yard frontyard;
//	private Kitchen frontyard;

	public House(Door frontDoor) {
		super();
		this.frontDoor = new Door();
	}

	public void openFrontDoor() {
		this.frontDoor.open();
	}

	public void closeFrontDoor() {
		this.frontDoor.close();
	}
	
	
}
