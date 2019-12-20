package com.techelevator.model;

import java.util.List;

public interface FavoritesDao {
	
	List<FavoritePokemon> getFavoritesForUser(User u);
	
	FavoritePokemon addFavoritePokemon(User u, FavoritePokemon fp);
	
	FavoritePokemon updateTeam(User u, FavoritePokemon f);

}
