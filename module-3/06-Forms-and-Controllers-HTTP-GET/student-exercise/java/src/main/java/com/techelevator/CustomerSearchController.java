package com.techelevator;

import com.techelevator.dao.CustomerDao;
import com.techelevator.dao.model.Actor;
import com.techelevator.dao.model.Customer;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerSearchController {

	@Autowired
	private CustomerDao customerDao;

	@RequestMapping("/customers")
	public String showSearchCustomers() {
		return "customerList";
	}

	@RequestMapping("/customerSearch")
	public String customerSearch(@RequestParam String search, @RequestParam String sort, ModelMap modelMap) {
		List<Customer> matchingCustomers = new LinkedList<Customer>(customerDao.searchAndSortCustomers(search, sort));
		modelMap.put("customers", matchingCustomers);

		return "customerList";
	}

}