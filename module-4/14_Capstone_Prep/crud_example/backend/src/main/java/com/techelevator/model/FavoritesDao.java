package com.techelevator.model;

import java.util.List;

public interface FavoritesDao {

	List<FavoriteCombo> getFavoritesForUser(User u);
	
	FavoriteCombo addFavoriteForUser(User u, FavoriteCombo fc);
}
