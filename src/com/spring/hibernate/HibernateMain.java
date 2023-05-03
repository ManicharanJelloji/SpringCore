package com.spring.hibernate;


import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class HibernateMain {
	public static void main(String[] args) {
		Configuration configuration=new Configuration()
				//.addClass(Message.class);
		//configuration.configure("hibernate.cfg.xml").addResource("message.hbm.xml");
				//.addClass(Message.class)
				.addClass(Employee.class)
				.addClass(Department.class);
				//.addClass(CreditCard.class)
				//.addClass(BillingDetails.class);
				//.addClass(BankAccount.class);
			
				//.addClass(Address.class);
				//.setNamingStrategy(new ECNamingStrategy());//configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		/*Address user=(Address)session.get(Address.class, Long.valueOf(80));
		session.delete(user);
		transaction.commit();
		session.close();*/
		
		/*BillingDetails billing=new BillingDetails();
		billing.setNumber("12345");
		billing.setCreatedDate(new Date());
		billing.setOwner("mani charan");
		
		session.save(billing);
		transaction.commit();
		session.close();*/
		
		/*Employee employee=new Employee();
		Address address=new Address();
		address.setCity("Hyderabad");
		address.setStreet("uppal");
		address.setZipcode("505025");
		address.setEmployee(employee);
		employee.setName("one-to-one");
		employee.setAddress(address);
		
		session.save(employee);
		transaction.commit();
		session.close();*/
		
		
//		Department cse=new Department();
		/*Employee employee1=new Employee();
		employee1.setName("mani charan_1");
		employee1.setName("sai charan_1");
		employee1.setName("ravi kiran_1");
		
		
		Employee employee2=new Employee();
		employee2.setName("mani charan_2");
		employee2.setName("sai charan_2");
		employee2.setName("ravi kiran_2");
		
		Employee employee3=new Employee();
		employee3.setName("mani charan_3");
		employee3.setName("sai charan_3");
		employee3.setName("ravi kiran_3");
		
		Employee employee4=new Employee();
		employee4.setName("mani charan_4");
		employee4.setName("sai charan_4");
		employee4.setName("ravi kiran_4");
		
		Set<Employee> set1=new HashSet<>();
		set1.add(employee1);
		set1.add(employee2);
		
		Set<Employee> set2=new HashSet<>();
		set2.add(employee3);
		set2.add(employee4);
		
		
		Department eceDepartment=new Department();
		eceDepartment.setEmployee(set1);*/
		
//		Department cseDepartment=new Department();
//		cseDepartment.setEmployee(set2);
		
//		employee1.setDepartment(eceDepartment);
//		employee2.setDepartment(eceDepartment);
		
//		employee3.setDepartment(cseDepartment);
//		employee4.setDepartment(cseDepartment);
		
//		employee1.setDepartment(ece);
//		employee2.setDepartment(ece);
//		employee3.setDepartment(ece);
//		
		
		//many-to-many
		Department cseDepartment=new Department();
		Department eceDepartment=new Department();
		
		Employee employee1=new Employee();
		Employee employee2=new Employee();
		Employee employee3=new Employee();
		
		cseDepartment.setName("cseDepartment");
		cseDepartment.getEmployee().add(employee1);
		cseDepartment.getEmployee().add(employee2);
		cseDepartment.getEmployee().add(employee3);
		
		eceDepartment.setName("eceDepartment");
		eceDepartment.getEmployee().add(employee1);
		eceDepartment.getEmployee().add(employee2);
		eceDepartment.getEmployee().add(employee3);
		
		employee1.setName("First employee");
		employee2.setName("second employee");
		employee3.setName("Third employee");
		employee1.getDepartment().add(eceDepartment);
		employee1.getDepartment().add(cseDepartment);
		employee2.getDepartment().add(eceDepartment);
		employee2.getDepartment().add(cseDepartment);
		employee3.getDepartment().add(eceDepartment);
		employee3.getDepartment().add(cseDepartment);
		
		
		session.save(employee1);
		session.save(employee2);
		session.save(employee3);
		session.save(cseDepartment);
		session.save(eceDepartment);
		transaction.commit();
		session.close();
		
		
		//########bidirectional
		/*Department cseDepartment=new Department();
		cseDepartment.setName("cseDepartment");
		
		Employee employee1=new Employee();
		employee1.setDepartment(cseDepartment);
		employee1.setName("mani charan");
		
		Employee employee2=new Employee();
		employee2.setDepartment(cseDepartment);
		employee2.setName("sai kiran");
		
		Set<Employee> employeeSet=new HashSet<>();
		employeeSet.add(employee1);
		employeeSet.add(employee2);
		
		cseDepartment.setEmployee(employeeSet);
		
		
		session.save(employee1);
		session.save(employee2);
		session.save(cseDepartment);
		transaction.commit();
		session.close();*/
		
		//unidirectional one to many
		/*Department eceDepartment=new Department();
		eceDepartment.setName("eceDepartment");
		
		Employee employee1=new Employee();
		employee1.setName("sachin");
		
		Employee employee2=new Employee();
		employee2.setName("virat");
	
		
		eceDepartment.getEmployee().add(employee1);//add employee to the set of employee
		eceDepartment.getEmployee().add(employee2);
		
//		session.save(employee1);
//		session.save(employee2);
		session.save(eceDepartment);
		transaction.commit();
		session.close();*/
		
		//unidirectional many-to-one
		/*Department eeeDepartment=new Department();
		eeeDepartment.setName("eeeDepartment");
		
		Employee employee1=new Employee();
		employee1.setName("kobe");
		employee1.setDepartment(eeeDepartment);
		
		Employee employee2=new Employee();
		employee2.setName("jordan");
		employee2.setDepartment(eeeDepartment);
	
		
		session.save(employee1);
		session.save(employee2);
		session.save(eeeDepartment);
		transaction.commit();
		session.close();*/
		
		/*BankAccount account=new BankAccount();
		account.setBankLocation("Hyderabad");
		account.setBankName("HDFC");
		account.setCreatedDate(new Date());
		account.setNumber("662408");
		account.setOwner("BANK ACCOUNT");
		
		session.save(account);
		transaction.commit();
		session.close();*/
		
		/*CreditCard card=new CreditCard();
		card.setCreatedDate(new Date());
		card.setExpMonth("11");
		card.setExpYear("2028");
		card.setNumber("987612345");
		card.setOwner("Credit-card");
		card.setType(CardType.VISA.name());
		
		session.save(card);
		transaction.commit();
		session.close();*/
		
		/*Address homeAddress=new Address();
		Address billingAddress=new Address();
		User user=new User();
		user.setUsername("Mani Charan");
		homeAddress.setStreet("Alwal");
		homeAddress.setCity("Hyderabad");
		homeAddress.setZipcode("505015");
		
		billingAddress.setStreet("Ashoknagar");
		billingAddress.setCity("Karimnagar");
		billingAddress.setZipcode("505001");
		user.setHomeAddress(homeAddress);
		user.setBillingAddress(billingAddress);
		
		session.save(user);
		transaction.commit();
		session.close();*/
		
		
//		@SuppressWarnings("unchecked")
//		List<Message> messageList = session.find("FROM Message AS m ORDER BY m.text ASC");
//		Message oldMessage = (Message)session.load(Message.class, Long.valueOf(2));
//		oldMessage.setText("new Message");
//		Message newMessage=new Message("Next Message");
//		oldMessage.setNextMessage(newMessage);
//		if(!messageList.isEmpty())
//			messageList.forEach(message->System.out.println(message));
//		 Message message=new Message("Welcome to hibernate 1");
//		session.save(message);
//		transaction.commit();
//		session.close();
	}

}
