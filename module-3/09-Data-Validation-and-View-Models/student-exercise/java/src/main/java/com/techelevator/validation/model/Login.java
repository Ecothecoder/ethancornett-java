package com.techelevator.validation.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

public class Login {
	
	@Email(message = "Please use a valid email")
	@NotBlank(message = "*")
	private String email;
	
	@NotBlank(message = "*")
	private String password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
