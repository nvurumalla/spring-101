package com.walmart.tutorials;

public class Triangle implements Shape {

	private String type;

	public Triangle(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}

	// intentionally commenting the setter method to showcase constructor injection!  
	
//	public void setType(String type) {
//		this.type = type;
//	}

	public void draw() {
		System.out.println(getType() + " Triangle is drawn");
	}
}
