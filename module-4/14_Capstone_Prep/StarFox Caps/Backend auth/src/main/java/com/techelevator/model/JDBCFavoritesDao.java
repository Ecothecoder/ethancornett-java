package com.techelevator.model;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class JDBCFavoritesDao implements FavoritesDao {
	
	private JdbcTemplate jdbcTemplate;
    public JDBCFavoritesDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

	@Override
	public List<FavoritePokemon> getFavoritesForUser(User u) {
		List<FavoritePokemon> resultList = new ArrayList<>();
		String sql = "Select id, pokeName, apiUrl From userPokemon WHERE userId = ?";
		SqlRowSet result = jdbcTemplate.queryForRowSet(sql, u.getId());
		while (result.next()) {
			FavoritePokemon fP = new FavoritePokemon();
			fP.setId(result.getInt("id"));
			fP.setPokeName(result.getString("pokeName"));
			fP.setApiUrl(result.getString("apiUrl"));
			resultList.add(fP);
		}
		return resultList;
	}

	@Override
	public FavoritePokemon addFavoritePokemon(User u, FavoritePokemon fp) {
		String sql = "insert INTO userPokemon(userId,pokeName,apiUrl) VALUES (?, ?, ?) RETURNING id";
		SqlRowSet resultSet = jdbcTemplate.queryForRowSet(sql, u.getId(), fp.getPokeName(), fp.getApiUrl());
		if(resultSet.next()) {
			fp.setId(resultSet.getInt("id"));
		}
		return fp;
		
	}
	
	@Override
	public FavoritePokemon updateTeam(User u, FavoritePokemon f) {
		String sql="UPDATE userPokemon SET pokeName = ? WHERE id = ?";
		jdbcTemplate.update(sql,f.getPokeName(), f.getId());
		
		
		return null;
		
	}
	
	//update delete

}
