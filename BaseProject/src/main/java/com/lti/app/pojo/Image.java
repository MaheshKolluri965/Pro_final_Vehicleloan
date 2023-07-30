package com.lti.app.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="image")
public class Image {

	@Id
	@Column(name = "imagename", length = 30)
	private String imagename;

	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Image(String imagename) {
		super();
		this.imagename = imagename;
	}

	public String getImagename() {
		return imagename;
	}

	public void setImagename(String imagename) {
		this.imagename = imagename;
	}
	

@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="custemailid",referencedColumnName = "custemailid")
private Customer customer;
	

/*
	@Id
	@Column(name = "emailid", length= 50)
	private String email;

	@Column(name = "imagename", length = 30)
	private String imagename;

	
	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Image(String email, String imagename) {
		super();
		this.email = email;
		this.imagename = imagename;
	}


	@Override
	public String toString() {
		return "Image [email=" + email + ", imagename=" + imagename + "]";
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getImagename() {
		return imagename;
	}


	public void setImagename(String imagename) {
		this.imagename = imagename;
	}
*/	
	
	
	
	
}
