package com.lti.app.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.app.pojo.EmiCalculator;

public interface MyJPAEMIRepo extends JpaRepository<EmiCalculator , Double> {

}
