package com.techelevator.controller;

import com.techelevator.authentication.AuthProvider;
import com.techelevator.authentication.UnauthorizedException;
import com.techelevator.model.FavoritePokemon;
import com.techelevator.model.FavoritesDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	private FavoritesDao FavoritesDao;

	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String authorizedOnly() throws UnauthorizedException {
		/*
		 * You can lock down which roles are allowed by checking if the current user has
		 * a role.
		 * 
		 * In this example, if the user does not have the admin role we send back an
		 * unauthorized error.
		 */
		if (!authProvider.userHasRole(new String[] { "admin" })) {
			throw new UnauthorizedException();
		}
		return "Success";
	}

	@GetMapping("/user/team")
	List<FavoritePokemon> getFavoritePokemon() {
		List<FavoritePokemon> result = null;
		if (authProvider.getCurrentUser() != null) {
			return FavoritesDao.getFavoritesForUser(authProvider.getCurrentUser());
		}
		return result;
	}

	@PostMapping("/user/team")
	FavoritePokemon addFavoritePokemon(@RequestBody FavoritePokemon newFav) {
		FavoritePokemon resultFavoritePokemon = null;
		if (authProvider.getCurrentUser() != null) {
			resultFavoritePokemon = FavoritesDao.addFavoritePokemon(authProvider.getCurrentUser(), newFav);
		}
		return resultFavoritePokemon;

	}

	@PutMapping("/user/team")
	FavoritePokemon updateFavoritePokemon(@RequestBody FavoritePokemon newFav) {
		return FavoritesDao.updateTeam(authProvider.getCurrentUser(), newFav);

	}

}