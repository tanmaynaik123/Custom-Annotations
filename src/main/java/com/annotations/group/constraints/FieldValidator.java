package com.annotations.group.constraints;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.annotations.group.customannotations.ValidateFields;

public class FieldValidator implements ConstraintValidator<ValidateFields, String> {

	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		
			return  "null".equalsIgnoreCase(value)? true : value==null ? true : 
				value.equals("") ? true :false;
			
	}

}
