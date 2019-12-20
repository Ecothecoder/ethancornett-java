package com.techelevator;
import org.apache.commons.dbcp2.BasicDataSource;

import com.techelevator.city.City;
import com.techelevator.city.CityDAO;
import com.techelevator.city.JDBCCityDAO;


public class DAOExample {
	public static void main(String[]args) {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setUrl("jdbc:postgresql://localhost:5432/world");
		dataSource.setUsername("postgres");
		dataSource.setPassword("password");
		
		CityDAO dao = new JDBCCityDAO(dataSource); 
		
		City myNewCity = new City("Gotham","USA","New York",1000000); 
		dao.create(myNewCity);
		
		City foundCity = dao.findCityById(24);
		System.out.println("Found city 24: " + foundCity.getName()); 
		System.out.println("Done");
	}

}
