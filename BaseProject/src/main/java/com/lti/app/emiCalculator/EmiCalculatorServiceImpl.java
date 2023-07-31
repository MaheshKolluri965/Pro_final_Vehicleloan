package com.lti.app.emiCalculator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class EmiCalculatorServiceImpl implements EmiCalculatorService {
	

	@Autowired
	EmiCalculatorRepo eRepo;
	

	@Override
	public void emidata(EmiCalculatorEntity emicalculator) {
		// TODO Auto-generated method stub
		eRepo.save(emicalculator);	
	}

	@Override
	public List<EmiCalculatorEntity> getemi() {
		// TODO Auto-generated method stub
		return eRepo.findAll();
	}
	
	@Override
	public EmiCalculatorEntity calculatemi(EmiCalculatorEntity emicalculator) {
		
			Double principal = emicalculator.getLoanamount();
			Double time = emicalculator.getLoantenure() * 12;
			Double rate = emicalculator.getLoanroi() / (12*100);
			
			Double emiAmount =principal*rate*Math.pow(1+rate,time)/(Math.pow(1+rate,time)-1);
			
			emicalculator.setEmipm((double) Math.round(emiAmount));
			emicalculator.setTotalPayment((double) Math.round(emiAmount*time));
			emicalculator.setRoiAmount(emicalculator.getTotalPayment() - principal);

			return emicalculator;
			//return (double) Math.round(emiamount);
			//return jpaERepo.save(emicalculator); if you use this it will store this data which is unneccesary
	}
	
	
	@Override
	public Double loanoffer1(EmiCalculatorEntity emicalculator) {
		
			Double principal = emicalculator.getLoanamount();
			Double time = 2.0;
			Double rate = 8.0;
			//Double rate = 10.0;
			rate = rate/(12*100);
			time = time*12;
			Double emiamount =(principal*rate*Math.pow(1+rate,time))/(Math.pow(1+rate,time)-1);
			//Double emi_1 = emicalculator.setEmi(emiamount);

			System.out.println(emiamount);
			return (double) Math.round(emiamount);
			//jpaERepo.save(emicalculator);
	}
	
	@Override
	public Double loanoffer2(EmiCalculatorEntity emicalculator) {
		
			Double principal = emicalculator.getLoanamount();
			Double time = 4.0;
			Double rate = 10.0;
			//Double rate = 10.0;
			rate = rate/(12*100);
			time = time*12;
			Double emiamount =(principal*rate*Math.pow(1+rate,time))/(Math.pow(1+rate,time)-1);
			//Double emi_1 = emicalculator.setEmi(emiamount);

			System.out.println(emiamount);
			return (double) Math.round(emiamount);
			//jpaERepo.save(emicalculator);
	}
	
	@Override
	public Double loanoffer3(EmiCalculatorEntity emicalculator) {
		
			Double principal = emicalculator.getLoanamount();
			Double time = 8.0;
			Double rate = 12.0;
			//Double rate = 10.0;
			rate = rate/(12*100);
			time = time*12;
			Double emiamount =(principal*rate*Math.pow(1+rate,time))/(Math.pow(1+rate,time)-1);
			//Double emi_1 = emicalculator.setEmi(emiamount);

			System.out.println(emiamount);
			return (double) Math.round(emiamount);
			//jpaERepo.save(emicalculator);
	}
	
	
	
}
