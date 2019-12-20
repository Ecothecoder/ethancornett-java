package com.techelevator.controller;

import com.techelevator.authentication.AuthProvider;
import com.techelevator.authentication.UnauthorizedException;
import com.techelevator.model.CatFact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/fact")
    CatFact getCatFact() {
    	
    	RestTemplate rest = new RestTemplate();
    	CatFact cf = rest.getForObject("https://cat-fact.herokuapp.com/facts/random", CatFact.class);
    	
    	return cf;
    	
    }
}