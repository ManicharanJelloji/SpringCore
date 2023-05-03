package com.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringCoreAnnotationMain {
	public static void main(String[] args) throws PerformanceException {
		ApplicationContext context=new FileSystemXmlApplicationContext("file:/Users/prasannajelloji/eclipse-workspace/SpringCore/src/spring-core-annotations.xml");
		performer table=(performer) context.getBean("member");
		table.perform();
	}

}
