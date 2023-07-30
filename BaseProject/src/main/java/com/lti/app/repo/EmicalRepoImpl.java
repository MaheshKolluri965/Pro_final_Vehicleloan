package com.lti.app.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.app.pojo.EmiCalculator;
import com.lti.app.springdatajpa.MyJPAEMIRepo;
import com.lti.app.springdatajpa.MyJPARepo;

@Repository
public class EmicalRepoImpl implements EmicalRepo{

	@Autowired
	MyJPAEMIRepo jpaERepo;

	
	@Override
	public void emidata(EmiCalculator emicalculator) {
			jpaERepo.save(emicalculator);
	}
	
	
	@Override
	public List<EmiCalculator> getemi() {
		// TODO Auto-generated method stub
		return jpaERepo.findAll();

	}

	
	
	@Override
	public EmiCalculator calculatemi(EmiCalculator emicalculator) {
		
			Double principal = emicalculator.getLoanamount();
			Double time = emicalculator.getLoantenure() * 12;
			Double rate = emicalculator.getLoanroi() / (12*100);
			
			Double emiAmount =principal*rate*Math.pow(1+rate,time)/(Math.pow(1+rate,time)-1);
			
			Double emipm = emicalculator.setEmipm((double) Math.round(emiAmount));
			Double totalPay = emicalculator.setTotalPayment((double) Math.round(emiAmount*time));
			emicalculator.setRoiAmount(totalPay - principal);

			return emicalculator;
			//return (double) Math.round(emiamount);
			//return jpaERepo.save(emicalculator); if you use this it will store this data which is unneccesary
	}
	@Override
	public Double loanoffers1(EmiCalculator emicalculator) {
		
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
	public Double loanoffers2(EmiCalculator emicalculator) {
		
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
	public Double loanoffers3(EmiCalculator emicalculator) {
		
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
	
	
	
	

		/*
		 double principal =400000 ;      
		    
	        double rate =10 ;
	              
	        double time =1 ;
	      
	        rate=rate/(12*100);
	 
	        time=time*12;
	            
	        double emi= (principal*rate*Math.pow(1+rate,time))/(Math.pow(1+rate,time)-1);
	      
	        System.out.print(" EMI is= "+emi+"\n");
	        return emi;
	        
	        */
	
	
	




	


}
