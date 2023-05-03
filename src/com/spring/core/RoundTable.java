package com.spring.core;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
//import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class RoundTable implements BeanNameAware,BeanFactoryAware,BeanFactoryPostProcessor,DisposableBean{
	private String name;
	private Guest guest;//null
	private Instrument gue;
	private Instrument instrument;
	
	
	public RoundTable(String name,Guest guest, Instrument gue,Instrument instrument) {
		this.name=name;
		this.guest=guest;
		this.gue=gue;
		this.instrument=instrument;
//		guest=new Guest();//this is called tight coupling but there is no concept of 
		//object creation in Spring and also Spring follow loose Coupling concept not the tight Coupling
	}
	
	public Person meeting() throws personException {
		Person person=null;
		try {
			System.out.println(gue);
			System.out.println(instrument);
			gue.play();
			person= guest.loadPerson();//this is called loose coupling
			//Loose coupling - When an object gets the object to be used from the outside, 
			//then it is a loose coupling situation. As the main object is merely using the object, this object can be changed from the outside world easily marked it as loosely coupled objects.Jun
		} catch (personException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return person;
	}

//	public void setGuest(Guest guest) {
//		this.guest=guest;
//	}

	@Override
	public void setBeanName(String name) {
		System.out.println("setBeanName: "+ name);		
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("setBeanFactory: "+ beanFactory);
		
	}
	/*
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("postProcessBeforeInitialization: "+beanName);
		return null;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("postProcessAfterInitialization: "+ beanName);
		return null;
	}
	*/
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy(): ");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("postProcessBeanFactory: "+ beanFactory);
	}

}
