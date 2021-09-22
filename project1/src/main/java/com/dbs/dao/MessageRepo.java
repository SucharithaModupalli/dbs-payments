package com.dbs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.beans.message;

public interface MessageRepo extends JpaRepository<message,String> {

}