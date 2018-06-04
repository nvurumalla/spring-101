package com.walmart.tutorials;

public class Triangle implements Shape {

	private String type;
	private int height;

	
	//version 1
	public Triangle(String type) {
		this.type = type;
	}
	
	//version 2
	public Triangle(int height) {
		this.height = height;
	}
	
	////version 3
	public Triangle(String type, int height) {
		this.type = type;
		this.height = height;
	}
	
	public String getType() {
		return type;
	}
	
	public int getHeight() {
		return height;
	}

	// intentionally commenting the setter method to showcase constructor injection!  
	
//	public void setType(String type) {
//		this.type = type;
//	}

	

	public void draw() {
		System.out.println(getType() + " Triangle is drawn of height "+ getHeight());
	}
}
