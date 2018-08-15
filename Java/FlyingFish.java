package com.revature.animals;
import Animal.java;

public class FlyingFish extends Fish {

	public FlyingFish(int age) {
		super(age);
	}


	public FlyingFish() {
		super();
	}
	
	
	public void fly() {
		// this is abstraction at work
		System.out.println("The flying fish flew");
	}

}
