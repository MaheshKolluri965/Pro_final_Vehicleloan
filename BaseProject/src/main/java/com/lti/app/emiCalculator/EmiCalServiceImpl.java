package com.lti.app.emiCalculator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.app.pojo.Customer;
import com.lti.app.repo.CustomerRepo;


@Service
@Transactional
public class EmiCalServiceImpl implements EmiCalService {


	@Autowired
	EmicalRepo eRepo;
	
	
	@Override
	public void emidata(EmiCalculatorEntity emicalculator) {
		// TODO Auto-generated method stub
		eRepo.emidata(emicalculator);
	}

	@Override
	public List<EmiCalculatorEntity> getemi() {
		// TODO Auto-generated method stub
		return eRepo.getemi();
	}
	
	
	@Override
	public EmiCalculatorEntity calculatemi(EmiCalculatorEntity emicalculator) {
		// TODO Auto-generated method stub
		return eRepo.calculatemi(emicalculator);
	}

	@Override
	public Double loanoffer1(EmiCalculatorEntity emicalculator) {
		// TODO Auto-generated method stub
		return eRepo.loanoffers1(emicalculator);
	}
	
	@Override
	public Double loanoffer2(EmiCalculatorEntity emicalculator) {
		// TODO Auto-generated method stub
		return eRepo.loanoffers2(emicalculator);
	}
	@Override
	public Double loanoffer3(EmiCalculatorEntity emicalculator) {
		// TODO Auto-generated method stub
		return eRepo.loanoffers3(emicalculator);
	}

}