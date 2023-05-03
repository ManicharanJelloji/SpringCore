package com.spring.core;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.HierarchicalBeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.ResourcePatternResolver;

public class SpringCoreMain {

	public static void main(String[] args) throws PerformanceException, personException {
//		BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("spring-core.xml"));
//		GreetingService service=(GreetingService)beanFactory.getBean("greetingService");
//		service.sayGreeting();
//		BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("spring-core.xml"));
//		BeanFactory beanFactory=new XmlBeanFactory(new FileSystemResource("/Users/prasannajelloji/eclipse-workspace/SpringCore/src/spring-core.xml"));
		//Basically Resources is a interface and all the methods in resources interface are implemented in FileSystemresource and ClasspathResource, urlResource,ByteArrayResource, InputStreamResource
		//ClassPathResource basically accept the class path whereas FileSystemResources expect the fully qualified path
		//In place of ClassPathresource and FileSystemresources we can use urlResources if we are trying give some url related information
		//or if info is not available in the current directory and is available in the different directory then we will use urlResources
//		BeanFactory beanFactory1=new XmlBeanFactory(new InputStreamResource(System.in));
		
		
		//XmlBeansFactory one of the implementations of BeanFactory. and internally its expecting Resource class
//		RoundTable table=(RoundTable) beanFactory.getBean("roundTable");
//		System.out.println(table.meeting());
		
		
		//Application context
		
//		ApplicationContext context=new ClassPathXmlApplicationContext("spring-core.xml");
//		RoundTable table=(RoundTable) context.getBean("roundTable");
//		System.out.println(table.meeting());
		
		
		//public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory,MessageSource, ApplicationEventPublisher, ResourcePatternResolver {
		//if you observe carefully ApplicationContext extends ListableBeanFactory and HierarachicalBeanFactory
		//internally both ListableBeanFactory and HierarchicalBeanFactory extends BeanFactory interface i.e, in ApplicationContext can use all the methods which 
		//are available in BeanFactory that is the reason it haven't throw any error when we called context.getBeans() method
		//The main advantage of using ApplicationContect is I18N it's called Internalization(it's trying to convert one language into another language)
		
		//Here the ClassPathApplicationContext is a implementation class of ApplicationContext
		//the second advantage of ApplicationContext is it's generic way of loading Resource files. Here we have different way of loading Files
		//the third advantage of ApplicationContext is event section. here we can publish different types of events i.e, if we try to perform something or if we try to delete something or if we try to update somethings this events are going to trigger.
		//all the advantages which we seen above are not available in BeanFactory
		
//		ApplicationContext context=new FileSystemXmlApplicationContext("file:/Users/prasannajelloji/eclipse-workspace/SpringCore/src/spring-core.xml");
//		performer table=(performer) context.getBean("kenny");
//		table.perform();
		
		//this is another implementation class of ApplicationContext the main difference between the ClassPath and FileSystem is we need to give full file name for FileSystem.
		
		
//		ApplicationContext context=new FileSystemXmlApplicationContext("file:/Users/prasannajelloji/eclipse-workspace/SpringCore/src/spring-core.xml");
//		performer table=(performer)context.getBean("performer");
//		table.perform();
		//the above is the example for how we can change a value which is already set by using constructor-arg tag
		
//		ApplicationContext context=new FileSystemXmlApplicationContext("file:/Users/prasannajelloji/eclipse-workspace/SpringCore/src/spring-core.xml");
//		performer table=(performer)context.getBean("performer");
//		table.perform();
		
		
	}

}
