package com.dbs.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.beans.message;
import com.dbs.service.IMessageService;

@RestController
public class MessageController {
	
	@Autowired
	IMessageService messageservice;
	
	@GetMapping(value="message")
	public ResponseEntity<List<message>> getMessage() {
		List<message> msgs = messageservice.findAll();
		return new ResponseEntity<List<message>>(msgs, HttpStatus.OK);
	}
	

	@RequestMapping(value = "mes", method = RequestMethod.POST)
	public ResponseEntity<message> addMessage(message message) {
		message msg = messageservice.addMessage(message);
		return new ResponseEntity<message>(msg, HttpStatus.OK);
	}
	
	@GetMapping(value="message/{id}")
	public ResponseEntity<message> getMessage(@PathVariable("id") String id){
		message mes = messageservice.findById(id);
		return new ResponseEntity<message>(mes,HttpStatus.OK);
	}
	

}