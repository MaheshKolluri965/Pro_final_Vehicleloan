package com.lti.app.emiCalculator;

import java.util.List;

import com.lti.app.pojo.Customer;

public interface EmiCalService {

	public void emidata(EmiCalculatorEntity emicalculator);
	

	public List<EmiCalculatorEntity> getemi();
	
	public EmiCalculatorEntity calculatemi(EmiCalculatorEntity emicalculator);

	public Double loanoffer1(EmiCalculatorEntity emicalculator);

	public Double loanoffer2(EmiCalculatorEntity emicalculator);

	public Double loanoffer3(EmiCalculatorEntity emicalculator);
	
	
	

}
