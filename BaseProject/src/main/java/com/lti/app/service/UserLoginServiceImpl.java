package com.lti.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.app.pojo.Customer;
import com.lti.app.pojo.UserLogin;
import com.lti.app.springdatajpa.UserJPARepo;



@Service
public class UserLoginServiceImpl implements UserLoginService{
	@Autowired
	UserJPARepo uRepo;



	@Override
	public UserLogin saveUser(UserLogin user) throws Exception {

	String tempEmail=user.getUseremailid();
		
		if(tempEmail !=null && !"".equals(tempEmail)) 
		{
			UserLogin u=uRepo.findByUseremailid(tempEmail);
			if(u!=null)
				throw new Exception("User exists with this email id "+tempEmail);
		}
		
		
		
		return uRepo.save(user);
	}



	@Override
	public UserLogin loginUser(UserLogin user) throws Exception {
		String tempEmail=user.getUseremailid();
		String tempPassword=user.getUserpassword();
		UserLogin u=null;
		if(tempEmail!=null && tempPassword!=null) {
			if(u==null)
				throw new Exception("Invalid EmailId or password");
				
		}
		
		
		return uRepo.save(u);
	}


	@Override
	public UserLogin getUserById(int userId) {
		// TODO Auto-generated method stub
		return uRepo.findByUserid(userId);
	}


}
