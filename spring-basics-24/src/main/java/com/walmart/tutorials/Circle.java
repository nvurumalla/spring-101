package com.walmart.tutorials;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape, ApplicationEventPublisherAware {

	private Point center;

	@Autowired
	private MessageSource messageSource;
	
	private ApplicationEventPublisher publisher;

	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public Point getCenter() {
		return center;
	}

	@Resource
	// @Resource(name="pointC") // can load specific based on the parameter or
	// default will be the member variable name
	public void setCenter(Point center) {
		this.center = center;
	}

	public void draw() {
		//System.out.println("Drawing circle");
		//System.out.println("Circle drawn with center at :" + center.getX() + "," + center.getY());

		System.out.println(this.messageSource.getMessage("drawing.circle", null, "default drawing message", null));
		System.out.println(this.messageSource.getMessage("greeting", null, "default test message", null));

		System.out.println(this.messageSource.getMessage("drawing.point", new Object[] { center.getX(), center.getY() },
				"default point message", null));
		
		// Publish events
		DrawEvent drawEvent = new DrawEvent(this);
		publisher.publishEvent(drawEvent);
	}

	@PostConstruct
	public void initializeCircle() {
		System.out.println("init of Circle");
	}

	@PreDestroy
	public void destroyCircle() {
		System.out.println("destroy of Circle");
	}

	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.publisher = applicationEventPublisher;
	}
}
