package com.lti.app.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.lti.app.dto.Imagedto;
import com.lti.app.pojo.AdminLogin;
import com.lti.app.pojo.Customer;
import com.lti.app.pojo.EmiCalculator;
import com.lti.app.pojo.Image;
import com.lti.app.pojo.LoanDetails;
import com.lti.app.pojo.UserLogin;
import com.lti.app.repo.LoanRepo;
import com.lti.app.service.AdminLoginService;
import com.lti.app.service.CustomerService;
import com.lti.app.service.EmiCalculatorService;
import com.lti.app.service.ImageService;
import com.lti.app.service.LoanService;
import com.lti.app.service.UserLoginService;


@RestController
@RequestMapping("/rest/api")
@CrossOrigin("http://localhost:4200")
public class MyRestController {
	
		
		@Autowired
		CustomerService custservice;
		
		@Autowired
		private EmiCalculatorService emiservice;
				
		@GetMapping("/customers")
		public List<Customer> getAllCustomers(){
			return custservice.getCustomers();
		}
		
		@PostMapping("/customers")
		public boolean addCustomer(@RequestBody Customer customer) {
			custservice.addCustomers(customer);

			return true;
			
		}
		
		@PutMapping("/customers")
		public boolean updateProduct(@RequestBody Customer customer)
		{
			return custservice.updateCustomer(customer);

		}
//--------------------------------EMI----------------------------------------------		
		@GetMapping("/customers/emi")
		public List<EmiCalculator> getAllEmi(){
			return emiservice.getemi();
		}
		
		@PostMapping("/customers/emi")
		public EmiCalculator emicalculation(@RequestBody EmiCalculator emi) {
			return emiservice.calculatemi(emi);
			
		}
		
		@PutMapping("/customers/emi")
		public boolean emicalculationdata(@RequestBody EmiCalculator emi) {
			 emiservice.emidata(emi);
			 return true;
		}
		
		
		@PutMapping("/customers/emi/loanoffer1")
		public Double loanoffers1(@RequestBody EmiCalculator emi) {
			return emiservice.loanoffer1(emi);
		}
		
		@PutMapping("/customers/emi/loanoffer2")
		public Double loanoffers2(@RequestBody EmiCalculator emi) {
			return emiservice.loanoffer2(emi);
		}
		@PutMapping("/customers/emi/loanoffer3")
		public Double loanoffers3(@RequestBody EmiCalculator emi) {
			return emiservice.loanoffer3(emi);
		}
		
//-----------------------------IMAGE UPLOAD-----------------------------------------		
		@Autowired
		ImageService imgService;
		
		/*
		@PostMapping("/customers/pic-upload")
		public boolean upload(Imagedto imagedto) {
			String imageUploadLocation = "d:/uploads/";
			String fileName = imagedto.getImagefile().getOriginalFilename();
			String targetFile = imageUploadLocation + fileName;
			try {
				FileCopyUtils.copy(imagedto.getImagefile().getInputStream(), new FileOutputStream(targetFile));
			} catch (IOException e) {
				return false;
			}

			Image image = new Image(fileName);
			imgService.addImage(image);
			return true;
		}
*/
		
		@PostMapping(value = "/customers/image")
		public void postImage(@RequestParam("file") MultipartFile file){
			String imageUploadLocation = "D:/LTI/Training/MainProject/project/Angular/VehicleLoan/src/assets";
			String fileName = file.getOriginalFilename();
			String targetFile = imageUploadLocation + fileName;
			Image img = new Image();
			try {
				FileCopyUtils.copy(file.getInputStream(), new FileOutputStream(targetFile));
			} catch (IOException e) {
				e.getMessage();
			}

			Image image = new Image(fileName);
			imgService.addImage(image);
		}
		
		@GetMapping(value="/customers/image")
		public List<Image> getAll(){
			return imgService.getAll();
		}

	//---------------------------------------ADMIN LOGIN-------------------------------------------	
		
		
			@Autowired
			AdminLoginService aService;
			
//			ONLY ONE ADMIN WILL BE ALLOWED HAVING "admin@gmail.com" AS EMAIL ID AND "admin" AS PASSWORD.
//			select * from admin_login_details;
		//  
//			insert into admin_login_details values('1','admin@gmail.com','admin');
		//	
		//	

			
			@PostMapping("/admin/adminLogin")

			public AdminLogin loginAdmin(@RequestBody AdminLogin adminLogin) throws Exception
			{
				return aService.loginAdmin(adminLogin);
			}

//---------------------------------------USERLOGIN-----------------------------------------------------------------	
		
			
			@Autowired
			UserLoginService uService;
			
			@PostMapping("/customers/userRegister")
			
			public UserLogin registerUser(@RequestBody UserLogin user) throws Exception 
			{
				return uService.saveUser(user);
			}
			
			
			@PostMapping("/customers/userLogin")

			public UserLogin loginUser(@RequestBody UserLogin user) throws Exception
			{
				return uService.loginUser(user);
			}
			
			
			@GetMapping("/customers/getUserById/{userId}")
			public UserLogin getUserById(@PathVariable("userId") int userId)
			{
				return uService.getUserById(userId);
			}
			
			
//---------------------------------------------LoanStatus--------------------------------------------------------
			
			
			
			@Autowired
			LoanService lService;
			
			
			@PutMapping("/customers/loanapp")
			public boolean loanStatus1(@RequestBody LoanDetails lr) {
				return true;
			}
			

			@PutMapping("/customers/loanrej")
			public String loanStatus2(@RequestBody LoanDetails lr) {
				return lService.updateLoanrej(lr);
			}
			
			@PutMapping("/customers/loanstatus")
			public String loanStatus3(@RequestBody LoanDetails lr) {
				return lService.getstatus(lr);
			}
			
			
			@PutMapping("/customers/loan")
			public boolean addLoan(@RequestBody LoanDetails lr) {
				lService.addLoan(lr);
				 return true;
				
			}
			
			@GetMapping("/customers/loan")
			public List<LoanDetails> getloandetails(){
				return lService.getLoandetails();
			}

			
			
			
			
			
			
		@GetMapping("/customers/{custemail}")
		public Customer findCustomer(@PathVariable(name = "custemail") String custemail)
		{
		return custservice.searchCustomerByEmail(custemail);
		}

		@DeleteMapping("/customers/{custemail}")
		public boolean deleteCustomer(@PathVariable(name="custemail") String custemail) {
			Customer customer = custservice.searchCustomerByEmail(custemail);
			return custservice.deleteCustomer(customer);
			
		}

}



		
	
