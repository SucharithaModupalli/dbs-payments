package com.dbs.service;

import java.util.List;

import com.dbs.beans.customer;

public interface ICustomerService {

	public customer findById(String customerId);
	
	public List<customer> findAll();

	
}