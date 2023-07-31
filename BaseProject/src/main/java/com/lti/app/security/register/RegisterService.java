package com.lti.app.security.register;

import org.springframework.stereotype.Service;


@Service
public interface RegisterService {
	
	String addRegistration(RegisterDTO registerDTO);


}
