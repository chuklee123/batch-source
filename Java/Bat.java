package com.revature.animals;
import Animal.java;

public class Bat extends Animal {
	
	public Bat(boolean sleepsUpsideDown) {
		super();
		this.sleepsUpsideDown = sleepsUpsideDown;
	}

	private boolean sleepsUpsideDown;
	
	public boolean sleepsUpsideDown() {
		return sleepsUpsideDown;
	}
	
	public void setSleepsUpsideDown(boolean sleepsUpsideDown) {	
		this.sleepsUpsideDown = sleepsUpsideDown;
	}
}	
