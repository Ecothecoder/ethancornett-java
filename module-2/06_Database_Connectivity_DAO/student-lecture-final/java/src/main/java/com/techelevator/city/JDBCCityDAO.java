package com.techelevator.city;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JDBCCityDAO implements CityDAO{
	
	private JdbcTemplate jdbcTemplate; 
	
	public JDBCCityDAO(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource); 
	}

	@Override
	public void create(City newCity) {
		String sql = "INSERT INTO city(name,countrycode,district,population) "
				+ "values(?,?,?,?) RETURNING id";
		
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql,newCity.getName(),newCity.getCountryCode(),newCity.getDistrict(), newCity.getPopulation());
		if (results.next()) {
			newCity.setId(results.getLong("id"));
		}
	}

	@Override
	public City findCityById(long id) {
	
		City foundCity = null;
		
		String findCityById = "Select id,name, countrycode, district, population "
				+ "from city "
				+ "where id = ?";
		
		SqlRowSet results = jdbcTemplate.queryForRowSet(findCityById,id); 
		
		if (results.next()) {
			foundCity = mapRowToCity(results);
		}
		
		return foundCity; 
	}

	private City mapRowToCity(SqlRowSet results) {
		City c = new City();
		c.setId(results.getLong("id"));
		c.setName(results.getString("name"));
		c.setCountryCode(results.getString("countrycode"));
		c.setDistrict(results.getString("district"));
		c.setPopulation(results.getInt("population"));
		return c;
	}

	@Override
	public List<City> findCityByCountryCode(String countryCode) {
		List<City> foundCities = new ArrayList<City>();
		
		String findCityByCC = "Select id,name, countrycode, district, population "
				+ "from city "
				+ "where countrycode = ?";
		
		SqlRowSet results = jdbcTemplate.queryForRowSet(findCityByCC,countryCode); 
		
		while (results.next()) {
			City foundCity = mapRowToCity(results);
			foundCities.add(foundCity);
		}
		return foundCities; 
		
	}

	@Override
	public List<City> findCityByDistrict(String district) {
		List<City> foundCities = new ArrayList<City>();
		
		String sql = "Select id,name, countrycode, district, population "
				+ "from city "
				+ "where district = ?";
		
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql,district); 
		
		while (results.next()) {
			City foundCity = mapRowToCity(results);
			foundCities.add(foundCity);
		}
		return foundCities; 
	}

	@Override
	public void update(City city) {
		String sql = "UPDATE city "
				+ "SET name = ?, "
				+ "countrycode = ?, "
				+ "district = ?, "
				+ "population = ? "
				+ "where id = ?";
		
		jdbcTemplate.update(sql,city.getName(),city.getCountryCode(),city.getDistrict(), city.getPopulation(),city.getId()); 
	}

	@Override
	public void delete(long id) {
		String sql = "delete from city where id =?";
		jdbcTemplate.update(sql,id); 
		
	}

}
