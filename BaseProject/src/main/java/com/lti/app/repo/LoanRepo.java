package com.lti.app.repo;

import java.util.List;

import com.lti.app.emiCalculator.EmiCalculatorEntity;
import com.lti.app.pojo.Customer;
import com.lti.app.pojo.LoanDetails;

public interface LoanRepo {

	public void addLoan(LoanDetails loan);
	public List<LoanDetails> getLoandetails();

	public String getstatus(LoanDetails loan);

	
	public boolean updateLoanapp(LoanDetails loan);

	public String updateLoanrej(LoanDetails loan);
	
}
