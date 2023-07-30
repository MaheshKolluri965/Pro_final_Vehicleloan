package com.lti.app.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
/*
import com.lti.app.pojo.Accountdetails;

@Repository
public interface UserAccountJPARepo extends JpaRepository<Accountdetails, Integer>{

	
	
	Accountdetails findByAccNo(String tempAccNo);

	@Query("FROM UserAccDetails a where a.userLogin.userId = :userId")
	Accountdetails findByCurrentUserLogin(int userId);
	
	

}
*/