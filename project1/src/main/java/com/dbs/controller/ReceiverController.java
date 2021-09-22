package com.dbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.beans.receiver;
import com.dbs.service.IReceiverService;

@RestController
public class ReceiverController {
	
	@Autowired
	IReceiverService receiverService;
	
	@GetMapping(value="receiver")
	public ResponseEntity<List<receiver>> getReceivers() {
		List<receiver> rec = receiverService.findAll();
		return new ResponseEntity<List<receiver>>(rec, HttpStatus.OK);
	}
	
	@GetMapping(value="receiver/{id}")
	public ResponseEntity<receiver> getReceiver(@PathVariable("id") String id){
		receiver rec = receiverService.findById(id);
		return new ResponseEntity<receiver>(rec,HttpStatus.OK);
	}

	

}