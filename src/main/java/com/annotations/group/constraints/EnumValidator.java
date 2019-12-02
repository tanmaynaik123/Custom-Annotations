package com.annotations.group.constraints;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.annotations.group.customannotations.TestInfo;
import com.annotations.group.enums.Colors;

public class EnumValidator implements ConstraintValidator<TestInfo, Enum<?>> {

	
	
	@Override
	public boolean isValid(Enum<?> value, ConstraintValidatorContext context) {
		
		if(value.equals(Colors.BLUE)) {
			return true;
		}
		return false;		
	
	}
}
