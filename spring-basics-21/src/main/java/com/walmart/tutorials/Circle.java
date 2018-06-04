package com.walmart.tutorials;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Circle implements Shape {

	private Point center;

	public Point getCenter() {
		return center;
	}

	@Resource
	//@Resource(name="pointC") // can load specific based on the parameter or default will be the member variable name
	public void setCenter(Point center) {
		this.center = center;
	}

	public void draw() {
		System.out.println("Circle drawn with center at :"+center.getX()+","+center.getY());
	}
	
	@PostConstruct
	public void initializeCircle() {
		System.out.println("init of Circle");
	}
	
	@PreDestroy
	public void destroyCircle() {
		System.out.println("destroy of Circle");
	}
}
