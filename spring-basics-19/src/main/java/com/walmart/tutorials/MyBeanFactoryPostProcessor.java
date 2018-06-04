package com.walmart.tutorials;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor{

	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("My Bean Factory post processor is called..");
		System.out.println("Total number of singleton beans registered : "+beanFactory.getSingletonCount());
		
	}

}
