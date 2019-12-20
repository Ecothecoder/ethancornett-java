package com.techelevator.dao;

import com.techelevator.dao.model.Customer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

/**
 * JDBCCustomerDao
 */
@Component
public class JDBCCustomerDao implements CustomerDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public JDBCCustomerDao(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    
    public List<Customer> searchAndSortCustomers(String search, String sort) {
    	List<Customer> cusList = new LinkedList<Customer>();
    	String sql = "Select first_name, last_name, active, email From customer where last_name ILIKE ? or first_name ILIKE ? ORDER BY "+ sort;
    	SqlRowSet results= jdbcTemplate.queryForRowSet(sql, "%"+search+"%", "%"+search+"%");
    	while(results.next()) {
    		Customer c = new Customer();
    		c.setFirstName(results.getString("first_name"));
    		c.setLastName(results.getString("last_name"));
    		c.setEmail(results.getString("email"));
    		c.setActive(results.getBoolean("active"));
    		cusList.add(c);
    	}
    	return cusList;
    }

    
}