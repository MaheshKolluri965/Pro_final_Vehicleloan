package com.lti.app.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "userlogindetails")

public class UserLogin {
		
		@Id
		@SequenceGenerator(name = "userid", sequenceName = "userid", allocationSize = 1)
		@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "userid")
		@Column(name="userid")
		private int userid;
		
		@Column(name="useremail", length=30)
		private String useremailid;
		
		@Column(name="userpassword", length=30)
		private String userpassword;
		
		
		





		public UserLogin() {
			super();
			// TODO Auto-generated constructor stub
		}

		public UserLogin(int userid, String useremailid, String userpassword) {
			super();
			this.userid = userid;
			this.useremailid = useremailid;
			this.userpassword = userpassword;
		}

		@Override
		public String toString() {
			return "UserLogin [userid=" + userid + ", useremailid=" + useremailid + ", userpassword=" + userpassword
					+ "]";
		}

		public int getUserid() {
			return userid;
		}

		public void setUserid(int userid) {
			this.userid = userid;
		}

		public String getUseremailid() {
			return useremailid;
		}

		public void setUseremailid(String useremailid) {
			this.useremailid = useremailid;
		}

		public String getUserpassword() {
			return userpassword;
		}

		public void setUserpassword(String userpassword) {
			this.userpassword = userpassword;
		}

				
}
