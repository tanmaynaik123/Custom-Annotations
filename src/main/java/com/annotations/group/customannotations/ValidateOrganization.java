package com.annotations.group.customannotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import com.annotations.group.constraints.OrganizationValidator;

@Target({FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = OrganizationValidator.class)
@Documented
public @interface ValidateOrganization {
	String message() default "Organization is not allowed.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
