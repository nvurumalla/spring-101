package com.walmart.tutorials;

public class Circle implements Shape{

	public void draw() {
		System.out.println("Circle drawn");
	}

	@Override
	public String toString() {
		return "inside circle toString()";
	}
	
	
}
