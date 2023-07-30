package com.lti.app.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.app.pojo.Customer;
import com.lti.app.springdatajpa.MyJPARepo;

@Repository
public class CustomerRepoImpl implements CustomerRepo  {

	
	@Autowired
	MyJPARepo jpaRepo;

	@Override
	public void addCustomers(Customer customer) {
		// TODO Auto-generated method stub
		jpaRepo.save(customer);
		
	}

	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return jpaRepo.findAll();
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		jpaRepo.save(customer);
		return true;
	}

	@Override
	public boolean deleteCustomer(Customer customer) {
		// TODO Auto-generated method stub
		jpaRepo.delete(customer);
		return true;
	}

	@Override
	public Customer searchCustomerByEmail(String custemail) {
		// TODO Auto-generated method stub
		Customer cust = jpaRepo.findById(custemail).get();
		return cust;
	}
	

}
