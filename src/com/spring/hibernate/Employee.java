package com.spring.hibernate;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private Set<Department> department=new HashSet<>();
//	private Address address;
//	private Address homeAddress;
//	private Address billingAddress;
	
	
	public Employee() {
		
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	public Address getAddress() {
//		return address;
//	}
//	public void setAddress(Address address) {
//		this.address = address;
//	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public Set<Department> getDepartment() {
		return department;
	}


	public void setDepartment(Set<Department> department) {
		this.department = department;
	}
	

//	public Department getDepartment() {
//		return department;
//	}
//
//
//	public void setDepartment(Department department) {
//		this.department = department;
//	}
	

	/*public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}*/

	/*public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}*/
	
	
	
}
