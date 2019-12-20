package com.techelevator.model;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class JdbcFavoritesDao implements FavoritesDao {

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
    public JdbcFavoritesDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
	
	@Override
	public List<FavoriteCombo> getFavoritesForUser(User u) {
		List<FavoriteCombo> resultList = new ArrayList<>();
		
		String sql = "SELECT id, fact, picturePath FROM favorites WHERE userId = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, u.getId());
		while (results.next()) {
			FavoriteCombo fc = new FavoriteCombo();
	    	fc.setId(results.getInt("id"));
	    	fc.setText(results.getString("fact"));
	    	fc.setPicturePath(results.getString("picturePath"));
	    	resultList.add(fc);
		}
		
		return resultList;
	}

	@Override
	public FavoriteCombo addFavoriteForUser(User u, FavoriteCombo fc) {
		String sql = "INSERT INTO favorites (userId, fact, picturePath) VALUES (?, ?, ?) RETURNING id";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, u.getId(), fc.getText(), fc.getPicturePath());
		
		if (results.next()) {
			fc.setId(results.getInt("id"));
		}
		
		return fc;
	}

}