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
public class ClownFish extends Animal {

	/**
	 * This is a subclass demonstrating Inheriting from the Animal class
	 * Inheritance allows this class to access most of the same field and methods
	 * as the super class but cannot access the FULLNESS_FACTOR variable that is
	 * fully encapsulated in the parent class.
	 */
	public ClownFish() {
		sex = Sex.MALE;
		species = "Amphiprion";
		maxFullness = 4;
		reproduction = Reproduction.SEXUALLY;
	}

	/* (non-Javadoc)
	 * @see com.rev.animal.Animal#breed(com.rev.animal.Animal)
	 */
	@Override
	public Animal breed(Animal other) throws CannotBreedException {
		if(!other.getSpecies().equals(getSpecies())) {
			throw new CannotBreedException("Clownfish can only breed with ClownFish");
		}
		if(other.getSex().equals(Sex.FEMALE) && getSex().equals(Sex.FEMALE)) {
			throw new CannotBreedException("ClownFish need atleast one male to breed");
		}
		return new ClownFish();
	}

}
