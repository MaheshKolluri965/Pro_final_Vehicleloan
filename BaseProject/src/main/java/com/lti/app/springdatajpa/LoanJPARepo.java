package com.lti.app.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.app.emiCalculator.EmiCalculatorEntity;
import com.lti.app.pojo.LoanDetails;
@Repository
public interface LoanJPARepo  extends JpaRepository<LoanDetails , String>{

}
