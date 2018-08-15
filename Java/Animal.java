package com.revature.animals;
import AgeException.java;

public class Animal {
	private int numLimbs;
	private int age;
        private boolean canSwim;
	private boolean canFly;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) throws AgeException {
		if(age < 0) {
			throw new AgeException();
		}
		this.age = age;
	}

	public Animal() {
		super();
	}
	
	
	public Animal(int numLimbs) {
		this.numLimbs = numLimbs;
	}
	
	public Animal(int numLimbs, int age) {
		this.numLimbs = numLimbs;
		this.age = age;
	}
	
	public Animal(int numLimbs, int age, boolean canSwim, boolean canFly) {
		this.numLimbs = numLimbs;
		this.age = age;
		this.canSwim = canSwim;
		this.canFly = canFly; 
	}

	
	public int getNumLimbs() {
		return numLimbs;
	}
	public void setNumLimbs(int numLimbs) {
		this.numLimbs = numLimbs;
	}
	
	public boolean getCanSwim() {
		return canSwim;
	}
	
	public void setCanSwim (boolean canSwim) {
		this.canSwim = canSwim;
	}

	public boolean getCanFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

	
	
}
