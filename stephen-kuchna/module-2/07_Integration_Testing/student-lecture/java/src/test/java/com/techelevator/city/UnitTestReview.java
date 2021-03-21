package com.techelevator.city;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

public class UnitTestReview
{
	
	@Test
	public void save_should_insert_city_into_database()
	{
		//arrange
		SingleConnectionDataSource dataSource = new SingleConnectionDataSource();
		dataSource.setUrl("jdbc:postgresql://localhost:5432/world");
		dataSource.setUsername("postgres");
		dataSource.setPassword("postgres1");
		
		//act
		
		//assert
	}

}
