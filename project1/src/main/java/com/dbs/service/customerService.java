package com.dbs.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.beans.customer;
import com.dbs.dao.CustomerRepo;

@Service
public class customerService implements ICustomerService {

	@Autowired
	CustomerRepo customerRepo;
	
	@Override
	public customer findById(String customerId) {
		return customerRepo.findById(customerId).get();
	}
	@Override
	public List<customer> findAll(){
		return customerRepo.findAll();
	}
}