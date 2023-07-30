package com.lti.app.repo;

import java.util.List;

import com.lti.app.pojo.EmiCalculator;

public interface EmicalRepo {
	

	public void emidata(EmiCalculator emicalculator);
	
	public List<EmiCalculator> getemi();

	public EmiCalculator calculatemi(EmiCalculator emicalculator);
	
	public Double loanoffers1(EmiCalculator emicalculator);
	public Double loanoffers2(EmiCalculator emicalculator);
	public Double loanoffers3(EmiCalculator emicalculator);
	
}
