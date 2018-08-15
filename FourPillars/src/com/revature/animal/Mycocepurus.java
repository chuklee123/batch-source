/**
 * 
 */
package com.revature.animal;

import com.revature.enums.Reproduction;
import com.revature.enums.Sex;
import com.revature.exceptions.CannotBreedException;

/**
 * @author Brendan DeLeeuw
 *
 */
public class Mycocepurus extends Animal {

	/**
	 * This is a subclass demonstrating Inheriting from the Animal class
	 * Inheritance allows this class to access most of the same field and methods
	 * as the super class but cannot access the FULLNESS_FACTOR variable that is
	 * fully encapsulated in the parent class.
	 */
	public Mycocepurus(int maxFullness) {
		this.sex = Sex.FEMALE;
		species = "Formicidae";
		this.maxFullness = maxFullness;
		reproduction = Reproduction.ASEXUALLY;
	}

	/* (non-Javadoc)
	 * @see com.rev.animal.Animal#breed(com.rev.animal.Animal)
	 */
	@Override
	public Animal breed(Animal other) throws CannotBreedException {
		if (other != this) {
			throw new CannotBreedException("This species of ant does not breed with a partner");
		}
		return new Mycocepurus(2);  // The number should be randomized.
	}

}
