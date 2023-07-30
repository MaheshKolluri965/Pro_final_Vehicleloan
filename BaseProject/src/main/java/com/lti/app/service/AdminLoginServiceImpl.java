package com.lti.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.app.pojo.AdminLogin;
import com.lti.app.springdatajpa.AdminJPARepo;
import com.lti.app.service.*;


@Service
@Transactional
public class AdminLoginServiceImpl implements AdminLoginService {
	
		@Autowired
		AdminJPARepo aRepo;

		@Override
		public AdminLogin loginAdmin(AdminLogin adminLogin) throws Exception {
			// TODO Auto-generated method stub
			String tempEmail= adminLogin.getEmailid();
			String tempPass=adminLogin.getPassword();
			AdminLogin a=null;
			
			if(tempEmail!=null && tempPass!=null)
			{
				a=aRepo.findByEmailidAndPassword( tempEmail, tempPass);
				if(a==null)
					throw new Exception("Invalid Email Id or password!");
			}
			
			
			return a;
		}
		
		

}