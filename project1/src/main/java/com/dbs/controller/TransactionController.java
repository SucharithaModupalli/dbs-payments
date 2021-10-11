package com.dbs.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.dbs.beans.transaction;
import com.dbs.service.ITransactionService;

@RestController
public class TransactionController {

	@Autowired
	ITransactionService transactionService;
	
	@PostMapping(value="transaction")
	public ResponseEntity<transaction> addEmployee(@RequestBody transaction trans) {
		transaction restrans = transactionService.addTransaction(trans);
		return new ResponseEntity<>(restrans, HttpStatus.OK);
	}
}

