package com.spring.jdbc.annotation;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages="com.spring.jdbc.annotation")
@PropertySource("classpath:Spring-jdbc.properties")
public class SpringJdbcConfig {
	private final String DRIVER_CLASS_NAME="database.driver";
	private final String DRIVER_URL="database.url";
	private final String DRIVER_USERNAME="database.username";
	private final String DRIVER_PASSWORD="database.password";
	@Autowired
	private Environment environment;
	
	@Bean
//	@Autowired
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName(environment.getProperty(DRIVER_CLASS_NAME));
		dataSource.setUrl(environment.getProperty(DRIVER_URL));
		dataSource.setUsername(environment.getProperty(DRIVER_USERNAME));
		dataSource.setPassword(environment.getProperty(DRIVER_PASSWORD));
		return dataSource;
	}
	
	@Bean
//	@Autowired
	public NamedParameterJdbcTemplate getTemplate() {
		NamedParameterJdbcTemplate template=new NamedParameterJdbcTemplate(getDataSource());
		return template;
	}
}
