package com.revature.fourpillars;

public class MainMethod {
      
	public static void main(String[] args) throws AnimalHeightException{
		Dog dog1 = new Dog("Dog","House",20);
		dog1.animalname();
		dog1.animalhabitat();
		dog1.animalheight();
		System.out.println(dog1.toString());
		Fox fox1 = new Fox("Fox","Forest",25);
		fox1.animalname();
		fox1.animalhabitat();
		fox1.animalheight();
		System.out.println(fox1.toString());
		Hyena hyena1  = new Hyena("Hyena","tundra",15);
		hyena1.animalname();
		hyena1.animalhabitat();
		hyena1.animalheight();
		System.out.println(hyena1.toString());
		Wolf wolf1 = new Wolf("Wolf","tundra",50);
		wolf1.animalname();
		wolf1.animalhabitat();
		wolf1.animalheight();
		System.out.println(wolf1.toString());
	}
}
