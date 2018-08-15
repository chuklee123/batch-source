package com.revature.fourpillars;
// The following is an example of inheritance
public class Hyena extends Animal {
	
	public boolean IsCarnivore =true;
	public boolean IsMammal=true;
	
public Hyena(String name, String habitat, int height ) throws AnimalHeightException{
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
	             "This animal is a mammal"+IsMammal+"\n")
	}
}

