package com.spring.jdbc;

import java.util.List;

public class PersonService {
	private PersonDao personDao;
	
	
	public void savePerson(Person person) {
		personDao.savePerson(person);
	}


	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}
	
	public List<Person> getAllPerson(){
		return personDao.getAllPersons();
	}
	public Person getPersonById(int id) {
		return personDao.getPersonById(id);
	}
	public void updatePerson(int id, Person person) {
		personDao.updatePerson(id, person);
	}
	public void deletePerson(int id) {
		personDao.deletePerson(id);
	}
	
	
}
