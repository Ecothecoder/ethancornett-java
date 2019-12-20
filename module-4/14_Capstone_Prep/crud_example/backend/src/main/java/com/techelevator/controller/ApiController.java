package com.techelevator.controller;

import com.techelevator.authentication.AuthProvider;
import com.techelevator.authentication.UnauthorizedException;
import com.techelevator.model.CatFact;
import com.techelevator.model.FavoriteCombo;
import com.techelevator.model.FavoritesDao;
import com.techelevator.model.User;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * ApiController
 */
@CrossOrigin
@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private AuthProvider authProvider;
    
    @Autowired
    private FavoritesDao favoritesDao;

    @GetMapping("/fact")
    CatFact getCatFact() {
    	
    	RestTemplate rest = new RestTemplate();
    	CatFact cf = rest.getForObject("https://cat-fact.herokuapp.com/facts/random", CatFact.class);
    	
    	return cf;
    	
    }
    
    
    @GetMapping("/user/favorites")
    List<FavoriteCombo> getFavoriteCombos() {
    	List<FavoriteCombo> result = null;
    	if (authProvider.getCurrentUser() != null) {
    		result = favoritesDao.getFavoritesForUser(authProvider.getCurrentUser());
    	}
    	
    	return result;
    }
    
    @PostMapping("/user/favorites")
    FavoriteCombo addFavoriteCombo(@RequestBody FavoriteCombo newFavorite) {
    	FavoriteCombo result = null;
    	User currentUser = authProvider.getCurrentUser();
    	if (currentUser != null) {
    		result = favoritesDao.addFavoriteForUser(currentUser, newFavorite);
    	}
    	
    	return result;
    }
    
}