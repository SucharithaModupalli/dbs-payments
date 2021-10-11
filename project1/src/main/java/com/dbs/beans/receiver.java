package com.dbs.beans;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity(name="receiver")
public class receiver {
	@Id
	String bic;
	String instname;
	public receiver() {
		super();
		// TODO Auto-generated constructor stub
	}
	public receiver(String bic, String instname) {
		super();
		this.bic = bic;
		this.instname = instname;
	}
	public String getBic() {
		return bic;
	}
	public void setBic(String bic) {
		this.bic = bic;
	}
	public String getInstname() {
		return instname;
	}
	public void setInstname(String instname) {
		this.instname = instname;
	}
	@Override
	public String toString() {
		return "Receiver [bic=" + bic + ", instname=" + instname + "]";
	}
	

}
