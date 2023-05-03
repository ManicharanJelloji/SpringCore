package com.spring.core;

public class Guest2 implements Guest{

	@Override
	public Person loadPerson() throws personException{
		// TODO Auto-generated method stub
		return new Person(36,"Mani", "Charan");
	}

}
