package com.dbs.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.beans.customer;

import com.dbs.service.ICustomerService;

@RestController
public class CustomerController {

	@Autowired
	ICustomerService customerService;
	
	@GetMapping(value="cust")
	public ResponseEntity<List<customer>> getCustomer() {
		
		List<customer> cust = customerService.findAll();
		return new ResponseEntity<List<customer>>(cust, HttpStatus.OK);
	}
	
	@GetMapping(value="customer/{id}")
		public ResponseEntity<customer> getEmployee(@PathVariable("id") String customerId) {
		customer  cus= customerService.findById(customerId);
			return new ResponseEntity<>(cus, HttpStatus.OK);
	}
		
}
		
