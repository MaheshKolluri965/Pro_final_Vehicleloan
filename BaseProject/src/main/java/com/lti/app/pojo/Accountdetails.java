/*
package com.lti.app.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "accountdetails")
public class Accountdetails {



	@Id
	@Column(name="accountnumber", length=30)
	private String accno;
	
	@Column(name="accountbankname", length=30)
	private String accbankname;
	
	@Column(name="accountifsc", length=30)
	private String accifsc;
	
	//@Column(name="accounttype", length=30)
	//private String acctype;

	//one to one mapping with customer table
		@OneToOne(cascade = CascadeType.ALL, mappedBy = "account")
		private Customer cust;
	
	
	
	//one to one mapping with userLogin table
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "account")
	private UserLogin user;
	
	
	
	//one to one mapping 
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "userAccDetails")
	private AdminLogin admin;

	
	public Accountdetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Accountdetails(String accno, String accbankname, String accifsc, String acctype, Customer cust) {
		super();
		this.accno = accno;
		this.accbankname = accbankname;
		this.accifsc = accifsc;
		this.acctype = acctype;
		//this.cust = cust;
	}

	public String getAccno() {
		return accno;
	}

	public void setAccno(String accno) {
		this.accno = accno;
	}

	public String getAccbankname() {
		return accbankname;
	}

	public void setAccbankname(String accbankname) {
		this.accbankname = accbankname;
	}

	public String getAccifsc() {
		return accifsc;
	}

	public void setAccifsc(String accifsc) {
		this.accifsc = accifsc;
	}

	public String getAcctype() {
		return acctype;
	}

	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}
/*
	public Customer getCust() {
		return cust;
	}
*//*
	public void setCust(Customer cust) {
		this.cust = cust;
	}
	@Override
	public String toString() {
		return "Accountdetails [accno=" + accno + ", accbankname=" + accbankname + ", accifsc=" + accifsc + ", acctype="
				+ acctype + ", cust=" + "]";
	}
	
	

}

*/
