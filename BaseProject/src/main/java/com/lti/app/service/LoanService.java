package com.lti.app.service;

import java.util.List;

import com.lti.app.pojo.LoanDetails;

public interface LoanService {
	

	public void addLoan(LoanDetails loan);
	public List<LoanDetails> getLoandetails();
	
	public boolean updateLoanapp(LoanDetails loan);
	String updateLoanrej(LoanDetails loan);

	public String getstatus(LoanDetails loan);
}
