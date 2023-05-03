package com.spring.jdbc;

import java.util.List;
import java.util.Objects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringJdbcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-jdbc.xml");
		PersonService service=(PersonService) context.getBean("personService");
//		Person person=new Person(16,"sachin","tendulkar");
//		service.savePerson(person);
//		List<Person> allPerson=service.getAllPerson();
//		if(!allPerson.isEmpty()) {
//			allPerson.forEach(person->System.out.println(person));
//		}
//		Person personById = service.getPersonById(13);
//		if(Objects.nonNull(personById))
//		System.out.println(personById);
//		Person person=new Person(15,"virat-Named-updates","kohli-parameter");
//		service.updatePerson(15, person);
		service.deletePerson(12);
		
	}

}
