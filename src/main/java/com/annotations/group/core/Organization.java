package com.annotations.group.core;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import com.annotations.group.customannotations.ValidateEmail;
import com.annotations.group.customannotations.ValidateOrganization;

@Entity
public class Organization {

	@Id
	@GeneratedValue
	private Long id;
	
	@ValidateOrganization
	@NotEmpty(message="please provide name")
	private String name;
	
	@NotEmpty(message = "please provide department name")
	private String department;
	
	

	public Organization() {
		// TODO Auto-generated constructor stub
	}


	public Organization(@NotEmpty(message = "please provide name") String name,
			@NotEmpty(message = "please provide department name") String department ) {
		
		this.name = name;
		this.department = department;
	
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}



	@Override
	public String toString() {
		return "Organization [id=" + id + ", name=" + name + ", department=" + department + 
				 "]";
	}

}
