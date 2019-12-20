package com.techelevator;

import com.techelevator.dao.FilmDao;
import com.techelevator.dao.model.Film;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * FilmSearchController
 */
@Controller
public class FilmSearchController {

    @Autowired
    FilmDao filmDao;
    
    @RequestMapping("/films")
    public String showFilmSearchForm(ModelMap modelMap) {
    	List<String> genre = filmDao.getGenres();
    	modelMap.put("genres", genre);
        return "filmList";
    }
    
	@RequestMapping("/filmSearch")
	public String searchFilms(@RequestParam String genre,@RequestParam int minLength,@RequestParam int maxLength,ModelMap modelMap) {
		List<Film> matchingFilm = filmDao.getFilmsBetween(genre, minLength, maxLength);
		modelMap.put("films", matchingFilm);
    	List<String> genre2 = filmDao.getGenres();
    	modelMap.put("genres", genre2);
		
		
		return "filmList";
	}
    
}