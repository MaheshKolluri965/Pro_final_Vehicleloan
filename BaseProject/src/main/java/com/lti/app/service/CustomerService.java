package com.lti.app.service;

import java.util.List;

import com.lti.app.pojo.Customer;

public interface CustomerService {
	
	public void addCustomers(Customer customer);
	public List<Customer> getCustomers();
	
	public boolean updateCustomer(Customer customer);
	public boolean deleteCustomer(Customer customer);
	public Customer searchCustomerByEmail(String custemail);

}
