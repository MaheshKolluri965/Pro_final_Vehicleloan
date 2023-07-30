package com.lti.app.springdatajpa;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.app.pojo.AdminLogin;

@Repository
public interface AdminJPARepo extends JpaRepository<AdminLogin, Integer>{


	//AdminLogin findByadminemailidadminpassword(String tempEmail, String tempPass);	

	AdminLogin findByEmailidAndPassword(String tempEmail, String tempPass);
	
	

}
