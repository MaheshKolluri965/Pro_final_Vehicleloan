package com.lti.app.service;

import com.lti.app.pojo.Customer;
import com.lti.app.pojo.UserLogin;

public interface UserLoginService {

	UserLogin saveUser(UserLogin user) throws Exception;

	UserLogin loginUser(UserLogin user) throws Exception;

	UserLogin getUserById(int userid);

}
