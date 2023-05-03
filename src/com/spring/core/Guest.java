package com.spring.core;

public interface Guest {
	//till tight coupling this was a class but inorder to understand loose coupling I'm changing into interface
	public Person loadPerson() throws personException;
 	
//	public Guest() {
//		
//	}
//	
//	public Person loadPerson() throws personException{
//		return new Person(12,"Spring", "Framework");
//	}

}
