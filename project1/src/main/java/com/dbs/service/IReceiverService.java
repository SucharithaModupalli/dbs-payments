package com.dbs.service;

import java.util.List;

import com.dbs.beans.receiver;

public interface IReceiverService {
	
	receiver findById(String receiverid);

	List<receiver> findAll();

	receiver updateReceiver(receiver receiver);
	
	receiver deleteReceiver(String receiverid);


}