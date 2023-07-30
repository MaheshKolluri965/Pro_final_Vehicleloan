package com.lti.app.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.app.pojo.UserLogin;


@Repository
public interface UserJPARepo extends JpaRepository<UserLogin, Integer>{

	UserLogin findByUseremailid(String tempEmail);

	UserLogin findByUseremailidAndUserpassword(String tempEmail, String tempPassword);

	UserLogin findByUserid(int userId);

}
