package com.walmart.tutorials;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
		Shape shape = (Shape) context.getBean("triangle");
		shape.draw();
		
		// normal way ?
//		Point pointA = new Point();
//		pointA.setX(0);
//		pointA.setX(0);
//		
//		Point pointB = new Point();
//		pointB.setX(0);
//		pointB.setX(0);
//		
//		Point pointC = new Point();
//		pointC.setX(0);
//		pointC.setX(0);
		
//		Triangle triangle = new Triangle();
//      tirangle.setPointA(..)
//      tirangle.setPointB(..)
//      tirangle.setPointC(..)
//		...
		
		
	}

}
