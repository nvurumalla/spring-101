package com.walmart.tutorials;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
		
		// usual approach
		//Shape shape = new Triangle();
		//shape.draw();
		
		// using spring framework
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring-context.xml"));
		Shape shape = (Shape) factory.getBean("triangle");
		shape.draw();
	}

}
