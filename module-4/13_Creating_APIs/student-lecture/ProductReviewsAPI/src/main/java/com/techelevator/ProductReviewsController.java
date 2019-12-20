package com.techelevator;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.reviews.dao.ProductReviewDao;
import com.techelevator.reviews.exception.ProductReviewNotFoundException;
import com.techelevator.reviews.model.ProductReview;

@RestController
@CrossOrigin
@RequestMapping(path = "api/reviews", consumes = "application/json", produces = "application/json")
public class ProductReviewsController {

	private ProductReviewDao productReviewDao;

	private ProductReviewsController(ProductReviewDao productReviewDao) {
		this.productReviewDao = productReviewDao;
	}

	@GetMapping
	public List<ProductReview> getL() {
		return productReviewDao.list();
	}

	@GetMapping("/{id}")
	public ProductReview getReview(@PathVariable int id) {
		ProductReview review = productReviewDao.read(id);

		if (review == (null)) {
			throw new ProductReviewNotFoundException(id);
		} else {
			return review;
		}
	}
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ProductReview postReview(@RequestBody ProductReview newReview) {
		return productReviewDao.create(newReview);
		
	}
	
	@PutMapping("/{id}")
	public ProductReview putReview(@RequestBody ProductReview updatedReview, @PathVariable int id) {
		ProductReview requestedReview = productReviewDao.read(id);
		updatedReview.setId(id);
		if(requestedReview != null) {
			return productReviewDao.update(updatedReview);
		}
		else {
			throw new ProductReviewNotFoundException(id);
			
		}
	}
	@DeleteMapping("/{id}")
	public void deleteReview(@RequestBody ProductReview updatedReview, @PathVariable int id) {
		ProductReview requestedReview = productReviewDao.read(id);
		if(requestedReview != null) {
			throw new ProductReviewNotFoundException(id);
		}
		else {
			productReviewDao.delete(id);
			
		}
}}
