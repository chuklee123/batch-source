package com.revature.operators;

public class operatorDriver {
	
	public static void main(String[] args) {
		
		int a = 10;
		int x = 6;
		int y = 7;
		int z = 8;
		
		
		System.out.println("the value of a is this bullshit: " + a++ + " yep, now it's " + a);
		System.out.println("the value of a is this bullshit: " + a++ + " yep, now it's " + a);
		
		String s1 = x>y ? "Hello" : "world";
		System.out.println(s1);
		
		String s2 = (x<y)&&(y<z) ? "Yellow" : "Green";
		System.out.println(s2);
		
		String s3 = (x*2>z) || (y>10) ? "cat" : "dog";
		System.out.println(s3);
		
	}
}
