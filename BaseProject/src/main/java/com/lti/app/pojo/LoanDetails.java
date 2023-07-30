package com.lti.app.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="loandetails")

public class LoanDetails {


	@Id
	@Column(name="LOAN_ID")
	@SequenceGenerator(name = "Loan_Id_Seq", sequenceName = "Loan_Id_Seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "Loan_Id_Seq")
	private long loanid;
	@Column(name="email")
	private String custemail;

	private Double loanamount;
	private Double loanroi;
	private Double loantenure;
	private Double emi;
	private String status;
	public LoanDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoanDetails(long loanid, String custemail, Double loanamount, Double loanroi, Double loantenure, Double emi,
			String status) {
		super();
		this.loanid = loanid;
		this.custemail = custemail;
		this.loanamount = loanamount;
		this.loanroi = loanroi;
		this.loantenure = loantenure;
		this.emi = emi;
		this.status = status;
	}
	@Override
	public String toString() {
		return "LoanDetails [loanid=" + loanid + ", custemail=" + custemail + ", loanamount=" + loanamount
				+ ", loanroi=" + loanroi + ", loantenure=" + loantenure + ", emi=" + emi + ", status=" + status + "]";
	}
	public long getLoanid() {
		return loanid;
	}
	public void setLoanid(long loanid) {
		this.loanid = loanid;
	}
	public String getCustemail() {
		return custemail;
	}
	public void setCustemail(String custemail) {
		this.custemail = custemail;
	}
	public Double getLoanamount() {
		return loanamount;
	}
	public void setLoanamount(Double loanamount) {
		this.loanamount = loanamount;
	}
	public Double getLoanroi() {
		return loanroi;
	}
	public void setLoanroi(Double loanroi) {
		this.loanroi = loanroi;
	}
	public Double getLoantenure() {
		return loantenure;
	}
	public void setLoantenure(Double loantenure) {
		this.loantenure = loantenure;
	}
	public Double getEmi() {
		return emi;
	}
	public void setEmi(Double emi) {
		this.emi = emi;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	}


