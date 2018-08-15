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
public class Greyhound extends Animal {

	/**
	 * This is a subclass demonstrating Inheriting from the Animal class
	 * Inheritance allows this class to access most of the same field and methods
	 * as the super class but cannot access the FULLNESS_FACTOR variable that is
	 * fully encapsulated in the parent class.
	 */
	public Greyhound(Sex sex) {
		this.sex = sex;
		species = "DOG";
		maxFullness = 8;
		reproduction = Reproduction.SEXUALLY;
	}

	/* (non-Javadoc)
	 * @see com.rev.animal.Animal#breed(com.rev.animal.Animal)
	 * Specifics of breeding are implemented here.
	 */
	@Override
	public Animal breed(Animal other) throws CannotBreedException {
		if (!other.getSpecies().equals("DOG")) {
			throw new CannotBreedException("Greyhounds can only mate with dogs");
		}
		if (other.getSex().equals(getSex())) {
			throw new CannotBreedException("Greyhounds reproduce sexually and so need a mate of the opposite sex");
		}
		return new Greyhound(Sex.FEMALE);  // Species and Gender should be randomized.
	}

}
