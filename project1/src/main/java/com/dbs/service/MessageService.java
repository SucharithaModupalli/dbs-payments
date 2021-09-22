package com.dbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.beans.message;
import com.dbs.dao.MessageRepo;


@Service
public class MessageService implements IMessageService {

	@Autowired
	MessageRepo messageRepo;
	

	@Override
	public message findById(String code) {
		// TODO Auto-generated method stub
		//return null;
		return messageRepo.findById(code).get();
	}

	@Override
	public List<message> findAll() {
		// TODO Auto-generated method stub
		return messageRepo.findAll();
	}

	@Override
	public message addMessage(message msg) {
		// TODO Auto-generated method stub
		return null;
	}

}