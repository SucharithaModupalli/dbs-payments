package com.dbs.service;

import java.util.List;

import com.dbs.beans.message;

public interface IMessageService {
	message findById(String code);
	List<message> findAll();
	message addMessage(message msg);
	
}