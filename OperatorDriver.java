package com.revature.operators;

public class OperatorDriver {
	public static void main(String [] args) {
		int a = 10;
		
		System.out.println("a++: " + a++ + " a:" + a);
		
		int x = 6;
		int y = x+1;
		int z = y+1;
		
		String s1 = x>y ? "Hello" : "World";
		System.out.println(s1);
	}
}
