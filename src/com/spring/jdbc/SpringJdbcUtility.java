package com.spring.jdbc;

public class SpringJdbcUtility {
	public static final String INSERT_SQL="INSERT INTO person VALUES(?, ?, ?)";
	public static final String GET_ALL = "SELECT * FROM person";
	public static final String LOAD_PERSON_WITH_ID="SELECT * FROM person WHERE id=?";
	public static final String UPDATE_SQL="UPDATE person SET firstname=?,lastname=? WHERE id=?";

	
	/* Named parameter Jdbc Template Queries*/
	
	public static final String NAMED_INSERT_SQL="INSERT INTO person VALUES(:id, :firstname, :lastname)";
	public static final String NAMED_GET_ALL = "SELECT * FROM person";
	public static final String NAMED_LOAD_PERSON_WITH_ID="SELECT * FROM person WHERE id=:id";
	public static final String NAMED_UPDATE_SQL="UPDATE person SET firstname=:firstname,lastname=:lastname WHERE id=:id";
	public static final String NAMED_DELETE_SQL="DELETE FROM person WHERE id=:id";
	
}
