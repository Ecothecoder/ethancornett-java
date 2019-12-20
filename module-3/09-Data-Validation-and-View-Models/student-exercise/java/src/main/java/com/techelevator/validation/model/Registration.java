package com.techelevator.validation.model;

import java.time.LocalDate;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

public class Registration {

	@NotBlank(message = "first name not blank")
	@Length(min = 1, max = 20, message = "Must be bewteen 1 and 20 characters")
	private String firstName;

	@NotBlank(message = "last name not blank")
	@Length(min = 1, max = 20, message = "Must be bewteen 1 and 20 characters")
	private String lastName;

	@Email(message = "Invalid address format.")
	@NotBlank(message = "Must be a valid email!")
	private String email;

	private String emailVerification;


	@NotBlank(message = "pass not blank")
	@Length(min = 8, message = "8 Character minimal")
	private String password;

	private String passwordVerification;

	@Past
	@NotNull(message = "date not blank")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate birthDate;

	@NotNull(message = "ticket not blank")
	@Range(min = 1, max = 10, message = "Please choose between 1 and 10")
	private Integer ticketNum;

	@AssertTrue(message = "Email addresses do not match.")
	public boolean isEmailMatching() {
		boolean result = false;
		if (email != null) {
			result = email.equals(emailVerification);
		}
		return result;
	}

	@AssertTrue(message = "Passwords do not match.")
	public boolean isPasswordMatching() {
		boolean result = false;
		if (email != null) {
			result = password.equals(passwordVerification);
		}
		return result;
	}

	public String getEmailVerification() {
		return emailVerification;
	}

	public void setEmailVerification(String emailVerification) {
		this.emailVerification = emailVerification;
	}

	public String getPasswordVerification() {
		return passwordVerification;
	}

	public void setPasswordVerification(String passwordVerification) {
		this.passwordVerification = passwordVerification;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

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

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public Integer getTicketNum() {
		return ticketNum;
	}

	public void setTicketNum(Integer ticketNum) {
		this.ticketNum = ticketNum;
	}

}
