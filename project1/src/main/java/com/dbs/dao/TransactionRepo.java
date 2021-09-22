
package com.dbs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.beans.transaction;

public interface TransactionRepo extends JpaRepository< transaction, Integer>
{
	
}
