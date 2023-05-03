package com.spring.hibernate;


import java.util.List;



import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

public class PersonDaoImpl implements PersonDao{
	
	private HibernateTemplate hibernateTemplate;
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public void savePerson(Person person) {
		//whenever we call the execute method new transaction will start
		hibernateTemplate.save(person);
//		transactionTemplate.execute(new TransactionCallback<Void>() {
//
//			@Override
//			public Void doInTransaction(TransactionStatus status) {
//				try {
//					
//				}catch(Exception ex) {
//					status.setRollbackOnly();
//					throw ex;
//				}
//				return null;
//			}
//		});
//		
	
	}
	
	@SuppressWarnings("unchecked")
	public List<Person> getAllPersons(){
		return (List<Person>) hibernateTemplate.find("from Person");
		
	}

	@Override
	public Person getPersonById(Long id) {
		return hibernateTemplate.get(Person.class, id);
	}

	@Override
	public void updatePerson(Person person) {
		hibernateTemplate.update(person);
	}

	@Override
	public void deletePerson(Person person) {
//		Person p= hibernateTemplate.get(Person.class, id);
		hibernateTemplate.delete(person);
	}

}
