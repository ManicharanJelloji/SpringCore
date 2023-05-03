package com.spring.hibernate;

import java.util.List;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

@Transactional(propagation = Propagation.SUPPORTS,
isolation = Isolation.SERIALIZABLE,
readOnly = true,timeout = 3)
public class PersonService {
	private PersonDao personDao;
	
//	private TransactionTemplate transactionTemplate;
//	
//	
//	
//	public TransactionTemplate getTransactionTemplate() {
//		return transactionTemplate;
//	}
//
//
//	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
//		this.transactionTemplate = transactionTemplate;
//	}


	public PersonDao getPersonDao() {
		return personDao;
	}
	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}
	
	@Transactional(propagation = Propagation.REQUIRED,
			isolation = Isolation.SERIALIZABLE,
			readOnly = false,timeout = 3)
	public void savePerson(Person person) {
		personDao.savePerson(person);
	}
//		transactionTemplate.execute(new TransactionCallback<Void>() {
//
//			@Override
//			public Void doInTransaction(TransactionStatus status) {
//				try {
//					personDao.savePerson(person);
//				}catch(Exception ex) {
//					status.setRollbackOnly();
//					throw ex;
//				}
//				return null;
//			}
//		});
		
//	}


	
	@Transactional(propagation = Propagation.REQUIRED,
			isolation = Isolation.SERIALIZABLE,
			readOnly = true,timeout = 3)
	public List<Person> getAllPerson(){
		return personDao.getAllPersons();
//		return transactionTemplate.execute(new TransactionCallback<List<Person>>() {
//
//			@Override
//			public List<Person> doInTransaction(TransactionStatus status) {
//				try {
//					List<Person> allPersons = personDao.getAllPersons();
//					return allPersons;
//				}catch(Exception ex) {
//					status.setRollbackOnly();
//					throw ex;
//				}
//			}
//		});
	}
	@Transactional(propagation = Propagation.REQUIRED,
			isolation = Isolation.SERIALIZABLE,
			readOnly = true,timeout = 3)
	public Person getPersonById(Long id) {
		return personDao.getPersonById(id);
//		return transactionTemplate.execute(new TransactionCallback<Person>() {
//
//			@Override
//			public Person doInTransaction(TransactionStatus status) {
//				try {
//					Person personById = personDao.getPersonById(id);
//					return personById;
//				}catch(Exception ex) {
//					status.setRollbackOnly();
//					throw ex;
//				}
//			}
//		});
	}
	
	@Transactional(propagation = Propagation.REQUIRED,
			isolation = Isolation.SERIALIZABLE,
			readOnly = false,timeout = 3)
	public void updatePerson(Person person) {
		personDao.updatePerson(person);
//		transactionTemplate.execute(new TransactionCallback<Void>() {
//
//			@Override
//			public Void doInTransaction(TransactionStatus status) {
//				try {
//					personDao.updatePerson(person);
//				}catch(Exception ex) {
//					status.setRollbackOnly();
//					throw ex;
//				}
//				return null;
//			}
//		});
	}
	
	@Transactional(propagation = Propagation.REQUIRED,
			isolation = Isolation.SERIALIZABLE,
			readOnly = false,timeout = 3)
	public void deletePerson(Person person) {
		personDao.deletePerson(person);
//		transactionTemplate.execute(new TransactionCallback<Void>() {
//
//			@Override
//			public Void doInTransaction(TransactionStatus status) {
//				try {
//					personDao.deletePerson(person);
//				}catch(Exception ex) {
//					status.setRollbackOnly();
//					throw ex;
//				}
//				return null;
//			}
//		});
	}
	
	
}
