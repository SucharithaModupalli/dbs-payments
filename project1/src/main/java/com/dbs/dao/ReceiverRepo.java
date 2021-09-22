package com.dbs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dbs.beans.receiver;

@Repository
public interface ReceiverRepo extends JpaRepository<receiver,String> {

}