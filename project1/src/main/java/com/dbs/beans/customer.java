package com.dbs.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "customer")
public class customer {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "customerid") 
	String customerId;
	@Column(name = "accountholdername") 
	String name;
	@Column(name= "balance")
	Integer balance ;
	@Column(name= "overdraft")
	String overdraft;
	public customer(String customerId, String name, Integer balance, String overdraft) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.balance = balance;
		this.overdraft = overdraft;
	}
	public customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getBalance() {
		return balance;
	}
	public void setBalance(Integer balance) {
		this.balance = balance;
	}
	public String getOverdraft() {
		return overdraft;
	}
	public void setOverdraft(String overdraft) {
		this.overdraft = overdraft;
	}
	
}