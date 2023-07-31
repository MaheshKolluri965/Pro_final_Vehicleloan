package com.lti.app.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.app.emiCalculator.EmiCalculatorEntity;
import com.lti.app.emiCalculator.EmiCalculatorJPARepo;
import com.lti.app.pojo.Customer;
import com.lti.app.pojo.LoanDetails;
import com.lti.app.springdatajpa.LoanJPARepo;

@Repository
public class LoanRepoImpl implements LoanRepo {
	@Autowired
	LoanJPARepo jpaLRepo;

	
	
	

	@Override
	public boolean updateLoanapp(LoanDetails loan) {
		String s = loan.getStatus();
		System.out.println(s);
		return true;
	}
	
	
	
	@Override
	public String updateLoanrej(LoanDetails loan) {
		// TODO Auto-generated method stub
		String s = loan.getStatus();
		s = "Rejected";
		System.out.println(s);
		return s;
	}

	
	@Override
	public String getstatus(LoanDetails loan) {
		String s = loan.getStatus();
		System.out.println(s);
		return s;
	}


	@Override
	public void addLoan(LoanDetails loan) {
		// TODO Auto-generated method stub
		jpaLRepo.save(loan);
	}


	@Override
	public List<LoanDetails> getLoandetails() {
		// TODO Auto-generated method stub
		return jpaLRepo.findAll();
	}


	
}
