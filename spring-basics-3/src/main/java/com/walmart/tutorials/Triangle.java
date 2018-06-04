package com.walmart.tutorials;

public class Triangle implements Shape {

	private String type;

	public String getType() {
		return type;
	}

	// setter injection in action behind the scenes
	public void setType(String type) {
		this.type = type;
	}

	public void draw() {
		System.out.println(getType() + " Triangle is drawn");
	}
}
