package com.walmart.tutorials;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware,Shape {

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
		System.out.println("setApplicationContext:: Bean Definition Names="
				+ Arrays.toString(context.getBeanDefinitionNames()));
	}
	
	// ApplicationEventPublisherAware
	// ApplicationBeanClassLoaderAware
}
