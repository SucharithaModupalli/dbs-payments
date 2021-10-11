package com.dbs.beans;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table (name= "transactiondata")
public class transaction {

	
	@Id
	
	@Column(name="transactionid")
	int transactionId;
	@Column(name="name")
	String name;
	@Column(name="bic")
	String bic;
	@Column(name="type")
	String type;
	@Column(name="account_no")
	String account_no;
	@Column(name="code")
	String code;
	public  int getTransactionId() {
		return transactionId;
	}
	public  void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBic() {
		return bic;
	}
	public void setBic(String bic) {
		this.bic = bic;
	}
	public  String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public  String getAccount_no() {
		return account_no;
	}
	public  void setAccount_no(String account_no) {
		this.account_no = account_no;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "transaction [transactionId=" + transactionId + ", name=" + name + ", bic=" + bic + ", type=" + type
				+ ", account_no=" + account_no + ", code=" + code + "]";
	}
	public transaction(int transactionId, String name, String bic, String type, String account_no, String code) {
		super();
		this.transactionId = transactionId;
		this.name = name;
		this.bic = bic;
		this.type = type;
		this.account_no = account_no;
		this.code = code;
	}
	public transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
