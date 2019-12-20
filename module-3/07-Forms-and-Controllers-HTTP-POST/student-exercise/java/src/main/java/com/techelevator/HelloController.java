package com.techelevator;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techelevator.model.Review;
import com.techelevator.model.ReviewDao;

@Controller 
public class HelloController {
	
	@Autowired
	private ReviewDao reviewDao;

	@GetMapping("/")
	public String displayGreeting(ModelMap modelMap) {
		modelMap.put("review",reviewDao.getAllReviews());
		return "greeting";
	}
	
	@PostMapping("/")
	public String processReviewPost(@ModelAttribute Review review) {
		review.setDateSubmitted(LocalDateTime.now());
		reviewDao.save(review);
		return "redirect:/";
	}
	@GetMapping("/review")
	public String reviewPage(ModelMap modelMap) {
		return "review";
	}
	
	
}
