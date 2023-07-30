package com.lti.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/*
import com.lti.app.pojo.Accountdetails;
import com.lti.app.pojo.UserLogin;
import com.lti.app.springdatajpa.UserAccountJPARepo;
import com.lti.app.springdatajpa.UserJPARepo;

@Service
public class UserAccDetailsServiceImpl implements UserAccDetailsService {
	@Autowired
	UserAccountJPARepo uRepo ;
	
	@Autowired
	UserJPARepo uLRepo;
	

	@Override
	public Accountdetails saveUser(Accountdetails user, int userId) throws Exception {
		// TODO Auto-generated method stub
		String tempAccNo= user.getAccno();
		Accountdetails u=null;
		UserLogin tempUser=uLRepo.findByUserid(userId);
		user.setUserLogin(tempUser);
		if(tempAccNo!=null)
		{
			u=uRepo.findByAccNo(tempAccNo);
			if(u!=null)
				throw new Exception("Invalid User");
		}
		return uRepo.save(user);
	}


	@Override
	public Accountdetails getAccDetailsById(int userId) {
		
		return uRepo.findByCurrentUserLogin(userId);
	}


}
*/