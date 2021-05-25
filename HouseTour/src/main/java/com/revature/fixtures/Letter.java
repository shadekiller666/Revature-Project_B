package com.revature.fixtures;

public class Letter extends Fixture {
	public Letter(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
	}
	
	public void examine() {
		System.out.println("The letter says:");
		System.out.println(this.getLongDescription());
	}
}
