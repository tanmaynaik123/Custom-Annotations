package com.annotations.group.core;

import com.annotations.group.customannotations.ValidateEmail;

public class CheckContraints {

	@ValidateEmail
	private String email;

	public CheckContraints(@ValidateEmail String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
	
	
}
