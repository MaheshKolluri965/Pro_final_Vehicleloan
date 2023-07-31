package com.lti.app.emiCalculator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/rest/api")
public class EmiCalculatorController {
	
	
	@Autowired
	private EmiCalculatorServiceImpl emiCalService;
	
	@PostMapping("/customers/emi")
	public EmiCalculatorEntity emicalculation(@RequestBody EmiCalculatorEntity emi) {
		return emiCalService.calculatemi(emi);
		//return emiservice.calculatemi(emi);
		
	}
	
	/* 

	@Autowired
	private EmiCalServiceImpl emiservice;
	@GetMapping("/customers/emi")
	public List<EmiCalEntity> getAllEmi(){
		return emiservice.getemi();
	}
	
	
	
	@PutMapping("/customers/emi")
	public boolean emicalculationdata(@RequestBody EmiCalEntity emi) {
		 emiservice.emidata(emi);
		 return true;
	}
	
	//-----------------------------------------------
	
	@PutMapping("/customers/emi/loanoffer1")
	public Double loanoffers1(@RequestBody EmiCalEntity emi) {
		return emiservice.loanoffer1(emi);
	}
	
	@PutMapping("/customers/emi/loanoffer2")
	public Double loanoffers2(@RequestBody EmiCalEntity emi) {
		return emiservice.loanoffer2(emi);
	}
	@PutMapping("/customers/emi/loanoffer3")
	public Double loanoffers3(@RequestBody EmiCalEntity emi) {
		return emiservice.loanoffer3(emi);
	}
*/
}
