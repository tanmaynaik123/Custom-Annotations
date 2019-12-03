package com.annotations.group.customannotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.annotations.group.constraints.EnumValidator;
import com.annotations.group.enums.Colors;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
@Constraint(validatedBy = EnumValidator.class)

public @interface ValidateEnum {

	Colors color();
	
	String message() default "must match \"{color}\"";
	
	Class<?>[] groups() default {};
	
	Class<? extends Payload>[] payload() default {};

}
