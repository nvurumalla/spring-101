package com.walmart.tutorials;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
		context.registerShutdownHook();
		Shape shape = (Shape) context.getBean("circle");
		shape.draw();
		

	}

}
