package com.annotations.group.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.annotations.group.core.Organization;
import com.annotations.group.repo.IOrganizationRepo;

@RestController
public class OrganizationController {

	@Autowired
	IOrganizationRepo organizationRepo;
	
	 @GetMapping("/organization")
	    List<Organization> findAll() {
	        return organizationRepo.findAll();
	    }

	   
	    @PostMapping("/organization")
		@ResponseStatus(HttpStatus.CREATED)
	    Organization newOrganization(@Valid @RequestBody Organization newOrganization) {
	        return organizationRepo.save(newOrganization);
	    }
	
}
