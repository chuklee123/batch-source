/**
 * 
 */
package com.revature.animal;

import com.revature.enums.Reproduction;
import com.revature.enums.Sex;
import com.revature.exceptions.CannotBreedException;
import com.revature.exceptions.ToFullException;

/**
 * @author Brendan DeLeeuw
 *
 * This Animal class and its sub classes will serve to demonstrate the four pillars of OOP.
 * Abstraction: 
 * 		This is shown in the eating and breeding of animals with their corresponding methods.
 * 		With Breeding the abstraction is done through Polymorphism. Declaring that all animals can breed here
 * 		allows for user code to be written using Animals and can call the breed method and not have to worry about
 * 		All the specifics behind it.
 * Encapsulation: 
 * 		All of the variables in this class and sub-classes are encapsulated with access modifiers and then exposed through their
 * 		Corresponding methods. Some only have getters and some can only be access through more abstract methods or not at all.
 * Polymorphism: 
 * 		The main of example here of Polymorphism is the breed method which gets overloaded in child classes.
 * 		Additionally the use of this inheritance class structure allows for covariance.
 * Inheritance: 
 * 		This comes is done by sub-classing this class and it is what allows the breeding polymorphism and covariance in user code.
 */
public abstract class Animal {
	// All of these instance variables are given protected status or higher.
	// This is done so that they can be effectively encapsulated in the object, and sub-class objects
	// allowing us to expose them in the way we want. 
	// For instance the sex of an Animal should not be changed and so only has a getter.
	protected Sex sex;
	protected Reproduction reproduction;  // Reproduction method (Sexually or ASexually)
	protected int fullness;
	protected String species;
	protected int maxFullness = 10;
	private final static int FULLNESS_FACTOR = 1;
	
	// Here breeding is being abstracted through the use of sub-classing
	// Any class that subclasses Animal needs to define the specifics of how that Orgainism breeds
	// but then when user code is written with that class and other sub-classes the specifics of how breeding
	// takes places does not matter to the person writing that user code.
	public abstract Animal breed(Animal other) throws CannotBreedException;
	
	/*
	 * Here the process of an animal eating has been abstracted.
	 * All animals need to eat and so any sub-class can use this eat method without know the specifics.
	 */
	public void eat() throws ToFullException{
		if (fullness > maxFullness) {
			throw new ToFullException("That animal is full and can't eat anymore");
		}
		fullness += FULLNESS_FACTOR;
	}
	
	public Sex getSex() {
		return sex;
	}
	
	public Reproduction getReproduction() {
		return reproduction;
	}
	
	public int getFullness() {
		return fullness;
	}
	
	public String getSpecies() {
		return species;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((reproduction == null) ? 0 : reproduction.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		result = prime * result + ((species == null) ? 0 : species.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (reproduction != other.reproduction)
			return false;
		if (sex != other.sex)
			return false;
		if (species == null) {
			if (other.species != null)
				return false;
		} else if (!species.equals(other.species))
			return false;
		return true;
	}
}
