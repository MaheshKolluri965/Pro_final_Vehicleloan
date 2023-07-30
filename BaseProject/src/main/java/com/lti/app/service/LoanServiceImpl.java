package com.lti.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.app.pojo.LoanDetails;
import com.lti.app.repo.EmicalRepo;
import com.lti.app.repo.LoanRepo;



@Service
@Transactional
public class LoanServiceImpl implements LoanService {

	@Autowired
	LoanRepo lRepo;
	

	
	@Override
	public boolean updateLoanapp(LoanDetails loan) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String updateLoanrej(LoanDetails loan) {
		// TODO Auto-generated method stub
		return lRepo.updateLoanrej(loan);
	}


	@Override
	public void addLoan(LoanDetails loan) {
		// TODO Auto-generated method stub
		lRepo.addLoan(loan);
	}



	@Override
	public List<LoanDetails> getLoandetails() {
		// TODO Auto-generated method stub
		return lRepo.getLoandetails();
	}

	@Override
	public String getstatus(LoanDetails loan) {
		// TODO Auto-generated method stub
		return lRepo.getstatus(loan);
	}

}
