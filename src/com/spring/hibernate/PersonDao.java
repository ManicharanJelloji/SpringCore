package com.spring.hibernate;

import java.util.List;

public interface PersonDao {
	public void savePerson(Person person);
	public List<Person> getAllPersons();
	public Person getPersonById(Long id);
	public void updatePerson(Person person);
	public void deletePerson(Person person);
	
}
