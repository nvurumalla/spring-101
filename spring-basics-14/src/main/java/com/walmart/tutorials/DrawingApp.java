package com.walmart.tutorials;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
		//Shape shape = (Shape) context.getBean("triangle1");
		Shape shape = (Shape) context.getBean("triangle2");
		shape.draw();
	}

}
