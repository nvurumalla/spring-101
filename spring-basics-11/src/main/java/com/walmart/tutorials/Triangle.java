package com.walmart.tutorials;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;

public class Triangle implements BeanNameAware,Shape {

	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		System.out.println("Point A = ("+getPointA().getX()+", " +getPointA().getY()+")" );
		System.out.println("Point B = ("+getPointB().getX()+", " +getPointB().getY()+")" );
		System.out.println("Point C = ("+getPointC().getX()+", " +getPointC().getY()+")" );
	}

	public void setApplicationContext(ApplicationContext context) throws BeansException {
		// add your own logic..
		// like context.getBean("..")
		System.out.println(context.getBean("circle").toString());
	}

	public void setBeanName(String beanName) {
		System.out.println(beanName +" bean has been initialized." );	
		
	}
	
	// ApplicationEventPublisherAware
	// ApplicationBeanClassLoaderAware
}
