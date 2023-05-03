package com.spring.jdbc.annotation;

import java.util.List;

public interface PersonDao {
	public void savePerson(Person person);
	public List<Person> getAllPersons();
	public Person getPersonById(int id);
	public void updatePerson(int id,Person person);
	public void deletePerson(int id);
	
}
