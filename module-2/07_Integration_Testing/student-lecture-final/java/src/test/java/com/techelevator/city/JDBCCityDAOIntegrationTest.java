package com.techelevator.city;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

public class JDBCCityDAOIntegrationTest {

	private static final String TEST_COUNTRY = "XYZ";
	private static final String TEST_DISTRICT = "Oz";
	
	/* Using this particular implementation of DataSource so that
	 * every database interaction is part of the same database
	 * session and hence the same database transaction */
	private static SingleConnectionDataSource dataSource;
	private JDBCCityDAO dao;
	
	/* Before any tests are run, this method initializes the datasource for testing. */
	@BeforeClass
	public static void setupDataSource() {
		dataSource = new SingleConnectionDataSource();
		dataSource.setUrl("jdbc:postgresql://localhost:5432/world");
		dataSource.setUsername("postgres");
		dataSource.setPassword(System.getenv("DBPass")); 
		/* The following line disables autocommit for connections 
		 * returned by this DataSource. This allows us to rollback
		 * any changes after each test */
		dataSource.setAutoCommit(false);
	}
	
	/* After all tests have finished running, this method will close the DataSource */
	@AfterClass
	public static void closeDataSource() throws SQLException {
		dataSource.destroy();
	}
	
	@Before
	public void setup() {
		String sqlInsertCountry = "INSERT INTO country (code, name, continent, region, surfacearea, indepyear, population, lifeexpectancy, gnp, gnpold, localname, governmentform, headofstate, capital, code2) "
				+ "VALUES (?, 'Afghanistan', 'Asia', 'Southern and Central Asia', 652090, 1919, 22720000, 45.9000015, 5976.00, NULL, 'Afganistan/Afqanestan', 'Islamic Emirate', 'Mohammad Omar', 1, 'AF')";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sqlInsertCountry, TEST_COUNTRY);
		
		dao = new JDBCCityDAO(dataSource);
	}

	/* After each test, we rollback any changes that were made to the database so that
	 * everything is clean for the next test */
	@After
	public void rollback() throws SQLException {
		dataSource.getConnection().rollback();
	}
	
	@Test
	public void create_new_city_and_read_it_back() {
		//arrange
		City c = createTestCity();
		
		//act
		dao.create(c);
		City testIfCreatedCorrectly = dao.findCityById(c.getId());
		
		compareCities(c, testIfCreatedCorrectly);
	}

	private City createTestCity() {
		City c = new City();
		c.setCountryCode(TEST_COUNTRY);
		c.setDistrict(TEST_DISTRICT);
		c.setName("Metropolis");
		c.setPopulation(1);
		return c;
	}
	
	@Test
	public void test_update_city()
	{
		//create a test city
		City newCity = createTestCity(); 
		
		//add it to db
		dao.create(newCity);
		
		//update it
		newCity.setPopulation(2);
		dao.update(newCity);
		
		//make sure that the updates are there
		City test = dao.findCityById(newCity.getId());
		Assert.assertEquals(newCity.getPopulation(), test.getPopulation());
	}
	
	@Test
	public void test_get_city_by_countrycode()
	{
		//create a test city
		City newCity = createTestCity(); 
		dao.create(newCity);
		
		List<City> results = dao.findCityByCountryCode(TEST_COUNTRY);
		Assert.assertNotNull(results);
		Assert.assertEquals(1, results.size());
		
		City testCity = results.get(0);
		compareCities(newCity, testCity);
	}
	
	@Test
	public void test_get_city_by_district()
	{
		//create a test city
		City newCity = createTestCity(); 
		dao.create(newCity);
		
		List<City> results = dao.findCityByDistrict(TEST_DISTRICT);
		Assert.assertNotNull(results);
		Assert.assertEquals(1, results.size());
		
		City testCity = results.get(0);
		compareCities(newCity, testCity);
	}
	
	@Test
	public void not_found_city_is_null()
	{
		City test = dao.findCityById(-1);
		Assert.assertNull(test);
	}
	
	@Test
	public void not_found_cc_returns_empty_list_of_cities() {
		List<City> ccResults = dao.findCityByCountryCode(TEST_COUNTRY);
		Assert.assertEquals(0,ccResults.size());
	}
	
	
	@Test
	public void test_delete_city() {
		//create a test city
		City newCity = createTestCity(); 
		dao.create(newCity);
		
		dao.delete(newCity.getId());
		
		//we expect lists to not be null, but have a size of zero
		List<City> districtResults = dao.findCityByDistrict(TEST_DISTRICT);
		List<City> ccResults = dao.findCityByCountryCode(TEST_COUNTRY);
		
		//we expect the city to be null if not found
		City test = dao.findCityById(newCity.getId());
		
		Assert.assertNull(test);
		Assert.assertEquals(0, districtResults.size());
		Assert.assertEquals(0,ccResults.size());
		
	}

	private void compareCities(City newCity, City testCity) {
		Assert.assertEquals("Wrong id",newCity.getId(), testCity.getId());
		Assert.assertEquals("Wrong name",newCity.getName(), testCity.getName());
		Assert.assertEquals("Wrong country code",TEST_COUNTRY, testCity.getCountryCode());
		Assert.assertEquals("Wrong district", TEST_DISTRICT, testCity.getDistrict());
		Assert.assertEquals("Wrong population",1,testCity.getPopulation());
	}
	
}
