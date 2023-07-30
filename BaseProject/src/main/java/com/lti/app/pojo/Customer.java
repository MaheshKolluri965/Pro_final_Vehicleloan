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


	
	
	//---------------------------------
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Customer(String custemail, String custfname, String custlname, String custage, String custgender,
			String custmobileno, String emptype, Double empannualsalary, String empexistingemi, String vehcarcompany,
			String vehcarmodel, String vehexshowroomprice, Double vehonroadprice, Double custcbilscore,
			String custaddress, String custstate, String custcity, String custpincode, String custloanamount,
			String custloanroi, String custloantenure, String custloancarprice) {
		super();
		this.custemail = custemail;
		this.custfname = custfname;
		this.custlname = custlname;
		this.custage = custage;
		this.custgender = custgender;
		this.custmobileno = custmobileno;
		this.emptype = emptype;
		this.empannualsalary = empannualsalary;
		this.empexistingemi = empexistingemi;
		this.vehcarcompany = vehcarcompany;
		this.vehcarmodel = vehcarmodel;
		this.vehexshowroomprice = vehexshowroomprice;
		this.vehonroadprice = vehonroadprice;
		this.custcbilscore = custcbilscore;
		this.custaddress = custaddress;
		this.custstate = custstate;
		this.custcity = custcity;
		this.custpincode = custpincode;
		this.custloanamount = custloanamount;
		this.custloanroi = custloanroi;
		this.custloantenure = custloantenure;
		this.custloancarprice = custloancarprice;
	}


	@Override
	public String toString() {
		return "Customer [custemail=" + custemail + ", custfname=" + custfname + ", custlname=" + custlname
				+ ", custage=" + custage + ", custgender=" + custgender + ", custmobileno=" + custmobileno
				+ ", emptype=" + emptype + ", empannualsalary=" + empannualsalary + ", empexistingemi=" + empexistingemi
				+ ", vehcarcompany=" + vehcarcompany + ", vehcarmodel=" + vehcarmodel + ", vehexshowroomprice="
				+ vehexshowroomprice + ", vehonroadprice=" + vehonroadprice + ", custcbilscore=" + custcbilscore
				+ ", custaddress=" + custaddress + ", custstate=" + custstate + ", custcity=" + custcity
				+ ", custpincode=" + custpincode + ", custloanamount=" + custloanamount + ", custloanroi=" + custloanroi
				+ ", custloantenure=" + custloantenure + ", custloancarprice=" + custloancarprice + "]";
	}


	public String getCustemail() {
		return custemail;
	}


	public void setCustemail(String custemail) {
		this.custemail = custemail;
	}


	public String getCustfname() {
		return custfname;
	}


	public void setCustfname(String custfname) {
		this.custfname = custfname;
	}


	public String getCustlname() {
		return custlname;
	}


	public void setCustlname(String custlname) {
		this.custlname = custlname;
	}


	public String getCustage() {
		return custage;
	}


	public void setCustage(String custage) {
		this.custage = custage;
	}


	public String getCustgender() {
		return custgender;
	}


	public void setCustgender(String custgender) {
		this.custgender = custgender;
	}


	public String getCustmobileno() {
		return custmobileno;
	}


	public void setCustmobileno(String custmobileno) {
		this.custmobileno = custmobileno;
	}


	public String getEmptype() {
		return emptype;
	}


	public void setEmptype(String emptype) {
		this.emptype = emptype;
	}


	public Double getEmpannualsalary() {
		return empannualsalary;
	}


	public void setEmpannualsalary(Double empannualsalary) {
		this.empannualsalary = empannualsalary;
	}


	public String getEmpexistingemi() {
		return empexistingemi;
	}


	public void setEmpexistingemi(String empexistingemi) {
		this.empexistingemi = empexistingemi;
	}


	public String getVehcarcompany() {
		return vehcarcompany;
	}


	public void setVehcarcompany(String vehcarcompany) {
		this.vehcarcompany = vehcarcompany;
	}


	public String getVehcarmodel() {
		return vehcarmodel;
	}


	public void setVehcarmodel(String vehcarmodel) {
		this.vehcarmodel = vehcarmodel;
	}


	public String getVehexshowroomprice() {
		return vehexshowroomprice;
	}


	public void setVehexshowroomprice(String vehexshowroomprice) {
		this.vehexshowroomprice = vehexshowroomprice;
	}


	public Double getVehonroadprice() {
		return vehonroadprice;
	}


	public void setVehonroadprice(Double vehonroadprice) {
		this.vehonroadprice = vehonroadprice;
	}


	public Double getCustcbilscore() {
		return custcbilscore;
	}


	public void setCustcbilscore(Double custcbilscore) {
		this.custcbilscore = custcbilscore;
	}


	public String getCustaddress() {
		return custaddress;
	}


	public void setCustaddress(String custaddress) {
		this.custaddress = custaddress;
	}


	public String getCuststate() {
		return custstate;
	}


	public void setCuststate(String custstate) {
		this.custstate = custstate;
	}


	public String getCustcity() {
		return custcity;
	}


	public void setCustcity(String custcity) {
		this.custcity = custcity;
	}


	public String getCustpincode() {
		return custpincode;
	}


	public void setCustpincode(String custpincode) {
		this.custpincode = custpincode;
	}


	public String getCustloanamount() {
		return custloanamount;
	}


	public void setCustloanamount(String custloanamount) {
		this.custloanamount = custloanamount;
	}


	public String getCustloanroi() {
		return custloanroi;
	}


	public void setCustloanroi(String custloanroi) {
		this.custloanroi = custloanroi;
	}


	public String getCustloantenure() {
		return custloantenure;
	}


	public void setCustloantenure(String custloantenure) {
		this.custloantenure = custloantenure;
	}


	public String getCustloancarprice() {
		return custloancarprice;
	}


	public void setCustloancarprice(String custloancarprice) {
		this.custloancarprice = custloancarprice;
	}
	
	
}
