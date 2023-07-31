package com.lti.app.security.register;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
@Table(name="Registration")		//Table Name
public class RegisterEntity {

	@Id
	@Column(name="email", length = 255)
	private String email;
	
	@Column(name="registerId", length = 45)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int registerId;
	
	@Column(name="registerName", length = 255)
	private String registerName;
	
	@Column(name="password", length = 255)
	private String password;	
	
}
