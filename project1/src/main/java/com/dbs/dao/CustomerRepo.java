package com.dbs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dbs.beans.customer;

@Repository
public interface CustomerRepo extends JpaRepository< customer, Integer> {

}
