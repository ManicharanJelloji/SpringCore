package com.spring.core;

public class GreetingServiceImpl implements GreetingService{
	private String greeting;
	
	public GreetingServiceImpl() {
		
	}
	
	public GreetingServiceImpl(String greeting) {
		this.greeting=greeting;//constructor DI
	}
	
	@Override
	public void sayGreeting() {
		// TODO Auto-generated method stub
		System.out.println(greeting);
	}
	
	public void setGreeting(String greeting) {
		this.greeting=greeting;//setter DI
	}

}
