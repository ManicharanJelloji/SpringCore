package com.spring.hibernate;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Course implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private Set<Student> students=new HashSet<>();
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
	
}
