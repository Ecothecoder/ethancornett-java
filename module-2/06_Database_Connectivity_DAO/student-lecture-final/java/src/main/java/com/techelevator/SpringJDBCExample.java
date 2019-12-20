package com.techelevator;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

/* Working with JDBC entails a lot of boilerplate code which can become 
 * tedious and error prone. The Spring JBDC framework can help eliminate 
 * much of the boilerplate code, and limit the tedium and mistakes. */
public class SpringJDBCExample {

	public static void main(String[] args) {
		
		/* This datasource will be used for creating connections to the database.
		 * Below, we provide the information required to make database connections */
		BasicDataSource dvdstoreDataSource = new BasicDataSource();
		dvdstoreDataSource.setUrl("jdbc:postgresql://localhost:5432/dvdstore");
		dvdstoreDataSource.setUsername("postgres");
		dvdstoreDataSource.setPassword("password");
		
		
		/* The JdbcTemplate is the main interface we use to interact with databases using
		 * Spring JDBC. */
		JdbcTemplate dvdstoreJdbcTemplate = new JdbcTemplate(dvdstoreDataSource);
		
		String filmsUnder90Minu = "SELECT title, length "
				+ "FROM film WHERE length < 90 "
				+ "order by length desc;"; 
		
		SqlRowSet results = dvdstoreJdbcTemplate.queryForRowSet(filmsUnder90Minu); 
		
		while (results.next()) {
			String title = results.getString("title");
			int length = results.getInt("length"); 

			System.out.println(title + " "+length);
		}
		
		System.out.println();
		System.out.println("Titles");
		//i want all the films starring zero cage
		String firstName = "Zero";
		String lastName = "Cage";
		
		String filmsStarringActor = "Select title "
				+ "from film "
				+ "join film_actor on film_actor.film_id = film.film_id "
				+ "join actor on actor.actor_id = film_actor.actor_id "
			//DONT DO THIS	+ "where actor.firstname = '"+firstName+"' and actor.last_name = '"+lastName+"'"; 
				+ "where actor.first_name = ? and actor.last_name = ?;";
		
		results = dvdstoreJdbcTemplate.queryForRowSet(filmsStarringActor,firstName.toUpperCase(),lastName.toUpperCase());
		while(results.next()) {
			System.out.println(results.getString("title"));
		}
		
		//insert an actor
		String sqlCreateActor  = "INSERT INTO actor (first_name,last_name) "
								+ "VALUES (?,?)";
		firstName = "Bucky";
		lastName = "Flinstone";
		int rowCount = dvdstoreJdbcTemplate.update(sqlCreateActor,firstName.toUpperCase(), lastName.toUpperCase()); 
		System.out.println("Inserted " + rowCount+" rows.");
		
		//delete an actor
		String sqlDeleteActor = "DELETE from actor where first_name = ? and last_name = ?";
		rowCount = dvdstoreJdbcTemplate.update(sqlDeleteActor,firstName, lastName);
		System.out.println("Rows deleted: "+rowCount); 
		
		//practice with an aggregate
		String sqlAverageTimeForCategory = "Select category.name as catName, AVG(film.length) as AvgLen \r\n" + 
				"FROM film\r\n" + 
				"JOIN film_category on film.film_id = film_category.film_id\r\n" + 
				"JOIN category on category.category_id = film_category.category_id\r\n" + 
				"GROUP BY category.name " ;
		
		results = dvdstoreJdbcTemplate.queryForRowSet(sqlAverageTimeForCategory); 
		while(results.next()) {
			System.out.println(results.getString("catName") + " "+results.getString("AvgLen"));
		}
	}
}
