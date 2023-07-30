package com.lti.app.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emitable")

public class EmiCalculator {
	
	@Id
	@Column(name="loan", length = 30)
	private Double loanamount;
	private Double loanroi;
	private Double loantenure;
	private Double emipm;
	private Double totalPayment;
	private Double roiAmount;
	
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
	public Double getEmipm() {
		return emipm;
	}
	public Double setEmipm(Double emipm) {
		return this.emipm = emipm;
	}
	public Double getTotalPayment() {
		return totalPayment;
	}
	public Double setTotalPayment(Double totalPayment) {
		return this.totalPayment = totalPayment;
	}
	public Double getRoiAmount() {
		return roiAmount;
	}
	public void setRoiAmount(Double roiAmount) {
		this.roiAmount = roiAmount;
	}
	
	
	
	
}
