package com.walmart.tutorials;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
		// Shape shape = (Shape) context.getBean("triangle");
		// shape.draw();
		TestBean bean = (TestBean) context.getBean("testBean");
		((AbstractApplicationContext) context).registerShutdownHook();

	}

}
