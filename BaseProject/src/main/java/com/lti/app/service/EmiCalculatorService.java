package com.lti.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.app.pojo.Customer;
import com.lti.app.pojo.EmiCalculator;
import com.lti.app.repo.CustomerRepo;
import com.lti.app.repo.EmicalRepo;


@Service
@Transactional
public class EmiCalculatorService implements EmiCalService {


	@Autowired
	EmicalRepo eRepo;
	
	
	@Override
	public void emidata(EmiCalculator emicalculator) {
		// TODO Auto-generated method stub
		eRepo.emidata(emicalculator);
	}

	@Override
	public List<EmiCalculator> getemi() {
		// TODO Auto-generated method stub
		return eRepo.getemi();
	}
	
	
	@Override
	public EmiCalculator calculatemi(EmiCalculator emicalculator) {
		// TODO Auto-generated method stub
		return eRepo.calculatemi(emicalculator);
	}

	@Override
	public Double loanoffer1(EmiCalculator emicalculator) {
		// TODO Auto-generated method stub
		return eRepo.loanoffers1(emicalculator);
	}
	
	@Override
	public Double loanoffer2(EmiCalculator emicalculator) {
		// TODO Auto-generated method stub
		return eRepo.loanoffers2(emicalculator);
	}
	@Override
	public Double loanoffer3(EmiCalculator emicalculator) {
		// TODO Auto-generated method stub
		return eRepo.loanoffers3(emicalculator);
	}

}