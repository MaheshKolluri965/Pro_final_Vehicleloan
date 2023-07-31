package com.lti.app.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.app.emiCalculator.EmiCalculatorEntity;
import com.lti.app.pojo.Customer;
 
public interface MyJPARepo extends JpaRepository<Customer, String>
{

 
}

