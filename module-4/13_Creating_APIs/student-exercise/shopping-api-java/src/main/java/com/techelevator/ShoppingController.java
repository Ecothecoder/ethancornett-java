package com.techelevator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.techelevator.shopping.dao.ItemDao;
import com.techelevator.shopping.exception.ItemNotFoundException;
import com.techelevator.shopping.model.Item;

@RestController
@CrossOrigin
@RequestMapping(path = "/api/groceries")
public class ShoppingController {

	private ItemDao itemDAO;
	String error = "";

	@Autowired
	private ShoppingController(ItemDao Itemdao) {
		this.itemDAO = Itemdao;
	}

	@GetMapping
	public List<Item> getListofItems() {
		return itemDAO.list();
	}

	@GetMapping("/{id}")
	public Item getItem(@PathVariable int id) {
		Item review = itemDAO.read(id);

		if (review == (null)) {
			throw new ItemNotFoundException(id, error);
		} else {
			return review;
		}
	}

	@PostMapping(consumes = "application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public Item postItem(@RequestBody Item newItem) {
		newItem.setId(itemDAO.list().size()+1);
		return itemDAO.create(newItem);

	}

	@PutMapping("/{id}")
	public Item putItem(@RequestBody Item updatedItem, @PathVariable int id) {
		Item requestedItem = itemDAO.read(id);
		updatedItem.setId(id);
		if (requestedItem != null) {
			return itemDAO.update(updatedItem);
		} else {
			throw new ItemNotFoundException(id, error);

		}
	}

}
