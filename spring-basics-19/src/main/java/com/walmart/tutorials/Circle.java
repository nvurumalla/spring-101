package com.walmart.tutorials;

import org.springframework.beans.factory.annotation.Autowired;

public class Circle implements Shape {

	private Point center;

	public Point getCenter() {
		return center;
	}

	@Autowired
	public void setCenter(Point center) {
		this.center = center;
	}

	public void draw() {
		System.out.println("Circle drawn with center at :"+center.getX()+","+center.getY());
	}
}
