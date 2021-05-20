package com.qa.java.basicclasses;

public class Door {
	private boolean isOpen;
	
	
	Door(){
		
	}
	
	public void open() {
		isOpen = true;
	}
	
	public void close() {
		isOpen = false;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	
	
}
