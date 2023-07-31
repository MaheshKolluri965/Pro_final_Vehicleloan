package com.lti.app.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.lti.app.security.register.RegisterEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="customerdetails")
public class Customer {
	
	@Id
	@Column(name="custemailid", length = 50)
	private String custemail;
	
	//@Column(name="firstname", length = 20)
	private String custfname;
	
	//@Column(name="lastname", length = 20)
	private String custlname;
	
	//@Column(name="age", length = 20)
	private String custage;
	
	//@Column(name="gender", length = 20)
	private String custgender;
	
	//@Column(name="mobileno", length = 20)
	private String custmobileno;
	
	//@Column(name="employementtype", length = 20)
	private String emptype;
	
	//@Column(name="annualsalary", length = 20)
	private Double empannualsalary;
	
	//@Column(name="exisiting emi", length = 20)
	private String empexistingemi;
	
	//@Column(name="carcompany", length = 20)
	private String vehcarcompany;
	
	//@Column(name="carmodel", length = 20)
	private String vehcarmodel;
	
	//@Column(name="showrromprice", length = 20)
	private String vehexshowroomprice;
	
	//@Column(name="roadprice", length = 20)
	private Double vehonroadprice;
	
	//@Column(name="cbilscore", length = 20)
	private Double custcbilscore;
	//-------------------------------
	//@Column(name="address", length = 20)
	private String custaddress;
	
	//@Column(name="state", length = 20)
	private String custstate;
	
	//@Column(name="city", length = 20)
	private String custcity;
	
	//@Column(name="pincode", length = 20)
	private String custpincode;
	
	

	//@Column(name="pincode", length = 20)
	private String custloanamount;
	

	//@Column(name="pincode", length = 20)
	private String custloanroi;
	

	//@Column(name="pincode", length = 20)
	private String custloantenure;
	

	//@Column(name="pincode", length = 20)
	private String custloancarprice;
	//---------------------------------
	

	

@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="userid",referencedColumnName = "userid")
private UserLogin loanid;


@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="LOAN_ID",referencedColumnName = "LOAN_ID")
private LoanDetails loandet;

@OneToOne
@JoinColumn(name = "register_email_id") // specify the foreign key column
private RegisterEntity registerEmail;

	
}
