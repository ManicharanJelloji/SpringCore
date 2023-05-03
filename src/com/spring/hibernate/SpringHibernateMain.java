package com.spring.hibernate;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.PersonService;

public class SpringHibernateMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-hibernate.xml");
		com.spring.hibernate.PersonService service=(com.spring.hibernate.PersonService) context.getBean("personService");
//		Person person=new Person((long) 14,"@Transactional","Annotations");
//		service.savePerson(person);
//		List<Person> allPerson=service.getAllPerson();
//		if(!allPerson.isEmpty()) {
//			allPerson.forEach(person->System.out.println(person));
//		}
		Person personById = service.getPersonById((long) 14);
//		if(Objects.nonNull(personById))
		System.out.println(personById);
//		Person person=new Person((long) 17,"Sachin Ramesh","Tendulkar");
//		service.updatePerson(person);
//		service.deletePerson(person);

	}

}
