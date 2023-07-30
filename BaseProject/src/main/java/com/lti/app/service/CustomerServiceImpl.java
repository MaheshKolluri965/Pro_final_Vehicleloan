package com.lti.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.app.pojo.Customer;
import com.lti.app.repo.CustomerRepo;



@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	

	@Autowired
	CustomerRepo cRepo;
	
	
	@Override
	public void addCustomers(Customer customer) {
		cRepo.addCustomers(customer);
		
	}


	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return cRepo.getCustomers();
	}


	@Override
	public boolean updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return cRepo.updateCustomer(customer);
	}


	@Override
	public boolean deleteCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return cRepo.deleteCustomer(customer);
	}


	@Override
	public Customer searchCustomerByEmail(String custemail) {
		// TODO Auto-generated method stub
		return cRepo.searchCustomerByEmail(custemail);
	}


	
	
}
