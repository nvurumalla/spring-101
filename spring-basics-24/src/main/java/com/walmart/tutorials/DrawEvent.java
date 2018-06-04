package com.walmart.tutorials;

import org.springframework.context.ApplicationEvent;

public class DrawEvent extends ApplicationEvent{

	public DrawEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
		//logic
	}

	
	public String toString() {
		return "Draw Event occured";
	}
	
	

}
