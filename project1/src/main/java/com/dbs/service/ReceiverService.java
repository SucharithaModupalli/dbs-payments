package com.dbs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.beans.receiver;
import com.dbs.dao.ReceiverRepo;

@Service
public class ReceiverService implements IReceiverService {

	@Autowired
	ReceiverRepo receiverRepo;

	@Override
	public receiver findById(String bic) {
		// TODO Auto-generated method stub
		return receiverRepo.findById(bic).get();
	}

	@Override
	public List<receiver> findAll() {
		// TODO Auto-generated method stub
		return receiverRepo.findAll();
	}

	@Override
	public receiver updateReceiver(receiver receiver) {
		// TODO Auto-generated method stub
		Optional<receiver> optReceiver = receiverRepo.findById(receiver.getBic());
		if (optReceiver.isPresent()) {
			return receiverRepo.save(receiver);
		}
		else
			return null;
	}

	@Override
	public receiver deleteReceiver(String bic) {
		// TODO Auto-generated method stub
		//return null;
		Optional<receiver> optReceiver = receiverRepo.findById(bic);
		if (optReceiver.isPresent()) {
			receiverRepo.deleteById(bic);
			return receiverRepo.getById(bic);
		}
		else
			return null;
		 
	}
}