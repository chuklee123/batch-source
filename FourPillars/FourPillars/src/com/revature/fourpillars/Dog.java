package com.revature.fourpillars;

public class Dog extends Animal {
	
	public boolean IsCarnivore =true;
	public boolean IsDirty=true;
	
public Dog(String name, String habitat, int height ) throws AnimalHeightException{
	super(name,habitat,height);
	if (height<0) {
		throw new AnimalHeightException("Height cannot be less than 0 inches!");
	}
	if (height>150) {
		throw new AnimalHeightLargeException("Height cannot exceed 150 inches!");
	}
}
	@Override
	public String toString() {
		return ("This animal is a carnivore"+IsCarnivore+"\n"+
	             "This animal is a mammal"+IsDirty+"\n")
	}
}
