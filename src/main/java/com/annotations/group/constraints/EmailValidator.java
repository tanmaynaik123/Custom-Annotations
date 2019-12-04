package com.annotations.group.constraints;

import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.annotations.group.customannotations.ValidateEmail;

public class EmailValidator implements ConstraintValidator<ValidateEmail, String>{
	
	public static final String pattern="^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
	
	final private Pattern emailPattern =Pattern.compile(pattern);
	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		boolean result =emailPattern.matcher(value).matches();
		return result;
	}
}
