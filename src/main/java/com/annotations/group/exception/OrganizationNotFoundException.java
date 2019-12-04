package com.annotations.group.exception;

public class OrganizationNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1796133349302773861L;
	
	 public OrganizationNotFoundException(Long id) {
	        super("Book id not found : " + id);
	    }

}
