package com.annotations.group.constraints;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.annotations.group.customannotations.ValidateOrganization;

public class OrganizationValidator implements ConstraintValidator<ValidateOrganization, String> {

    List<String> organization = Arrays.asList("Mastek");

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        return organization.contains(value);

    } 
}


