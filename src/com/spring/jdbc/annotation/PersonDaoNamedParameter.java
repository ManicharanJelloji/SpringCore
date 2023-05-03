package com.spring.jdbc.annotation;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
//@Component
@Repository
public class PersonDaoNamedParameter implements PersonDao{
	@Autowired
	private NamedParameterJdbcTemplate template;

	public void setTemplate(NamedParameterJdbcTemplate template) {
		this.template = template;
	}

	@Override
	public void savePerson(Person person) {
		Map<String, Object> paramMap=new HashMap<>();
		paramMap.put("id",person.getId());
		paramMap.put("firstname",person.getFirstName());
		paramMap.put("lastname",person.getLastName());
		int update=template.update(SpringJdbcUtility.NAMED_INSERT_SQL,paramMap);
		if(update>0)System.out.println("inserted one record successfully");
		else System.out.println("exception occured");
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Person> getAllPersons() {
		List<Person> personList=template.query(SpringJdbcUtility.NAMED_GET_ALL,Collections.EMPTY_MAP,(rs,row)->{
			Person person=new Person();
			person.setId(rs.getInt("id"));
			person.setFirstName(rs.getString("firstname"));
			person.setLastName(rs.getString("lastname"));
//			System.out.println(row);
			return person;
		});
		return personList.size()>0?personList:Collections.emptyList();
		
		
	}

	@Override
	public Person getPersonById(int id) {
		Map<String, Object> paramMap=new HashMap<>();
		paramMap.put("id",id);
		try {
			Person rsPerson=template.queryForObject(SpringJdbcUtility.NAMED_LOAD_PERSON_WITH_ID,paramMap , (rs,rowNum)->{
				Person person=new Person();
				person.setId(rs.getInt("id"));
				person.setFirstName(rs.getString("firstname"));
				person.setLastName(rs.getString("lastname"));
				return person;
			});
			return Objects.nonNull(rsPerson)?rsPerson:null;
		}catch(EmptyResultDataAccessException ex) {
			System.out.println("with given id: "+ id +" no record is found in database");
		}
		return null;
	}

	@Override
	public void updatePerson(int id, Person person) {
		Map<String, Object> paramMap=new HashMap<>();
		paramMap.put("id",person.getId());
		paramMap.put("firstname", person.getFirstName());
		paramMap.put("lastname", person.getLastName());
		int update=template.update(SpringJdbcUtility.NAMED_UPDATE_SQL, paramMap);
		if(update>0)System.out.println("updated "+id+" record successfully");
		else System.out.println("exception occured");
		
	}

	@Override
	public void deletePerson(int id) {
		Map<String, Object> paramMap=new HashMap<>();
		paramMap.put("id",id);
		int update=template.update(SpringJdbcUtility.NAMED_DELETE_SQL, paramMap);
		if(update>0)System.out.println("deleted id: "+id+" record successfully");
		else System.out.println("exception occured");
		
	}
	

}
