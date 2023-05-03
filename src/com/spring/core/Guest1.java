package com.spring.core;

public class Guest1 implements Guest{

	@Override
	public Person loadPerson() throws personException {
		// TODO Auto-generated method stub
		return new Person(12,"spring","framework");
	}


}
