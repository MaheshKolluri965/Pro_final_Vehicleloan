package com.lti.app.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "admindetails")
public class AdminLogin {
		@Id
		@Column(name="adminid")
		private int id;
		
		@Column(name="adminemailid")
		private String emailid;
		
		@Column(name="adminpassword")
		private String password;

		public AdminLogin() {
			super();
			// TODO Auto-generated constructor stub
		}

		public AdminLogin(int id, String emailid, String password) {
			super();
			this.id = id;
			this.emailid = emailid;
			this.password = password;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getEmailid() {
			return emailid;
		}

		public void setEmailid(String emailid) {
			this.emailid = emailid;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		
		
			
		
	
}
