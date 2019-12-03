package com.annotations.group.core;

import com.annotations.group.customannotations.ValidateEnum;
import com.annotations.group.enums.Colors;


public class TestEnumValidator {

	@ValidateEnum(color=Colors.BLUE)
	private Colors color ;

	
	
	public TestEnumValidator(Colors color) {
		
		this.color = color;
	}

	public Colors getColor() {
		return color;
	}

	public void setColor(Colors color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "TestEnumValidator [color=" + color + "]";
	}
	
	
}
