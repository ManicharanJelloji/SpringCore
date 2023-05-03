package com.spring.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
@Repository
public class PersonDaoImpl implements PersonDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public void savePerson(Person person) {
		// TODO Auto-generated method stub
		int update=jdbcTemplate.update(SpringJdbcUtility.INSERT_SQL, person.getId(),person.getFirstName(),person.getLastName());
		if(update>0)System.out.println("inserted one record successfully");
		else System.out.println("exception occured");
	
	}
	
	public List<Person> getAllPersons(){
		List<Person> personList=jdbcTemplate.query(SpringJdbcUtility.GET_ALL,new RowMapper<Person>() {

			@Override
			public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
				Person person=new Person();
				person.setId(rs.getInt("id"));
				person.setFirstName(rs.getString("firstname"));
				person.setLastName(rs.getString("lastname"));
				return person;
			}
		});
		return personList.size()>0?personList:Collections.emptyList();
		
	}

	@Override
	public Person getPersonById(int id) {
		// TODO Auto-generated method stub
		try {
			Person rsPerson=jdbcTemplate.queryForObject(SpringJdbcUtility.LOAD_PERSON_WITH_ID, new Object[] {id}, (rs,rowNum)->{
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
		// TODO Auto-generated method stub
		int update=jdbcTemplate.update(SpringJdbcUtility.UPDATE_SQL, person.getFirstName(),person.getLastName(),person.getId());
		if(update>0)System.out.println("updated "+id+" record successfully");
		else System.out.println("exception occured");
	}

	@Override
	public void deletePerson(int id) {
		
	}

}
