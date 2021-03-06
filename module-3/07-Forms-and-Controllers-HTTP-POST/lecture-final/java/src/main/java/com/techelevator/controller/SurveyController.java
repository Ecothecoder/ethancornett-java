package com.techelevator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.techelevator.model.Survey;
import com.techelevator.model.SurveyDAO;

@Controller
public class SurveyController {
	
	@Autowired
	private SurveyDAO surveyDAO;

	@RequestMapping(path="/surveyInput", method=RequestMethod.GET)
	public String showSurveyInput() {
		return "surveyInput";
	}
	
	@RequestMapping(path="/surveyInput", method=RequestMethod.POST)
	public String processSurveyInput(@ModelAttribute Survey currentSurvey) {
		
		surveyDAO.save(currentSurvey);
		
		return "redirect:/surveyResult";
	}
	
	@RequestMapping(path="/surveyResult", method=RequestMethod.GET)
	public String showSurveyResult() {
		return "surveyResult";
	}
}
