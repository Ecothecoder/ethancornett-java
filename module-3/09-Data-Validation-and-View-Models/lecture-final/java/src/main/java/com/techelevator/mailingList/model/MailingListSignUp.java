package com.techelevator.mailingList.model;

import java.time.LocalDate;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;


public class MailingListSignUp {
	
	@NotBlank(message="You must provide your name.")
	private String name;

	@Email(message="Invalid address format.")
	@NotBlank(message="Email address is required.")
	private String email;
	
	private String emailVerification;
	
	@Pattern(regexp="[0-9]{3}-[0-9]{3}-[0-9]{4}", message="Invalid phone number format.")
	private String phone;

	@Range(min=13, max=120, message="That's a ridiculous age!")
	private int age;
	
	@NotNull
	@Future(message="Subscription must start on a future date.")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate subscriptionStartDate;
	

	public LocalDate getSubscriptionStartDate() {
		return subscriptionStartDate;
	}

	public void setSubscriptionStartDate(LocalDate subscriptionStartDate) {
		this.subscriptionStartDate = subscriptionStartDate;
	}

	@AssertTrue(message="Email addresses do not match.")
	public boolean isEmailMatching() {
		boolean result = false;
		if (email != null) {
			result = email.equals(emailVerification);
		}
		return result;
	}
	
	public String getEmailVerification() {
		return emailVerification;
	}

	public void setEmailVerification(String emailVerification) {
		this.emailVerification = emailVerification;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
