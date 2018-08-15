package com.revature.fourpillars;
// This is an example of abstraction.
public abstract class Animal {
//	These private variables are an example of encapsulation
	private String name;
	private String habitat;
	private int height; 

public Animal(String name, String habitat, int height) {
	super();
	this.name= name;
	this.height=height;
    this.habitat = habitat;
}
// the following is an example of polymorphism of methods
public void animalname() {
	System.out.println("Animal Name: "+name);
}
public void animalhabitat() {
	System.out.println("Habitat: "+ habitat);
}
public void animalheight() {
	System.out.println("Height: : "+ height);
}
}