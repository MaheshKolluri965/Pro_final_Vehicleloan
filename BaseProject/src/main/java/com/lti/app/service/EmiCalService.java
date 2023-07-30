package com.lti.app.service;

import java.util.List;

import com.lti.app.pojo.Customer;
import com.lti.app.pojo.EmiCalculator;

public interface EmiCalService {

	public void emidata(EmiCalculator emicalculator);
	

	public List<EmiCalculator> getemi();
	
	public EmiCalculator calculatemi(EmiCalculator emicalculator);

	public Double loanoffer1(EmiCalculator emicalculator);

	public Double loanoffer2(EmiCalculator emicalculator);

	public Double loanoffer3(EmiCalculator emicalculator);


	
	
	

}
