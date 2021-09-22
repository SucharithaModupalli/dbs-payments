package com.dbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.beans.transaction;
import com.dbs.dao.TransactionRepo;

@Service
public class transactionService implements ITransactionService {
	@Autowired
	TransactionRepo transactionRepo;
	
	@Override
	public transaction addTransaction(transaction trans) {
		return transactionRepo.save(trans);
	}
}
