package com.revature.fourpillars;

public class AnimalHeightException extends RuntimeException{
	
    public AnimalHeightException(String message) {
        super("Height cannot be negative");
    }

}



