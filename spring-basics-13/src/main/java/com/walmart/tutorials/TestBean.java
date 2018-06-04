package com.walmart.tutorials;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class TestBean implements ApplicationContextAware, BeanNameAware, BeanFactoryAware {
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("setBeanFactory method of test bean is called");
		System.out.println("setBeanFactory:: test bean singleton=" + beanFactory.isSingleton("testBean"));
	}

	public void setBeanName(String beanName) {
		System.out.println("setBeanName method of test bean is called");
		System.out.println("setBeanName:: Bean Name defined in context=" + beanName);
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("setApplicationContext method of test bean is called");
		System.out.println("setApplicationContext:: Bean Definition Names="
				+ Arrays.toString(applicationContext.getBeanDefinitionNames()));
	}
}