package com.revature.animals;

public class Bat extends Mammal {
	
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
