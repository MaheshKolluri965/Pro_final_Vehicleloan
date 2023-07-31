package com.lti.app.emiCalculator;

import java.util.List;

public interface EmicalRepo {
	

	public void emidata(EmiCalculatorEntity emicalculator);
	
	public List<EmiCalculatorEntity> getemi();

	public EmiCalculatorEntity calculatemi(EmiCalculatorEntity emicalculator);
	
	public Double loanoffers1(EmiCalculatorEntity emicalculator);
	public Double loanoffers2(EmiCalculatorEntity emicalculator);
	public Double loanoffers3(EmiCalculatorEntity emicalculator);
	
}
