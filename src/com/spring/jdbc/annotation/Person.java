package com.spring.jdbc.annotation;

public class Person {
	private int id;
	private String FirstName;
	private String lastName;
	
	
	
	
	public Person(int id, String firstName, String lastName) {
		super();
		this.id = id;
		FirstName = firstName;
		this.lastName = lastName;
	}
	
	
	public Person() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", FirstName=" + FirstName + ", lastName=" + lastName + "]";
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

}
