package com.annotations.group.core;

import javax.persistence.Entity;

import com.annotations.group.customannotations.TestInfo;
import com.annotations.group.enums.Colors;

@Entity
public class TestEnumValidator {

	@TestInfo(color=Colors.BLUE)
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
