package com.annotations.group;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.BeforeClass;
import org.junit.Test;

import com.annotations.group.core.CheckContraints;
import com.annotations.group.core.TestEnumValidator;
import com.annotations.group.core.UserNotNull;
import com.annotations.group.enums.Colors;

public class AnnotationTest {

	private static Validator validator;


	@BeforeClass
	public static void init() {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		validator = factory.getValidator();
	}

	@Test
	public void checkWhenFieldsValuesAre_Null() {

		UserNotNull userNotNull = new UserNotNull(null,null);
		Set<ConstraintViolation<UserNotNull>>  voilation =validator.validate(userNotNull);
		assertThat(voilation.size()).isEqualTo(0);
	}

	@Test
	public void checkWhenFieldsValuesAre_StringTypeNull() {

		UserNotNull userNotNull = new UserNotNull("null","null");
		Set<ConstraintViolation<UserNotNull>>  voilation =validator.validate(userNotNull);
		assertThat(voilation.size()).isEqualTo(0);
	}

	@Test
	public void checkWhenFieldsValuesAre_Empty() {

		UserNotNull userNotNull = new UserNotNull("","");
		Set<ConstraintViolation<UserNotNull>>  voilation =validator.validate(userNotNull);
		assertThat(voilation.size()).isEqualTo(0);
	}

	@Test
	public void checkWhenFieldsValuesAre_NotEmpty() {

		UserNotNull userNotNull = new UserNotNull("BOB","A/Wing");
		Set<ConstraintViolation<UserNotNull>>  voilation =validator.validate(userNotNull);
		assertThat(voilation.size()).isEqualTo(1);
	}


	@Test
	public void checkForEnumsValidations() {
		TestEnumValidator testEnumValidator = new TestEnumValidator(Colors.RED);
		Set<ConstraintViolation<TestEnumValidator>>  voilationsEnum =validator.validate(testEnumValidator);
		assertThat(voilationsEnum.size()).isEqualTo(1);
	}


	@Test
	public void checkForEmail() {
		CheckContraints  testEmail = new CheckContraints("abc1pgmail.com");
		Set<ConstraintViolation<CheckContraints>>  voilationEmail= validator.validate(testEmail);
		assertThat(voilationEmail.size()).isEqualTo(1);
	}
}
