package com.annotations.group.core;

import javax.validation.constraints.NotNull;

import com.annotations.group.customannotations.ValidateEmail;
import com.annotations.group.customannotations.ValidateFields;

public class UserNotNull {

	
	@ValidateFields(message = "Name cannot be null")
    private String name;
	
	@ValidateFields(message="address cannot be null")
	private String address;

	public UserNotNull(@ValidateFields(message = "Name cannot be null") String name,
			@ValidateFields(message = "address cannot be null") String address) {
		
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
     
	
}
